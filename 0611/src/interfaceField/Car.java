package interfaceField;

public class Car {

// �ʵ� 
//	Tire frontLeftTire = new Tire("�տ���", 6); 
//	Tire frontRightTire = new Tire("�տ�����", 2); 
//	Tire backLeftTire = new Tire("�ڿ���", 3); 
//	Tire backRightTire = new Tire("�ڿ�����", 4);
	
	Tire[] tires = {
			 new HankookTire("�տ���", 6),
			 new HankookTire("�տ�����", 2), 
			 new HankookTire("�ڿ���", 3),
			 new HankookTire("�ڿ�����", 4)
	};
	
	
// ������

// �޼ҵ�
	int run () {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		
//		if(frontLeftTire.roll()==false) { stop(); return 1; }
//		if(frontRightTire.roll()==false) { stop(); return 2; }
//		if(backLeftTire.roll()==false) { stop(); return 3; }
//		if(backRightTire.roll()==false) { stop(); return 4; }
		
		int i = 0;
		for(Tire t : tires) {
			++i;
			if(t.roll() == false) {
				stop();
				return i; 
			}
		}
		return 0; // �޼ҵ��� Ÿ�Կ� �°� ������ ��ȯ�������
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
	
	
	
}
