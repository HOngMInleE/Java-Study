package com.thread;

public class ThreadNameTest {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());
		
		System.out.println();
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();
		
		System.out.println();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�: " + threadB.getName());
		threadB.start();
		
		
	}

}
