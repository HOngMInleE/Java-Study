package com.cellphone;

public class ComputerTest {

	public static void main(String[] args) {
		
		int r = 10;
		
		
		Calculator calculator = new Calculator();
		System.out.println("원면적: " + calculator.areaCircle(r)); 
		System.out.println();		// Calculator 객체의 변수 생성이기때문에 메소드가 바뀌기 전이 나옴.
		
		Computer computer = new Computer();
		System.out.println("원면적: " + computer.areaCircle(r));
		
		
		
	}

}
