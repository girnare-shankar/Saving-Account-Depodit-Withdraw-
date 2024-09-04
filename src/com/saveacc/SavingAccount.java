package com.saveacc;

public class SavingAccount {

	private int accno;
	private String name;
	private double balance;

	public SavingAccount(int accno, String name, double balance) {

		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public synchronized double deposite(double amount) {

		balance = balance + amount;

		return balance;

	}

	public synchronized double withdraw(double amount) {
		balance = balance - amount;
		return balance;
	}

	public double getBalance() {

		return balance;
	}

}

