package com.saveacc.cust1;
import com.saveacc.SavingAccount;

public class Customer1 extends Thread{
	
	private SavingAccount sa;
	
	public Customer1(SavingAccount sa) {
		this.sa=sa;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
			sa.withdraw(5);
		}
		
	}

}
