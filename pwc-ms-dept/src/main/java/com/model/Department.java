package com.model;

public class Department {
private String dname;
private String mname;
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public Department(String dname, String mname) {
	super();
	this.dname = dname;
	this.mname = mname;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Department [dname=" + dname + ", mname=" + mname + "]";
}



}
