package com.inner;

public class InnerTest {

	public static void main(String[] args) {

		A a = new A();
		
		A.B b = a.new B(); // 인스턴스한 내부 클래스
		
		b.field1 = 3;
		b.method1();
		
		// ---------------------
		// 정적 내부 클래스
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3; // static,  생성없이도 사용가능
		A.C.method2();
		
		// --------------------
		// 로컬 내부 클래스
		
		a.method();
		
		
		
		
	}

}
