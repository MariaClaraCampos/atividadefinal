package br.com.login.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.login.models.SistemaMenu;

@WebListener
public class ContextListenerMenu implements ServletContextListener {

	private static final String Sistema_Menu = "SistemaMenu";

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.setAttribute(Sistema_Menu, new SistemaMenu());
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.removeAttribute(Sistema_Menu);
		
	}
	
	

	
}
