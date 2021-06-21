package com.member;

public class Member3Test {

	public static void main(String[] args) {

		Member3 origin = new Member3("homie", 24, new int[] {90, 90},new Car("Mer"));
		
		Member3 cloned = origin.getMember();
		
		cloned.scores[0] = 100;
		
		cloned.car.model = "Gran";
				
		System.out.println(origin.scores[0]); // 90
		System.out.println(origin.scores[1]); // 90
		System.out.println(origin.car.model); // Mer
		
		System.out.println();
				
		System.out.println(cloned.scores[0]); // 100   
		System.out.println(cloned.scores[1]); // 90
		System.out.println(cloned.car.model); // Gran
	}

}
