package com.seed.security;

import com.seed.account.Account;
import com.seed.customer.Customer;
import com.seed.exception.UnauthorizedWithdrawlException;

public class Security {
	public void authorization(Account account, Customer customer) throws UnauthorizedWithdrawlException{
		
		if(account.getCustomer().getCustomerId() != customer.getCustomerId()) {
			throw new UnauthorizedWithdrawlException();
		}
		
		
	}
}
