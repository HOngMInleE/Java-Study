package com.threadMemory;

public class User2 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User2"); // setName = Thread에서 상속받은 필드인듯.
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}
