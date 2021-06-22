package com.thread;

import java.awt.Toolkit;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		
// // 람다식 적용방식
//		Thread thread = new Thread(() -> {   // 람다식 적용 방식
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			
//			for(int i = 0; i < 5; i++) {
//				toolkit.beep();
//				try { 
//					Thread.sleep(500); 
//				} catch (InterruptedException e) { 
//					
//				}
//			}
//		});
//	
//		thread.start();
	
		
		BeepThread beepThread = new BeepThread();
		beepThread.start();
		
		for(int i = 0; i< 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (InterruptedException e) { }
		}
	}

}
