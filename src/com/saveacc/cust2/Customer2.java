package com.saveacc.cust2;
import com.saveacc.SavingAccount;

public class Customer2 implements Runnable{
	
	private SavingAccount sa;
	
	public Customer2(SavingAccount sa) {
		this.sa=sa;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
			sa.deposite(10);
		}
		
	}

}
