package fr.imie.jsfemanager.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "contact", eager = true)
public class Contact {
	
	private long id;
	
	private String address;
	private String phone;
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
