
public class Static {

// 변수 
	// 인스턴스 변수 / (int iv)
		// 생성자에 의한 초기화 가능
		// 생성할 때 마다 할당 되어짐 // 개체 각각이 생성될 때 마다 저장공간 생성 o 
	
	// 클래스 (static) 변수 (static int cv)
		// 객체의 생성 없이 사용 가능 (클래스이름.변수명)
		// 생성자에 의한 초기화 불가능
		// 한 번만 할당 되어짐 / 모든 객체가 공유한다. / 개체 각각이 생성될 때 마다 저장공간 생성 x
		
	
// 생성자 / 인스턴스 변수를 초기화
	
	
	
	
	
// 메소드
	// 인스턴스 메소드		/ void add() {}
		
	
	// 클래스(static) 메소드  / static void add() {}
		// 객체의 생성없이 사용 가능 (클래스이름.메소드명())
	
	int iv;
	
	static double pi = 3.14;
	
	static int plus(int a,int b) {
		return a + b;	
	}

	static int sub(int a, int b) {
		return a - b;
	
	}
	
	
	
	
}
