package com.member;

public class Member2Test {

	public static void main(String[] args) {

		Member2 origin = new Member2("homie","��ȫ��","123",24,true);
		
		Member2 cloned = origin.getMember();
		cloned.password = "456";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id : " + cloned.id);
		System.out.println("name : " + cloned.name);
		System.out.println("password : " + cloned.password);
		System.out.println("age : " + cloned.age);
		System.out.println("adult : " + cloned.adult);
		
		System.out.println();
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id : " + origin.id);
		System.out.println("name : " + origin.name);
		System.out.println("password : " + origin.password);
		System.out.println("age : " + origin.age);
		System.out.println("adult : " + origin.adult);
	}

}
