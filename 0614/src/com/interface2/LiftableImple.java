package com.interface2;

public class LiftableImple implements Liftable{

	@Override
	public void liftOff() {
		// TODO Auto-generated method stub
		System.out.println("ÀÌ·úÇÑ´Ù.");
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("¿òÁ÷ÀÎ´Ù.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("¸ØÃá´Ù.");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Âø·úÇÑ´Ù.");
	}

}
