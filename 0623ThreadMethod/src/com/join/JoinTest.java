package com.join;

public class JoinTest {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
			
		} catch (InterruptedException e) {
		}
		
		System.out.println("1~100 гу: " + sumThread.getSum());
		
		
		
		
		
	}

}
