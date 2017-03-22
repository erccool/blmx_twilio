package net.tutorial.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.tutorial.utilities.TwilioService;

@WebServlet({"home",""})
public class MainController extends HttpServlet {
	RequestDispatcher dispatcher;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sendTo = req.getParameter("send-to");
		String message = req.getParameter("message");
		
		TwilioService ts = new TwilioService();
		System.out.println(ts.sendMessage(message, sendTo));
		
		resp.sendRedirect("home");
	
	}
}
