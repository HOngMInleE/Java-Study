public class Car {

	// ���� (�Ӽ�)

	String company; // = "�����ڵ���";
	String model; // = "�׷���";
	String color; // = "����";
	int maxSpeed; // = 350;
	int speed;

	// ������(��������� �ʱ�ȭ)

	Car() {
//		company = "�����ڵ���";
//		model = "�׷���";

		this("�Ѽ��ڵ���", "BMW");
		// this : �� �ڽ��� �ǹ�(class�� �̸�)/ Car���class�� ��� �� �� / �ٸ� �����ڸ� ȣ���ϴ� ���

	}

	Car(String c, String m) {
		company = c;
		model = m;
	}

	
	
	
	
	// �޼ҵ�(���)

	void KeyTurnOn() {
		System.out.println("�õ��� �ɴ�.");
	}
	
	void KeyTurnOff() {
		System.out.println("�õ��� ����.");
	}
	
	void Accel() {
		for (int i=0; i <200; i++) {
			speed = i;
			System.out.println(speed);
		}
	}
	
	
	
	
	
}