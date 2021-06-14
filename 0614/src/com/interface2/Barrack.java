package com.interface2;

public class Barrack extends Building implements Liftable{

	LiftableImple lf = new LiftableImple(); // 생성을 통해 클래스 포함시킴
	
	@Override
	public void liftOff() {
		lf.liftOff();
	}

	@Override
	public void move(int x, int y) {
		lf.move(x, y);
	}

	@Override
	public void stop() {		
		lf.stop();
	}

	@Override
	public void land() {
		lf.land();
		
	}

}
