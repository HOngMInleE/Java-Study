package com.member;

public class ClassTest {

	public static void main(String[] args) {

		Car car = new Car("��Ƽ��");
		
		Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		
		System.out.println();
		
		try { // ��ü�� �������� �ʾƵ� ������ �޾� �� �� �ִ�. // ��ü ���� x
			Class clazz2 = Class.forName("com.member.Car");
			
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
