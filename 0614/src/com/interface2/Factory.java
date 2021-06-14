package com.interface2;

public class Factory extends Building implements Liftable{

	LiftableImple lf = new LiftableImple();
	
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
