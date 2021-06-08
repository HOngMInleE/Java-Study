package com.promotion;

public class ChildTest {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		
		Parent parent = child; // 자동 타입 변환
							   // 부모에 있는 메소드만 사용 가능
		
		
		parent.method1(); // 호출 가능
		
		parent.method2(); // 재정의된 메소드가 호출됨
						  // Override 된 자식의 메소드가 호출됨 ( 자식 따라감 )
		
//		parent.method3(); // 호출 불가능
		

		
		
		
	}

}
