package kcp.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kcp.servlet.dto.CustomerDTO;
import kcp.servlet.service.CustomerService;
import kcp.servlet.service.CustomerServiceImpl;
import kcp.servlet.vo.CustomerVO;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/MainController")
public class MainController extends HttpServlet {
	CustomerService service = null;
	CustomerVO vo = null;
	CustomerDTO dto = null;

	@Override
	public void init() throws ServletException {
		service = new CustomerServiceImpl();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String customerName, age, source, destination, distance, customerAddress;
		customerName = req.getParameter("name");
		age = req.getParameter("age");
		customerAddress = req.getParameter("add");
		source = req.getParameter("source");
		destination = req.getParameter("desti");
		distance = req.getParameter("km");
		
		vo = new CustomerVO();
		vo.setCustomerName(customerName);
		vo.setAge(age);
		vo.setCustomerAddress(customerAddress);
		vo.setSourse(source);
		vo.setDestinaton(destination);
		vo.setDistance(distance);
		
		dto = new CustomerDTO();
		dto.setCustomerName(vo.getCustomerName());
		dto.setAge(Integer.parseInt(vo.getAge()));
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setSourse(vo.getSourse());
		dto.setDestinaton(vo.getDestinaton());
		dto.setDistance(Double.parseDouble(vo.getDistance()));
	
		try {
			String result = service.processData(dto);
			pw.println("<h1>result is" + result + "</h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		doGet(req, res);
	}

}
