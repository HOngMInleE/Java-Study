package GenericMethod;

public class BoxingMethodTest {

	public static void main(String[] args) {

		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		System.out.println(intValue); // 100
		
		
		Box<String>box2 = Util.boxing("ȫ�浿");
		String strValue = box2.get();
		
		System.out.println(strValue); // ȫ�浿
	}

}
