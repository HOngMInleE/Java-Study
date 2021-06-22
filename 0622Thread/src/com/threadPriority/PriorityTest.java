package com.threadPriority;

public class PriorityTest {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("Thread "+ i);
			if(i == 10) {
				thread.setPriority(Thread.MAX_PRIORITY);
			}else if (i == 5) {
				thread.setPriority(Thread.NORM_PRIORITY);
			}else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			thread.start();
		}
		
		
		
		
		
		
		
		
	}

}
