
public class java������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
//			String str1 = "���ѹα�";
//			String str2 = "������";
//			
//			System.out.println(str1 + str2 + 2021);		// �տ� ���ڿ��� �־ / 2021�� �ڵ� Ÿ�� ��ȯ �߻� / ���ڿ��� ó�� 

//			String str1 = "abc";
//			String str2 = "abc"; // str1 �� abc �� �����Ͽ� �޸� �ο���
//			
//			System.out.println(str1 == str2); // true / ���� �ּҸ� ����ؼ� / true�� �� 
//			
//			String str3 = new String("abc");
//			String str4 = new String("abc");
//			
//			System.out.println(str3 == str4); // false / ��ü(����)�� ���ؼ� (�ּҰ��� ���ؼ�) / �ٸ��� �ν�
			 
			  
//		&&, ||, !             
			
//		true && true // true
//		true && false // false 
//		false && true // false
//		false && false // false
	//	
//		true || true // true
//		true || false // true
//		false || true // true
//		false || false // false
	//	
//		!true	// false
//		!false	// true
			
//		int x = 10;
//		x += 20;	// x = x + 20 / x = 10 + 20 // 30
	//	
//		System.out.println(x); // 30
		
//		int score = 95;
//		char grade = (score > 90) ? 'A' : 'B';
//		System.out.println(grade);
			
	// ����� 123���� �ֽ��ϴ�. �� �ٱ��Ͽ� ���� �� �ִ� ����� ������ 10�� �Դϴ�. ���� �ٱ��ϰ� �� ���� �ʿ��ұ��?
		int apple = 123;
		int bucket = 10;
		
//		int numBucket = apple % bucket > 0 ? apple / bucket +1 : apple / bucket;
		int numBucket =apple / bucket + (apple % bucket > 0 ? 1 : 0) ;
		
		System.out.println(numBucket);// 13
			

	}

}
