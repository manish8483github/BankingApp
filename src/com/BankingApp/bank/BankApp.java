package com.BankingApp.bank;

import java.math.BigDecimal;
import java.util.Optional;

public class BankApp {
	public static void main(String[] args) {

		// sample account
		BankAccount account1 = new BankAccount("123", "pankaj", new BigDecimal("1000.00"), "ACTIVE");
		BankAccount account2 = new BankAccount(null, "", null, "INACTIVE");

		// validate and print details

		validateAndPrintAccount(account1);
		System.out.println("-------");
		validateAndPrintAccount(account2);

	}

	// account number

	public static void validateAndPrintAccount(BankAccount account) {
		if (account == null) {
			System.out.println("Account is null.");
			return;
		}

		// Account number
		if (account.getAccountNumber() == null || account.getAccountNumber().trim().isEmpty()) {
			System.out.println("Invalid account number.");
		} else {
			System.out.println("Account Number: " + account.getAccountNumber());
		}

		// Holder name
		if (account.getHolderName() != null && !account.getHolderName().trim().isEmpty()) {
			System.out.println("Account Holder: " + account.getHolderName());
		} else {
			System.out.println("Invalid holder name.");
		}

		// Balance
		if (account.getBalance() != null && account.getBalance().compareTo(BigDecimal.ZERO) > 0) {
			System.out.println("Account Balance: ₹" + account.getBalance());
		} else {
			System.out.println("Invalid or zero balance.");
		}

		// Status using Optional
		String status = Optional.ofNullable(account.getStatus()).orElse("UNKNOWN");
		System.out.println("Account Status: " + status);
	}

}