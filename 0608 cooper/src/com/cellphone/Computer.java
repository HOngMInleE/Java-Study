package com.cellphone;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
			 System.out.println("Computer ��ü�� areaCircle() ����");
			 return Math.PI * r * r;
			 
//		return super.areaCircle(r); // �ڽĿ��� �θ��� �޼ҵ� ȣ��
	}


	
}
