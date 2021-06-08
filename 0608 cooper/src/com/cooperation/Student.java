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
	
	void takeBus(Bus bus) { // Bus 타입의 bus 매개변수 생성
		bus.take(1500);
		this.money -= 1500; // 내 돈에서 버스비(1500)원을 빼줌.
	}
	
	void takeSubway(Subway subway) {
		subway.take(1300);
		this.money -= 1300;
	}
	
	void showInfo() {
		System.out.println(studentName + "님의 남은 금액은 " + money + "원 입니다.");
	}
	
	
	
	
}
