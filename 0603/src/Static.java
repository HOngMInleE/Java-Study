
public class Static {

// ���� 
	// �ν��Ͻ� ���� / (int iv)
		// �����ڿ� ���� �ʱ�ȭ ����
		// ������ �� ���� �Ҵ� �Ǿ��� // ��ü ������ ������ �� ���� ������� ���� o 
	
	// Ŭ���� (static) ���� (static int cv)
		// ��ü�� ���� ���� ��� ���� (Ŭ�����̸�.������)
		// �����ڿ� ���� �ʱ�ȭ �Ұ���
		// �� ���� �Ҵ� �Ǿ��� / ��� ��ü�� �����Ѵ�. / ��ü ������ ������ �� ���� ������� ���� x
		
	// ��� - ������ �Ұ��� ���� (final double PI)
		// ���� : 			 final Ÿ��  ������ �빮�ڻ�� 
		// �ݵ�� �ʱ�ȭ �ؼ� ����Ѵ�.
		// �����ڸ� ���� �ʱ�ȭ�� ����.
	
	
// ������ / �ν��Ͻ� ������ �ʱ�ȭ
	
	
	
	
	
// �޼ҵ�
	// �ν��Ͻ� �޼ҵ�		/ void add() {}
		
	
	// Ŭ����(static) �޼ҵ�  / static void add() {}
		// ��ü�� �������� ��� ���� (Ŭ�����̸�.�޼ҵ��())
	
	int iv;

	static double pi = 3.14;	// pi �� ���氡�� 
	final static double PI = 3.14; // PI �� ���� �Ұ���
//	final static double PI; // ���� // �ʱ�ȭ �ݵ�� �ؾ���
	
	final double Gravity;
	
	// final ������
	Static(double Gravity) {
		this.Gravity = Gravity; // Gravity�� �����ڿ��� �ʱ�ȭ�ؼ� ���
	}
	
	
	Static() {
		this(123.45);
	}


	 
	 

	static int plus(int a,int b) {
		return a + b;	
	}

	static int sub(int a, int b) {
		return a - b;
	
	}
	
	
	
	
}
