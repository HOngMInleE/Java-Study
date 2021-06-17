package RuntimeException;

public class ThrowException {

	public static void main(String[] args)  {

//		try {
//			throw new Exception("고의로 예외 발생"); // 강제 예외 발생 시키기
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
		throw new Exception("나는 문제가 있다.");
	}
	
	
}
