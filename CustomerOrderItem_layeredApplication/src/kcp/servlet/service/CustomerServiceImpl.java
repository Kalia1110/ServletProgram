package kcp.servlet.service;

import kcp.servlet.bo.CustomerBO;
import kcp.servlet.dao.CustomerDAO;
import kcp.servlet.dao.CustomerDAOImpl;
import kcp.servlet.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {
	CustomerDAO dao = new CustomerDAOImpl();

	@Override
	public String ProcessData(CustomerDTO dto) throws Exception {
		CustomerBO bo = null;
		double discountAmount;
		double payAmount;
		double billAmount;
		billAmount = dto.getPrice() * dto.getQuentity();
		if (billAmount > 500000) {
			discountAmount = billAmount / 10;
		} else {
			discountAmount = billAmount / 5;
		}
		payAmount = billAmount - discountAmount;
		bo = new CustomerBO();
		bo.setCustomerName(dto.getCustomerName());
		bo.setBillAmount(billAmount);
		bo.setDiscountAmount(discountAmount);
		bo.setFinalAmount(payAmount);
		int Count = dao.InsertData(bo);
		if (Count == 1) {
			return " successed " + discountAmount;
		} else {
			return "fail";
		}

	}

}
