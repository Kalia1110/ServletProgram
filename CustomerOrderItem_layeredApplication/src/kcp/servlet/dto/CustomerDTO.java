package kcp.servlet.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	String customerName, customerAddress,OrderItem;
	int  quentity;
	double price;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getOrderItem() {
		return OrderItem;
	}

	public void setOrderItem(String orderItem) {
		OrderItem = orderItem;
	}

	public int getQuentity() {
		return quentity;
	}

	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
