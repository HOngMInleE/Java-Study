package com.wait_notify;

public class WaitNotifyTest {

	public static void main(String[] args) {
		
		WorkObject shareObject = new WorkObject();
		
		
		ThreadA threadA = new ThreadA(shareObject);
		ThreadB threadB = new ThreadB(shareObject);
		
		threadA.start();
		threadB.start();
		
		
		
		
		
		
		
		
		
		
	}

}
