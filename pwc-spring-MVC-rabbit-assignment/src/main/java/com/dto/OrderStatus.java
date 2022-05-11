package com.dto;

public class OrderStatus {
private Order order;
private String Status;
private String Message;
//public OrderStatus(com.dto.Order order2, String string, String string2) {
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public String getMessage() {
	return Message;
}
public void setMessage(String message) {
	Message = message;
}
public OrderStatus() {
	super();
	// TODO Auto-generated constructor stub
}
public OrderStatus(Order order, String status, String message) {
	super();
	this.order = order;
	Status = status;
	Message = message;
}
@Override
public String toString() {
	return "OrderStatus [order=" + order + ", Status=" + Status + ", Message=" + Message + "]";
}


}
