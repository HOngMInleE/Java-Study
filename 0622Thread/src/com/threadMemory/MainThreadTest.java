package com.threadMemory;

public class MainThreadTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		User2 user2 = new User2();
		
		user1.setCalculator(calculator);
		user1.start();
		
		user2.setCalculator(calculator);
		user2.start();
				
	}

}
