package com.interface2;

public class BuildTest {

	public static void main(String[] args) {

		Barrack ba = new Barrack();
		Factory ft = new Factory();
		
		ba.liftOff();
		ba.move(0, 0);
		ba.stop();
		ba.land();
		
		System.out.println("=======================");
		ft.liftOff();
		ft.move(0, 0);
		ft.stop();
		ft.land();
		
		
	}

}
