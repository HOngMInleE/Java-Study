package com.member;

import java.util.Arrays;

public class Member3 implements Cloneable{

	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member3(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Member3 cloned = (Member3)super.clone(); // 참조변수는 주소값들을 복제함.
		
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model); // 참조필드들의 구조를 같게해줌.
		
		return cloned;
	}
	
	public Member3 getMember() {
		
		Member3 cloned = null; // 로컬변수는 반드시 초기화를 하고 사용.
		
		try {
			cloned = (Member3)clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
		
	}
	
}
