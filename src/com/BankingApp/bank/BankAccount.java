package com.BankingApp.bank;

import java.math.BigDecimal;

public class BankAccount {

	private String accountNumber;
	private String holderName;
	private BigDecimal balance;
	private String status;

	public BankAccount(String accountNumber, String holderName, BigDecimal balance, String status) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		this.status = status;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public String getStatus() {
		return status;
	}

}
