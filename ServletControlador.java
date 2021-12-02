package br.com.login.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.cojm.login.model.Login;
import br.cojm.login.model.SIstemaLogin;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		SIstemaLogin sistema = (SIstemaLogin) getServletContext().getAttribute(ContextListener.SISTEMA_LOGIN);
		
		String resposta1 = "login.jsp";
	
		if("Login".equals(acao)) {
			resposta1 = "Login.jsp";
		
		} else if ("Login".equals(acao)) {
			
			Login l = new Login();			
			l.setUsarioProfessor(request.getParameter("UsarioProfessor"));
			l.setSenha(request.getParameter("senha"));
			l.setData(new Date(0));
			sistema.adicionar(l);
			request.setAttribute("login", sistema.consultar());
			resposta1 = "login.jsp";
			
		} else if ("login".equals(acao)) {
			
			request.setAttribute("login", sistema.consultar());
			resposta1 = "login.jsp";
			
		}
		request.getRequestDispatcher(resposta1).forward(request, response);
	} 

}

