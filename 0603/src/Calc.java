
public class Calc {
	
	
// �޼ҵ��� ����
	//	[] : �ʿ��ϸ���� / �ʼ� �ƴ�
	
	//	����Ÿ�� �޼Ҹ� ([�Ű�����1,....]) {
	//		
	//		[return ���ϰ�;]
	//	}
	
// ����Ÿ�� (void, �⺻��Ÿ��(8����), ������)
	
//	public void add() {	// void : return ���� �������� �ʴ´�.
//		System.out.println(3 + 5);
//	}
//	
//	public void add2(int x, int y) {
//		System.out.println(x + y);   // �Ű������� ����� ����� ����
//	}
//	
//	public int add3(int x, int y) { // ��ȯ�Ǵ� ���� ���� Ÿ���̾���� / ' int ' add3
//		int sum = x + y;
//		return sum;
//	}
//	
//	public double add4(double x, double y) {	// ����ȯ 
//		
//		return x + y;
//	}
	
	
// Mission 
//	// ���� ��� : return ó�� (���������� ó��)
//		public int sub(int x,int y) {  // �迭�Է��� ��� �ϴ���? / �������� �� �Է��ϴ� ���?
//			return x - y;
//		}
//		
//	// ���ϱ� ��� : return ó�� (���������� ó��)
//		public int multi(int x, int y) {
//			return x * y;
//		}
//		
//	// ������ ��� : return ó�� (�Ǽ������� ó��)
//		public double div(double x, double y) {
//			return x / y;
//		}
	

// ������ �޼ҵ�
	// �Ű����� ���� ���� ����, �迭������ ó����
//		public int sum(int ... values) { 
//			int sum = 0;
//			
//			for(int num : values) {
//				sum += num;
//			}
//			
//			return sum;
//		}
	
	
// �����ε�
	// 1. �޼ҵ��� �̸��� ���ƾ� �Ѵ�.
	// 2. �� �Ű������� Ÿ�� �Ǵ� ������ �޶���Ѵ�.
	
	void add() {
		System.out.println(5 + 7);
	}
	
	void add(int x) { 
		System.out.println(x);
	}
	
	// �����ε� ��������
//	int add(int x) { // return ���� �ٸ����� �̸��� ���� ���̶�� �Ǵ��ؼ� �����ε�x
//		
//	}
	
	void add(double x) { // �Ű������� / Ÿ���� �ٸ���.
		System.out.println(x);
	}
	
	void add(int x,int y) {// ������ �ٸ���
		System.out.println(x);
	}
	
	
	
	void add(int x,long y) {
		
	}
	
	void add(long x,int y) { // ���� Ÿ���� �ٸ���
		
	}
	
//	add(10L,20) // Ÿ���� ���缭 ȣ���������ν� ������ ȣ������ ������.
	
	
	
	
	
	
	
	
	
	
}
