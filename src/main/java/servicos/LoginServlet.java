package servicos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//carrega o formulário de login
		String location = "formulario-login.jsp";
		response.sendRedirect(location);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recebe os dados de login e checa se existe, se existir envia para a tela principal do sistema se não envia para o formulário de login
		String email;
		String senha;
		String nome;
		String location;
		
		email = request.getParameter("email");
		senha = request.getParameter("senha");
		nome = request.getParameter("nome");
		
		if (email.equals("armando@ufpi.edu.br") && senha.equals("123456")) {
			request.setAttribute("email", email);
			request.setAttribute("nome", nome);
			location = "tela-principal.jsp";
			request.getRequestDispatcher(location).forward(request, response);
		}else {
			location = "formulario-login.jsp";
			response.sendRedirect(location);
		}
	}

}
