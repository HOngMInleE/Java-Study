package com.abstractEx;

public class Dog extends Animal {

// ������ ����
	public Dog(String kind) {
		this.kind = "������";
	}	
	
	
	
	@Override
	public void sound() {
		System.out.println("Woof Woof");

	}


}
