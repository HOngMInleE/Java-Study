package com.promotion;

public class ChildTest {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		
		Parent parent = child; // �ڵ� Ÿ�� ��ȯ
							   // �θ� �ִ� �޼ҵ常 ��� ����
		
		
		parent.method1(); // ȣ�� ����
		
		parent.method2(); // �����ǵ� �޼ҵ尡 ȣ���
						  // Override �� �ڽ��� �޼ҵ尡 ȣ��� ( �ڽ� ���� )
		
//		parent.method3(); // ȣ�� �Ұ���
		

		
		
		
	}

}
