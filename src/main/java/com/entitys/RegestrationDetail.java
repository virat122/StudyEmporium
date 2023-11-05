package com.entitys;

public class RegestrationDetail {
	private  String name;
	private  String email;
	private  String password;
	private  String college;
	private  String city;
	private  String mobNo;
	
	
	public RegestrationDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegestrationDetail(String name, String email, String password, String college, String city, String mobNo) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.college = college;
		this.city = city;
		this.mobNo = mobNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "RegestrationDetail [name=" + name + ", email=" + email + ", password=" + password + ", college="
				+ college + ", city=" + city + ", mobNo=" + mobNo + "]";
	}
	
	
	

}
