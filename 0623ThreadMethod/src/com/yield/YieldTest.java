package com.yield;

public class YieldTest {
	public static void main(String[] args) {
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {Thread.sleep(500);
		} catch (InterruptedException e) { }
//		threadA.work = false;
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) { }
//		threadA.work = true;
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) { }
		threadA.stop = true;
		threadB.stop = true;
	
		
		
	}
	
}
