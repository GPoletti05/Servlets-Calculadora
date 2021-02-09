

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/calcular")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double valor1 = Double.parseDouble(request.getParameter("valor1"));
		double valor2 = Double.parseDouble(request.getParameter("valor2"));
		
		String operacao = request.getParameter("operacao");
		
		double resultado = 0;
		
		if (operacao.equals("+")) {
			resultado = valor1+valor2;
		} else if(operacao.equals("-")) {
			resultado = valor1-valor2;
		} else if(operacao.equals("*")) {
			resultado = valor1*valor2;
		} else if(operacao.equals("/")) {
			resultado = valor1/valor2;
		}
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("O Resultado é: "+resultado);
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
