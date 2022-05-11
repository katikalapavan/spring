package com.lambda;

import java.util.Map;

public class Employee {
private int id;
private String name;
private String city;
private String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Employee(int id, String name, String city, String email) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.email = email;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


}
