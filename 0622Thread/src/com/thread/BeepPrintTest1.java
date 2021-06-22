package com.thread;

import java.awt.Toolkit;

public class BeepPrintTest1 {

	public static void main(String[] args) {
		
//		BeepTask beepTask = new BeepTask(); // BeepTask Ŭ���� ��� Runnable �� �͵� ����.
		
		Thread thread = new Thread(new Runnable () { // �͸� ��ü �̿� ���

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
			System.out.println("��");
			try { Thread.sleep(500); } catch (InterruptedException e) { }
		}
		
		
		
		
		
		
		
		
		
		
	}

}
