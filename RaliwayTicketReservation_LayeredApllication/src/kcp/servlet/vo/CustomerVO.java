package kcp.servlet.vo;

public class CustomerVO {
	String PNRno, customerName,age;
	String customerAddress, sourse, destinaton,distance;
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPNRno() {
		return PNRno;
	}

	public void setPNRno(String pNRno) {
		PNRno = pNRno;
	}

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

	public String getSourse() {
		return sourse;
	}

	public void setSourse(String sourse) {
		this.sourse = sourse;
	}

	public String getDestinaton() {
		return destinaton;
	}

	public void setDestinaton(String destinaton) {
		this.destinaton = destinaton;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}
}
