package kcp.servlet.service;

import java.util.Random;

import kcp.servlet.bo.CustomerBO;
import kcp.servlet.dao.CustomerDAO;
import kcp.servlet.dao.CustomerDAOImpl;
import kcp.servlet.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {
	CustomerDAO dao = null;
	CustomerBO bo = null;
	double discountAmount = 0;
	double PayAmount;
	int pNRno;

	public CustomerServiceImpl() {
		dao = new CustomerDAOImpl();
	}

	@Override
	public String processData(CustomerDTO dto) throws Exception {
		int age = dto.getAge();
		double p = dto.getDistance() *0.5;
		if (age > 60) {
			discountAmount = p / 5;
		} else {
			discountAmount = 0;
		}
		PayAmount = p - discountAmount;
		pNRno = new Random().nextInt(987654321);
		bo=new CustomerBO();
		bo.setCustomerName(dto.getCustomerAddress());
		bo.setPNRno(pNRno);
		bo.setSource(dto.getSourse());
		bo.setDestination(dto.getDestinaton());
		bo.setDistance(dto.getDistance());
		bo.setPrice(p);
		bo.setDiscountAmount(discountAmount);
		bo.setTotalPrice(PayAmount);
		int result = dao.insrtData(bo);
		if (result == 1) {
			return "Successed";
		} else {
			return "failed";
		}
	}

}
