package kcp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/crossUrl2")
public class CrossContextComm2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw=null;
		response.setContentType("text/html");
		pw=response.getWriter();
		double num=Double.parseDouble(request.getParameter("num"));
		double cubeValue=num*num*num;
		pw.println("<br>");
		pw.println("<h1><style='color:green;text-align:center'>cube value is" + cubeValue + "</h>");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
