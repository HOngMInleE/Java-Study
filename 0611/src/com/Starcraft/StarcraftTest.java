package com.Starcraft;

public class StarcraftTest {

	public static void main(String[] args) {

//		System.out.println(SCV.repair);
		
		SCV scv = new SCV();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		Tank tank = new Tank();
		
		scv.repair(tank);
		scv.repair(scv);
		scv.repair(dropship);
		
		
		
	}

}
