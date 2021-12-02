package br.com.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.login.models.SistemaMenu;
import br.com.login.models.menu;

/**
 * Servlet implementation class ServletMenu
 */
@WebServlet("/ServletMenu")
public class ServletMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMenu() {
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
		
		SistemaMenu sistema = (SistemaMenu) getServletContext().getAttribute(ContextListenerCadast.Sistema_Cadastro);
		
		String resposta = "menu.jsp";
		
		if ("menu".equals(acao)) {
			
			menu m = new menu();			
			m.setConsultar(request.getParameter("Consultar"));
			m.setDisciplinas(request.getParameter("Disciplina"));
			m.setCadastro(request.getParameter("Cadastro"));
			m.setHeader(request.getParameter("Header"));
			sistema.adicionar(m);
			request.setAttribute("menu", sistema.menu());
			resposta = "menu.jsp";
			
		}
		
		request.getRequestDispatcher(resposta).forward(request, response);
	} 

}
