package com.command.example;

public class ATMMachine {

	private Order order;

	public ATMMachine(Order order) {
		super();
		this.order = order;
	}
		
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}



	public void execute() {
		this.order.execute();
	}
}
