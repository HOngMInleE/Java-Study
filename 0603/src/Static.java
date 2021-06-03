
public class Static {

// 변수 
	// 인스턴스 변수 / (int iv)
		// 생성자에 의한 초기화 가능
		// 생성할 때 마다 할당 되어짐 // 개체 각각이 생성될 때 마다 저장공간 생성 o 
	
	// 클래스 (static) 변수 (static int cv)
		// 객체의 생성 없이 사용 가능 (클래스이름.변수명)
		// 생성자에 의한 초기화 불가능
		// 한 번만 할당 되어짐 / 모든 객체가 공유한다. / 개체 각각이 생성될 때 마다 저장공간 생성 x
		
	// 상수 - 변경이 불가한 변수 (final double PI)
		// 형식 : 			 final 타입  변수명에 대문자사용 
		// 반드시 초기화 해서 사용한다.
		// 생성자를 통한 초기화가 가능.
	
	
// 생성자 / 인스턴스 변수를 초기화
	
	
	
	
	
// 메소드
	// 인스턴스 메소드		/ void add() {}
		
	
	// 클래스(static) 메소드  / static void add() {}
		// 객체의 생성없이 사용 가능 (클래스이름.메소드명())
	
	int iv;

	static double pi = 3.14;	// pi 값 변경가능 
	final static double PI = 3.14; // PI 값 변경 불가능
//	final static double PI; // 오류 // 초기화 반드시 해야함
	
	final double Gravity;
	
	// final 생성자
	Static(double Gravity) {
		this.Gravity = Gravity; // Gravity를 생성자에서 초기화해서 사용
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
