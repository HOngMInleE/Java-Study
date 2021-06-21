package com.member;

public class ClassTest {

	public static void main(String[] args) {

		Car car = new Car("마티즈");
		
		Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		
		System.out.println();
		
		try { // 객체를 생성하지 않아도 정보를 받아 올 수 있다. // 객체 생성 x
			Class clazz2 = Class.forName("com.member.Car");
			
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
