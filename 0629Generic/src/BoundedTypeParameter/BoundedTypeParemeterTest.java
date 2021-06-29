package BoundedTypeParameter;

public class BoundedTypeParemeterTest {

	public static void main(String[] args) {

//		 String str = Util.<String, String> compare("a", "b"); (x) 
//		 	String 은 Number 타입이 아님.
		
		int result1 = Util.compare(10, 20); // 20 : Auto Boxing  (int -> Integer)
//		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3); // 4.5 : Auto Boxing (double -> Double)
		System.out.println(result2);
		
	}

}
