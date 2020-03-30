package com.command.example;

public class Order implements Command {

	private OperationsAPI operationsApi;
	private Long amount;
	private String operationType;

	

	public Order(OperationsAPI operationsApi, Long amount, String operationType) {
		super();
		this.operationsApi = operationsApi;
		this.amount = amount;
		this.operationType = operationType;
	}



	@Override
	public void execute() {
	
		if(operationType.equalsIgnoreCase("withdrawal")) {
			this.operationsApi.withdrawal(amount);
		}
		else if(operationType.equalsIgnoreCase("deposit")) {
			this.operationsApi.deposit(amount);
		}
		
	}

}
