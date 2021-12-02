package br.com.login.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.login.models.SistemaCadastro;

@WebListener
public class ContextListenerCadast implements ServletContextListener {


	public static final String Sistema_Cadastro = "SistemaCadastro";
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.setAttribute(Sistema_Cadastro , new SistemaCadastro());
		
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.removeAttribute(Sistema_Cadastro);

}
}
