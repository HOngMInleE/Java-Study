package com.ReentranLock;

public class ReentranLockTest {

	public static void main(String[] args) throws InterruptedException {

		Table table = new Table();
		
		new Thread(new Cook(table),"COOK1").start();
		new Thread(new Customer(table,"donut"),"CUST1").start();
		new Thread(new Customer(table,"burger"),"CUST2").start();
		
		Thread.sleep(2000);
		System.exit(0);
	}

}
