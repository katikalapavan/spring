package com.example.pwcspring;

public class Employee {
	String empname;
	String email;
	String city;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", email=" + email + ", city=" + city + "]";
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(String empname, String email, String city) {
		super();
		this.empname = empname;
		this.email = email;
		this.city = city;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
