package interfaceField;

public class KumhoTire extends TireInfo {

	// �ʵ� (field)

	// ������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); // �θ� �����ڸ� ȣ���Ͽ��� ������ �ʿ������� �ڽĵ� �θ��� �����ڸ� ȣ���ؾ���.
	}

	// �޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation; // ���� ȸ���� 1 ����
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire ����: " + 
					(maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire ��ũ ***");
			return false;
		}
	}

}
