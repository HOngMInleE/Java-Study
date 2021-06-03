public class CarEx1 {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	CarEx1() {
	}

	CarEx1(String model) {
		this(model, null, 0);
	}

	CarEx1(String model, String color) {
		this(model, color, 0);
	}

	CarEx1(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
