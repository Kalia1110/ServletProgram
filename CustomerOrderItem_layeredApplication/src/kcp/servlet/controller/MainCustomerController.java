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
 * Servlet implementation class MainCustomerController
 */
@WebServlet("/controller")
public class MainCustomerController extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		CustomerDTO dto;
		CustomerVO vo;
		String customerName, customerAddress, orderItem;
		String price;
		String quentity;
		customerName=req.getParameter("name");
		customerAddress=req.getParameter("add");
		orderItem=req.getParameter("item");
		price=req.getParameter("price");
		quentity=req.getParameter("que");
		
		vo=new CustomerVO();
		vo.setCustomerName(customerName);
		vo.setCustomerAddress(customerAddress);
		vo.setOrderItem(orderItem);
		vo.setPrice(price);
		vo.setQuentity(quentity);
		
		dto=new CustomerDTO();
		dto.setCustomerName(vo.getCustomerName());
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setOrderItem(vo.getOrderItem());
		dto.setPrice(Double.parseDouble(vo.getPrice()));
		dto.setQuentity(Integer.parseInt(vo.getQuentity()));
		
		CustomerService service=new CustomerServiceImpl();
		String result;
		try {
			result=service.ProcessData(dto);
			pw.println("<h1>result is"+result+"</h1>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
