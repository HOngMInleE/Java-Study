package com.cooperation;

public class TakeTest {

	public static void main(String[] args) {
		
		Student james = new Student("darke", 1, 5000);
		Student Kanye = new Student("Kanye", 2, 10000);
		
		Bus bus100 = new Bus(100); // �����ڰ� busNumber �ۿ� ��� �װ͸� ��� 
									// �̰͸� ����Ϸ��� �����ڸ� Number�� ����.
		
		Subway subway2 = new Subway("2ȣ��");
		
		james.takeBus(bus100);
		Kanye.takeBus(bus100);
		bus100.showInfo();
		System.out.println();
				
		james.takeSubway(subway2);
		Kanye.takeSubway(subway2);
		subway2.showInfo();
		
		

	}

}
