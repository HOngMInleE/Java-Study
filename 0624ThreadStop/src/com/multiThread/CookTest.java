package com.multiThread;

public class CookTest {

	public static void main(String[] args) throws Exception {

		Table table = new Table();
		
		Cook cook = new Cook(table);
		Customer cus1 = new Customer(table, "Donut");
		Customer cus2 = new Customer(table, "Burger");
		
		Thread c1 = new Thread(cook);
		Thread c2 = new Thread(cus1);
		Thread c3 = new Thread(cus2);
		
		c1.start();
		c2.start();
		c3.start();
		
		
		Thread.sleep(100);
		System.exit(0);
		
		
		
		
	}

}
