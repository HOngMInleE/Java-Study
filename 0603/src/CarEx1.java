public class CarEx1 {
	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	// ������
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
