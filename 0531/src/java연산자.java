
public class java연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
//			String str1 = "대한민국";
//			String str2 = "만만세";
//			
//			System.out.println(str1 + str2 + 2021);		// 앞에 문자열이 있어서 / 2021에 자동 타입 변환 발생 / 문자열로 처리 

//			String str1 = "abc";
//			String str2 = "abc"; // str1 의 abc 를 참조하여 메모리 부여됨
//			
//			System.out.println(str1 == str2); // true / 같은 주소를 사용해서 / true가 됨 
//			
//			String str3 = new String("abc");
//			String str4 = new String("abc");
//			
//			System.out.println(str3 == str4); // false / 객체(변수)를 비교해서 (주소값을 비교해서) / 다르게 인식
			 
			  
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
			
	// 사과가 123개가 있습니다. 한 바구니에 담을 수 있는 사과의 개수는 10개 입니다. 나는 바구니가 몇 개가 필요할까요?
		int apple = 123;
		int bucket = 10;
		
//		int numBucket = apple % bucket > 0 ? apple / bucket +1 : apple / bucket;
		int numBucket =apple / bucket + (apple % bucket > 0 ? 1 : 0) ;
		
		System.out.println(numBucket);// 13
			

	}

}
