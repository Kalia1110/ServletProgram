package kcp.servlet.vo;

public class CustomerVO {
	String customerName, customerAddress;
	String OrderItem, price, quentity;

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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuentity() {
		return quentity;
	}

	public void setQuentity(String quentity) {
		this.quentity = quentity;
	}

}
