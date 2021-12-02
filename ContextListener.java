package br.com.login.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


import br.cojm.login.model.SIstemaLogin;

@WebListener
public class ContextListener implements ServletContextListener {

	public static final String SISTEMA_LOGIN = "SIstemaLogin";

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.setAttribute(SISTEMA_LOGIN , new SIstemaLogin());
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.removeAttribute(SISTEMA_LOGIN);
		
	}
}
	
