package com.member;

public class MemberTest {

	public static void main(String[] args) {
		
		Member m1 = new Member("123");
		Member m2 = new Member("123");
		
		if(m1 == m2) { // 서로 다른 객체이므로 false / 주소 값이 다름.
			System.out.println("m1과 m2는 참조되는 주소값이 같다.");
		}
		
		if(m1.equals(m2)) { // equals 메소드를 Override해서 재정의함.
			System.out.println("m1과 m2는 같다.");
		}
		
		System.out.println("hashcode변경전");
		System.out.println(m1.hashCode()); // 1110623531
		System.out.println(m2.hashCode()); // 410495873
		
	}

}
