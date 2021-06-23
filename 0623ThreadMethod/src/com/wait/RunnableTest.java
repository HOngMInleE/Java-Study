package com.wait;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		
		Account acc = new Account();
		
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance " + acc.getBalance());
		}

	}

}
