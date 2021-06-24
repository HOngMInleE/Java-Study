package com.Interrupt;

public class InterruptTest {
	
	public static void main(String[] args) {
		
		PrintThread2 thread = new PrintThread2();
		thread.start();
		
		try { thread.sleep(1000); } catch (InterruptedException e) { }
		
		thread.interrupt();
		
		
	}
}
