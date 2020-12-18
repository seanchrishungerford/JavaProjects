package com.seed.transaction;

import com.seed.account.Account;
import com.seed.customer.Customer;
import com.seed.exception.InsufficientBalanceException;
import com.seed.exception.UnauthorizedWithdrawlException;
import com.seed.security.Security;



public class WithdrawlTransaction extends Security implements Runnable {

	
	private int transactionId;
	private Account account;
	private Customer customer;
	private double amount;
	
	
	
	
	public WithdrawlTransaction(int transactionId, Account account, Customer customer, double amount) {
		super();
		this.transactionId = transactionId;
		this.account = account;
		this.customer = customer;
		this.amount = amount;
	}


	public double withdraw(Account account, double amount) throws InsufficientBalanceException{
		
		if(account.getBalance() >= amount) {
			account.setBalance(account.getBalance()-amount);
		}
		else {
			throw new InsufficientBalanceException();
		}
		
		return account.getBalance();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			authorization(account, customer);
			
			double balance = withdraw(account, amount);
			
			System.out.println(transactionId + "  transaction completed!!! and the balance ammount is " + balance);
		}
		catch(UnauthorizedWithdrawlException UnauthorizedWithdrawlException) {
			System.out.println(transactionId + " transaction failed!!! and " + UnauthorizedWithdrawlException.getMessage());
		}
		catch(InsufficientBalanceException InsufficientBalanceException) {
			System.out.println(transactionId+ "transaction failed!!! and your account has insufficient balance");
			
		}
		
	}

}
