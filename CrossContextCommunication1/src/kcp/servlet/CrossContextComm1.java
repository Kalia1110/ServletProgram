package kcp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/crossUrl")
public class CrossContextComm1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = null;
		ServletContext sc1 = null, sc2 = null;
		RequestDispatcher rd1=null;
		pw = response.getWriter();
		response.setContentType("text/html");
		double num = Double.parseDouble(request.getParameter("num"));
		double squareValue = num * num;
		pw.println("<h1><style='color:green;text-align:center'>square value is" + squareValue + "</h>");
		sc1=getServletContext();
		sc2=sc1.getContext("/CrossContextComm2");//given 2nd project name
		rd1=sc2.getRequestDispatcher("/crossUrl2");
		rd1.include(request, response);
		pw.close();
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
