package br.com.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.com.login.models.SistemaCadastro;
import br.com.login.models.cadastro;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
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
		
		SistemaCadastro sistema1 = (SistemaCadastro) getServletContext().getAttribute(ContextListenerCadast.Sistema_Cadastro);
		
		String resposta = "cadastro.jsp";
		
		if ("cadastro".equals(acao)) {
			
			cadastro c = new cadastro();			
			c.setNomePessoa(request.getParameter("nomePessoa"));
			c.setNomeDisciplina(request.getParameter("nomeDisciplina"));
			sistema1.adicionar(c);
			request.setAttribute("cadastro", sistema1.consultar());
			resposta = "cadastro.jsp";
			
		}
		
		request.getRequestDispatcher(resposta).forward(request, response);
	} 

}

