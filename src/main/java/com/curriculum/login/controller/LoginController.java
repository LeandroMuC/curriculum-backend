package com.curriculum.login.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curriculum.account.model.Account;
import com.curriculum.login.model.ResetToken;
import com.curriculum.login.service.ILoginServiceImpl;
import com.curriculum.login.service.IResetTokenService;
import com.curriculum.util.EmailUtil;
import com.curriculum.util.Mail;

@RestController
@RequestMapping("/Login")
public class LoginController {
	@Autowired
    private ILoginServiceImpl service;
    @Autowired
    private IResetTokenService tokenService;
    @Autowired
    private EmailUtil emailUtil;
    @Autowired
    private BCryptPasswordEncoder bcrypt;
    
    @PostMapping(value="/enviarCorreo",consumes=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<Integer>enviarCorreo(@RequestBody String correo){
		int rpta=0;
		try {
			Account ac=service.verificaNombreUsuario(correo);
			if(ac!=null && ac.getIdAccount()!=null && ac.getEnabled()==true) {
				ResetToken token=new ResetToken();
				token.setToken(UUID.randomUUID().toString());
				token.setAccount(ac);
				token.setExpiracion(30);
				tokenService.guardar(token);
				Mail mail=new Mail();
				mail.setFrom("leandro.munoz@econtinuum.cl");
				mail.setTo(ac.getUsername());
				mail.setSubject("Restablecer Contraseña");
                Map<String, Object> model = new HashMap<>();
                String url = "http://localhost:4200/recuperar/" + token.getToken();
                model.put("user", ac.getUsername());
                model.put("resetUrl", url);
                mail.setModel(model);
				emailUtil.enviarMail(mail);
				
				rpta=1;
			}else if(ac.getEnabled()==false) {
				rpta=3;
			}
		}
		catch(Exception e){
			return new ResponseEntity<Integer>(rpta,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Integer>(rpta,HttpStatus.OK);
	}
	@GetMapping(value = "/restablecer/verificar/{token}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> restablecerClave(@PathVariable("token") String token) {
		int rpta = 0;
		try {
			if (token != null && !token.isEmpty()) {
				ResetToken rt = tokenService.findByToken(token);
				if (rt != null && rt.getId() > 0) {
					if (!rt.isExpirado()) {
						rpta = 1;
					}
				}
			}
		} catch (Exception e) {
			return new ResponseEntity<Integer>(rpta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Integer>(rpta, HttpStatus.OK);
	}
	@PostMapping(value = "/restablecer/{token}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> restablecerClave(@PathVariable("token") String token, @RequestBody String clave) {
		int rpta = 0;
		try {
			ResetToken rt = tokenService.findByToken(token);
			String claveHash = bcrypt.encode(clave);
			rpta = service.cambiarPassword(claveHash, rt.getAccount().getUsername());
			tokenService.eliminar(rt);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(rpta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Integer>(rpta, HttpStatus.OK);
	}

}
