package com.yield;

public class ThreadA extends Thread {
	
	public boolean stop = false; // ���� �÷���
	public boolean work = true; // �۾� ���� ���� �÷���
	
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		
		while(!stop) {
			if(work) {
				System.out.println("ThreadA �۾� ����");
			}else {
				Thread.yield();
			}
		}
		
		System.out.println("ThreadA ����");
	}
	
	
}
