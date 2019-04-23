package pizzeria.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pizzeria.model.Pizza;
import pizzeria.model.dao.PizzaDAO;

/**
 * Servlet implementation class LisaaUusiPizzaServlet
 */
@WebServlet("/lisaa_pizza")
public class LisaaUusiPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LisaaUusiPizzaServlet() {
        super();
   
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jsp = "/view/pizzalomake.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		String pizzaName = request.getParameter("pizzaName");
		String pizzaDescription = request.getParameter("pizzaDescription");
		String pizzaPrice = request.getParameter("pizzaPrice");
		Double dpizzaPrice = Double.parseDouble(pizzaPrice);
		int pizzaid = 0;
		
		Pizza pizza = new Pizza(pizzaid, pizzaName, pizzaDescription, dpizzaPrice);
		
		PizzaDAO pizzadao = new PizzaDAO();
		
		pizzadao.addPizza(pizza);

		}catch(SQLException e) {
			
		}
		
		response.sendRedirect("http://localhost:8080/PIzzeria/listaa-pizzat");
	//	String jsp = "/view/pizzalista.jsp";
	//	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
	//	dispatcher.forward(request, response);
	//	doGet(request, response);
	}

}
