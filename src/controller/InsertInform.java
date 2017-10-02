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
		
		String item_Number = "No Value";
		if (!request.getParameter("Item_Number").equals(""))
			item_Number = request.getParameter("Item_Number");
			
		String description = "No Value";
		if (!request.getParameter("Description").equals(""))
			description = request.getParameter("Description");
		
		String price_Each = "No Value";
		if (!request.getParameter("Price_Each").equals(""))
			price_Each = request.getParameter("Price_Each");
	
		String first_Name = "No Value";
		if (!request.getParameter("First_Name").equals(""))
			first_Name = request.getParameter("First_Name");
		
		String last_Name = "No Value";
		if (!request.getParameter("Last_Name").equals(""))
			last_Name = request.getParameter("Last_Name");
		
		String middle_Initial = "No Value";
		if (!request.getParameter("Middle_Initial").equals(""))
			middle_Initial = request.getParameter("Middle_Initial");
		
		String shipping_Address = "No Value";
		if (!request.getParameter("Shipping_Address").equals(""))
			shipping_Address = request.getParameter("Shipping_Address");
		
		String credit_Card = "No Value";
		if (!request.getParameter("Credit_Card") .equals(""))
			credit_Card = request.getParameter("Credit_Card");
		
		String credit_Card_Number = request.getParameter("Credit_Card_Number");
		
		String reCredit_Card_Number = request.getParameter("ReCredit_Card_Number");
		 
		/*
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
		*/
		String page = null;

		if (Check_Credit_Number(credit_Card_Number,reCredit_Card_Number))
			page = "/view/order.jsp";
			
		else
			page = "/errorform.jsp";

		Order order = new Order(item_Number, description, price_Each, first_Name, last_Name, middle_Initial,

				shipping_Address, credit_Card, credit_Card_Number);

		request.setAttribute("order", order);

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}
	
	
	public boolean Check_Credit_Number(String Card_num, String ReCard_Num ){
		if(Card_num.equals("") || !Card_num.equals(ReCard_Num))
			return false;
		else
			return true;
	}
	
	
	
}
