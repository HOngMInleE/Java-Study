package com.interface2;

public class LiftableImple implements Liftable{

	@Override
	public void liftOff() {
		// TODO Auto-generated method stub
		System.out.println("�̷��Ѵ�.");
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("�����δ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�����.");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("�����Ѵ�.");
	}

}
