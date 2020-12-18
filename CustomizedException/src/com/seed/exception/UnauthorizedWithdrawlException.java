package com.seed.exception;

public class UnauthorizedWithdrawlException extends Exception{

	public UnauthorizedWithdrawlException() {
		super("This user is unauthorized for the withdrawl.");
	}
}
