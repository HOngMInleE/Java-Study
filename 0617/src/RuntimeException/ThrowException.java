package RuntimeException;

public class ThrowException {

	public static void main(String[] args)  {

//		try {
//			throw new Exception("���Ƿ� ���� �߻�"); // ���� ���� �߻� ��Ű��
//			throw new NumberFormatException("r");
//		} catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
		
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void method1() throws Exception {
		method2();
	}

	public static void method2() throws Exception {
		throw new Exception("���� ������ �ִ�.");
	}
	
	
}
