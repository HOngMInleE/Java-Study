package interfaceField;

public class HankookTire extends TireInfo {

// �ʵ� (field)

// ������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
//		location = "�ѱ�Ÿ�̾�"; 
	}

// �޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation; // ���� ȸ���� 1 ����
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ����: " + 
					(maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}

}