package com.inner;

public class A {

	A() {
		System.out.println("A按眉 积己");
	}
	
	class B {
		B() {
			System.out.println("B按眉 积己");
		}
		int field1;
//		static int field2;
		void method1() { System.out.println("B按眉 皋家靛");}
//		static void method2() {} 
	}
	
	static class C {
		C() { System.out.println("C按眉 积己"); }
		int field1;
		static int field2;
		void method1( ) {System.out.println("C按眉 皋家靛");}
		static void method2() {System.out.println("C按眉 static 皋家靛2");}
	}
	
	void method() {
		
		class D {
			D () {System.out.println("D 按眉 积己");}
			int field1;
			void method1() {System.out.println("D按眉 皋家靛");}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
