package com.thread;

import java.awt.Toolkit;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		
// // ���ٽ� ������
//		Thread thread = new Thread(() -> {   // ���ٽ� ���� ���
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
			System.out.println("��");
			try { Thread.sleep(500); } catch (InterruptedException e) { }
		}
	}

}
