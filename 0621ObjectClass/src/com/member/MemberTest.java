package com.member;

public class MemberTest {

	public static void main(String[] args) {
		
		Member m1 = new Member("123");
		Member m2 = new Member("123");
		
		if(m1 == m2) { // ���� �ٸ� ��ü�̹Ƿ� false / �ּ� ���� �ٸ�.
			System.out.println("m1�� m2�� �����Ǵ� �ּҰ��� ����.");
		}
		
		if(m1.equals(m2)) { // equals �޼ҵ带 Override�ؼ� ��������.
			System.out.println("m1�� m2�� ����.");
		}
		
		System.out.println("hashcode������");
		System.out.println(m1.hashCode()); // 1110623531
		System.out.println(m2.hashCode()); // 410495873
		
	}

}
