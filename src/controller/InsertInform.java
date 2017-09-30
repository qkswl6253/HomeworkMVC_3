package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Order;

/**
 * Servlet implementation class InsertInform
 */
@WebServlet("/insertinform")
public class InsertInform extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertInform() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/*String item_Number = "No Value";
		if (request.getParameter("Item_Number") != null)
			item_Number = request.getParameter("Item_Number").toString();
			
		String description = "No Value";
		if (request.getParameter("Description") != null)
			description = request.getParameter("Description");
		String price_Each = "No Value";
		if (request.getParameter("Price_Each") != null)
			price_Each = request.getParameter("Price_Each");
		String first_Name = "No Value";
		if (request.getParameter("First_Name") != null)
			first_Name = request.getParameter("First_Name");
		String last_Name = "No Value";
		if (request.getParameter("Last_Name") != null)
			last_Name = request.getParameter("Last_Name");
		String middle_Initial = "No Value";
		if (request.getParameter("Middle_Initial") != null)
			middle_Initial = request.getParameter("Middle_Initial");
		String shipping_Address = "No Value";
		if (request.getParameter("Shipping_Address") != null)
			shipping_Address = request.getParameter("Shipping_Address");
		String credit_Card = "No Value";
		if (request.getParameter("Credit_Card") != null)
			credit_Card = request.getParameter("Credit_Card");
		String credit_Card_Number = "No Value";
		if (request.getParameter("Credit_Card_Number") != null)
			credit_Card_Number = request.getParameter("Credit_Card_Number");
		String reCredit_Card_Number = "No Value";
		if (request.getParameter("ReCredit_Card_Number") != null)
			reCredit_Card_Number = request.getParameter("ReCredit_Card_Number");
		 */
		String item_Number = request.getParameter("Item_Number");
		String description = request.getParameter("Description");
		String price_Each = request.getParameter("Price_Each");
		String first_Name = request.getParameter("First_Name");
		String last_Name = request.getParameter("Last_Name");
		String middle_Initial = request.getParameter("Middle_Initial");
		String shipping_Address = request.getParameter("Shipping_Address");
		String credit_Card = request.getParameter("Credit_Card");
		String credit_Card_Number = request.getParameter("Credit_Card_Number");
		String reCredit_Card_Number = request.getParameter("ReCredit_Card_Number");
		
		String page = null;

		if (!credit_Card_Number.equals(reCredit_Card_Number) || credit_Card_Number==null)
			page = "/errorform.jsp";
		else
			page = "/view/order.jsp";

		Order order = new Order(item_Number, description, price_Each, first_Name, last_Name, middle_Initial,

				shipping_Address, credit_Card, credit_Card_Number);

		request.setAttribute("order", order);

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}
}
