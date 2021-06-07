package com.curriculum.account.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.curriculum.account.model.Account;
import com.curriculum.account.repository.IAccountRepository;

@Service("userDetailsService")
public class UserServiceImpl implements UserDetailsService {
	
	@Autowired
	private IAccountRepository userDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account user = userDAO.findByusername(username); //from usuario where username := username
		
		if (user == null) {
			throw new UsernameNotFoundException(String.format("Usuario no existe", username));
		}
		if(user.getEnabled().equals(false)) {
			throw new UsernameNotFoundException(String.format("Usuario se encuentra bloqueado", username));
		}
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		user.getProfils().forEach( role -> {
			authorities.add(new SimpleGrantedAuthority(role.getRol()));
		});
		
		UserDetails userDetails = new User(user.getUsername(), user.getPassword(), authorities);
		
		return userDetails;
	}

}
