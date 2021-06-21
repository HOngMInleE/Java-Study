package com.member;

public class Member2Test {

	public static void main(String[] args) {

		Member2 origin = new Member2("homie","ÀÌÈ«¹Î","123",24,true);
		
		Member2 cloned = origin.getMember();
		cloned.password = "456";
		
		System.out.println("[º¹Á¦ °´Ã¼ÀÇ ÇÊµå°ª]");
		System.out.println("id : " + cloned.id);
		System.out.println("name : " + cloned.name);
		System.out.println("password : " + cloned.password);
		System.out.println("age : " + cloned.age);
		System.out.println("adult : " + cloned.adult);
		
		System.out.println();
		
		System.out.println("[¿øº» °´Ã¼ÀÇ ÇÊµå°ª]");
		System.out.println("id : " + origin.id);
		System.out.println("name : " + origin.name);
		System.out.println("password : " + origin.password);
		System.out.println("age : " + origin.age);
		System.out.println("adult : " + origin.adult);
	}

}
