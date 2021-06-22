package com.thread;

import java.awt.Toolkit;

public class BeepPrintTest1 {

	public static void main(String[] args) {
		
//		BeepTask beepTask = new BeepTask(); // BeepTask 클래스 대신 Runnable 이 와도 무관.
		
		Thread thread = new Thread(new Runnable () { // 익명 객체 이용 방식

			@Override
			public void run() { 	
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try { 
						Thread.sleep(500); 
					} catch (InterruptedException e) { 
						
					}
				}
			}
		});
	
		thread.start();
		
		for(int i = 0; i< 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (InterruptedException e) { }
		}
		
		
		
		
		
		
		
		
		
		
	}

}
