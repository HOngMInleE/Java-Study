
public class Java타입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이홍민");
		
		// 변수의 개념
		
//		int age;  // 변수의 선언	// int : 정수타입
//		age = 10; // 변수의 초기화
//		
//		System.out.print(age); // 괄호안의 대상이 출력됨 // print : 결과를 가로 방향으로 나타내줌
		
//		int x;
//		int y;
//		int z;
//		
//		x = 10;
//		y = 20;
//		z = 30;
//		
//		System.out.println(x); // println : 결과를 세로로 보여줌
//		System.out.println(y);
//		System.out.println(z);
		
//		int x,y,z;
//		x = 10; y = 20; z = 30;
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);			// 출력 함수가 변수보다 위에 있으면 안됨. 위에서부터 아래로 읽어들이는 방식인듯.
		
//		int x = 10, y = 20, z = 30;
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
//		int x = 10;
//		int y;
//		
//		y = x + 10;
//		
//		System.out.println(y);
//		System.out.println(x);
		
//		byte b = 128;	 // eror
		
//		char c = 'a';	// '' = 문자로 처리  /  "" = 문자'열'로 처리됨
//		System.out.println(c);
//		
//		char c2 = 63;		// 63, 200 둘 다 ? 로 나오는데 어떻게 된것인지 // 유니코드 검색해보기 
//		System.out.println(c2);
//		
//		char c1 = 'A';
//		System.out.println(c1);
//		
//		int uniCode = c1;
//		System.out.println(uniCode);
//		
//										// 문자열 타입은 객체형.
//		String str = "a";
//		System.out.println(str); //a / 문자열 타입으로 나오는 것임
//		
//		byte b = 0;		// 기본 타입
//		char c = ' ';	// char 타입 초기화 방법
//		
//		String str = null;	// String 타입 초기화 방법
//		Strin str2 = "";
		
//		byte b = 10;
//		char c = 10;
//		short s = 10;
//		int i = 10;		// 정수형의 기본 타입
//		long  l = 10L;	// 접미사는 대소문자 달라도 허용해줌 / 접미사를 꼭 써야만 한는 상황이 있다
		
//		float f = 3.14F; // 접미사 f를 꼭! 붙여야함 / 안그러면 double타입이 불러와져 오류발생함
//		double d = 3.14d; // 실수의 기본 타입
//		float f1 = 3.14; // float 형에 double형이 들어와서 오류가 생김 / 타입을 구분해줌
		
//		boolean b = false; // or false
//		
//		if(b) {
//			System.out.println(b);
//		}else {
//			System.out.println(b);
//		}    
		
		
//// 객체의 기본값
//		
//		byte // 0
//		short // 0
//		char // 0
//		int // 0
//		long // 0L
//		
//		float // 0.0F
//		double // 0.0
//		boolean // false
	
		
//// 형 변환		// 비트값이 변환되는 것  
//		------------------------------------>  자동 형 변환	
//	 	byte < short < int < long < float < double		// boolean 
//			char	 < int 보다는 작다
////	강제(명시적)형 변환  <---------------------------------------------
//		
		
//		int i = 200;
//		double d = i;
		
//		System.out.println(i);
//		System.out.println(d);		// 실수로 형 변환된 int 값이 출력됨
		
//		int i = 300;
//		byte b = (byte)i; // 강제 형 변환		// 타입이 다르지만 큰타입에서 작은 타입으로 바뀌기 때문에 캐스팅 연산자() 사용 
//						  // 값의 손실을 고려해야 한다.
//		
//		System.out.println(i); // 10 / 300
//		System.out.println(b); // 10 / 44	/ 비트의 값손실 때문 
		
		
// 자동 형 변환의 조건
	// 1. 변수에 값을 대입 할 때 (작은 타입을 큰 타입에 대입 할 때)
	// 2. 값을 연산할 때 ( +, -, ...)
		
//		byte b1 = 10;
//		byte b2 = 20;
//		byte result;
//		
////		result = b1 + b2;	// 오류 발생	/ int 보다 작은 정수 타입은 연산시에 int형으로 자동 타입 변환 된다.
//		result = (byte) (b1 + b2);	// 강제 타입 변환
//		
//		int + long -> long
//		int + float -> float
//		long + float -> float 
//		float + double -> double
		
		
		
		
	}
}