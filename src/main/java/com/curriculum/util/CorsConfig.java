package com.curriculum.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsConfig implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletResponse resp=(HttpServletResponse) response;
		HttpServletRequest req=(HttpServletRequest) request;
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "DELETE, GET, OPTIONS, PATCH, POST, PUT");
		resp.setHeader("Access-Control-Max-Age", "3600");
		resp.setHeader("Access-Control-Allow-Headers","x-request-with,authorization, Content-Type, Authorization, credential, X-XSRF-TOKEN");
		if("OPTIONS".equalsIgnoreCase(req.getMethod())) {
			resp.setStatus(HttpServletResponse.SC_OK);
		}
		else {
			chain.doFilter(req, resp);
		}
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	

}
