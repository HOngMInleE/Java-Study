package interfaceField;

public abstract class TireInfo implements Tire {

	// �ʵ� (field)
		public int maxRotation;					// �ִ� ȸ����(Ÿ�̾� ����)
		public int accumulatedRotation ; 		// ���� ȸ����
		public String location; 				// Ÿ�̾��� ��ġ
		
		
	// ������
			public TireInfo(String location, int maxRotation) {
			this.location = location;
			this.maxRotation = maxRotation;
		}

}
