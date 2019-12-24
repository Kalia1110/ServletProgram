package kcp.servlet.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	String customerName;
	int age;
	String customerAddress, sourse, destinaton;
	long PNRno;
	Double distance;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public long getPNRno() {
		return PNRno;
	}

	public void setPNRno(long pNRno) {
		PNRno = pNRno;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}
}
