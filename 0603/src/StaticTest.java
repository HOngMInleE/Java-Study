
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Static s = new Static();
		
		
// Static : Ŭ���� �������� ��� ����
		
		double result = Static.pi * 10 * 10;
		System.out.println(result); // 314 
		
		int sum = Static.plus(10, 20);
		System.out.println(sum);
		
		int sub = Static.sub(30, 10);
		System.out.println(sub);
		
		
		Static s1 = new Static();
		Static s2 = new Static();
		
		s1.iv = 100;
		System.out.println(s1.iv); // 100 / �Է��Ҷ� s1(����) ���������. 
		System.out.println(s2.iv); // 0
		
		s1.pi = 123.456;
		System.out.println(s1.pi); // 123.456 / �ٲ� ���� ����
		System.out.println(s2.pi); // 123.456 / �ٲ� ���� ������
		
		
		
		
		
	}

}
