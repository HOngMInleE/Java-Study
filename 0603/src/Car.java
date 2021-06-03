public class Car {

	// 변수 (속성)

	String company; // = "현대자동차";
	String model; // = "그랜져";
	String color; // = "검정";
	int maxSpeed; // = 350;
	int speed;

	// 생성자(멤버변수를 초기화)

	Car() {
//		company = "현대자동차";
//		model = "그랜져";

		this("한성자동차", "BMW");
		// this : 나 자신을 의미(class의 이름)/ Car라는class를 대신 쓴 것 / 다른 생성자를 호출하는 기능

	}

	Car(String c, String m) {
		company = c;
		model = m;
	}

	
	
	
	
	// 메소드(기능)

	void KeyTurnOn() {
		System.out.println("시동을 걸다.");
	}
	
	void KeyTurnOff() {
		System.out.println("시동을 끄다.");
	}
	
	void Accel() {
		for (int i=0; i <200; i++) {
			speed = i;
			System.out.println(speed);
		}
	}
	
	
	
	
	
}