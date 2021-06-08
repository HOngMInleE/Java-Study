package com.cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int grade, int money) {
		super();
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
	}
	
	void takeBus(Bus bus) { // Bus Ÿ���� bus �Ű����� ����
		bus.take(1500);
		this.money -= 1500; // �� ������ ������(1500)���� ����.
	}
	
	void takeSubway(Subway subway) {
		subway.take(1300);
		this.money -= 1300;
	}
	
	void showInfo() {
		System.out.println(studentName + "���� ���� �ݾ��� " + money + "�� �Դϴ�.");
	}
	
	
	
	
}
