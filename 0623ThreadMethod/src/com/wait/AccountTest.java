package com.wait;

public class AccountTest {

	public static void main(String[] args) {

		RunnableTest run = new RunnableTest();
		Thread p1 = new Thread(run);
		Thread p2 = new Thread(run);
		
		p1.start();
		p2.start();
		
		
		
		
		
		
		
		
		
		
		
	}

}
