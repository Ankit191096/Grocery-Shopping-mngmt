package com.grocery.shopping.management.dto;

public class OrderDetails {
	
	private int quantityOrdered;
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public double getPriceEach() {
		return priceEach;
	}
	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}
	public short getOrderLineNumber() {
		return orderLineNumber;
	}
	public void setOrderLineNumber(short orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	private double priceEach;
	private short orderLineNumber;
}
