package com.inner;

public class InnerTest {

	public static void main(String[] args) {

		A a = new A();
		
		A.B b = a.new B(); // �ν��Ͻ��� ���� Ŭ����
		
		b.field1 = 3;
		b.method1();
		
		// ---------------------
		// ���� ���� Ŭ����
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3; // static,  �������̵� ��밡��
		A.C.method2();
		
		// --------------------
		// ���� ���� Ŭ����
		
		a.method();
		
		
		
		
	}

}
