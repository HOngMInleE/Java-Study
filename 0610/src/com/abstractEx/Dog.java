package com.abstractEx;

public class Dog extends Animal {

// 생성자 생성
	public Dog(String kind) {
		this.kind = "포유류";
	}	
	
	
	
	@Override
	public void sound() {
		System.out.println("Woof Woof");

	}


}
