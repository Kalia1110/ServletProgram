package kcp.servlet.sendRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendredirctUrl")
public class SendRedirect extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String search = request.getParameter("name");
		String engine = request.getParameter("engg");
		String url = null;
		if (engine.equalsIgnoreCase("google")) {
			url = "https://www.google.com/search?q=" + search;
		} else if (engine.equalsIgnoreCase("bing")) {
			url = "https://www.bing.com/search?q=" + search;
		} else if (engine.equalsIgnoreCase("ask")) {
			url = "https://www.ask.com/search?q=" + search;
		} else {
			url = "https://in.search.yahoo.com/search?p=" + search;
		}
		response.sendRedirect(url);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
