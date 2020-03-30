package com.command.example;

public class Client {

	public static void main(String[] args) {

		OperationsAPI operationsApi = new OperationsAPI();
		
		Order orderWithdrawal = new Order(operationsApi, 2540L, "Withdrawal");
		ATMMachine atm = new ATMMachine(orderWithdrawal);
		atm.execute();
		
		Order orderDeposit = new Order(operationsApi, 7530L, "Deposit");
		atm.setOrder(orderDeposit);
		atm.execute();
		
	}

}
