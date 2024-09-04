
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Home() {
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		String mensagem = "Logado com sucesso!";
		if (!"123456".equals(senha)) {
			mensagem = "Login inválido";
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html> ");
		out.println("<head> ");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=ISO-8859-1'> ");
		out.println("<title>Insert title here</title> ");
		out.println("</head> ");
		out.println("<body> ");
		out.println(" Nome: " + nome + " <br> ");
		out.println(" <b> " + mensagem + "</b> ");
		out.println("</body> ");
		out.println("</html> ");

	}

}
