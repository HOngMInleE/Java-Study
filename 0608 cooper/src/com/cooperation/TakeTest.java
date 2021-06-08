package com.cooperation;

public class TakeTest {

	public static void main(String[] args) {
		
		Student james = new Student("darke", 1, 5000);
		Student Kanye = new Student("Kanye", 2, 10000);
		
		Bus bus100 = new Bus(100); // 생성자가 busNumber 밖에 없어서 그것만 사용 
									// 이것만 사용하려고 생성자를 Number만 생성.
		
		Subway subway2 = new Subway("2호선");
		
		james.takeBus(bus100);
		Kanye.takeBus(bus100);
		bus100.showInfo();
		System.out.println();
				
		james.takeSubway(subway2);
		Kanye.takeSubway(subway2);
		subway2.showInfo();
		
		

	}

}
