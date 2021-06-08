package com.cellphone;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
			 System.out.println("Computer 객체의 areaCircle() 실행");
			 return Math.PI * r * r;
			 
//		return super.areaCircle(r); // 자식에서 부모의 메소드 호출
	}


	
}
