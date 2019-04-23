package pizzeria.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/poista-pizza")
public class PoistaPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PoistaPizzaServlet() {
        super();
 
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("pizzaId");
		System.out.print(id);
		
		response.sendRedirect("http://localhost:8080/PIzzeria/listaa-pizzat");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
