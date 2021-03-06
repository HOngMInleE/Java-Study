
public class Calc {
	
	
// 메소드의 형식
	//	[] : 필요하면넣음 / 필수 아님
	
	//	리턴타입 메소명 ([매개변수1,....]) {
	//		
	//		[return 리턴값;]
	//	}
	
// 리턴타입 (void, 기본형타입(8가지), 참조형)
	
//	public void add() {	// void : return 값을 돌려주지 않는다.
//		System.out.println(3 + 5);
//	}
//	
//	public void add2(int x, int y) {
//		System.out.println(x + y);   // 매개변수를 사용해 기능을 수행
//	}
//	
//	public int add3(int x, int y) { // 반환되는 값과 같은 타입이어야함 / ' int ' add3
//		int sum = x + y;
//		return sum;
//	}
//	
//	public double add4(double x, double y) {	// 형변환 
//		
//		return x + y;
//	}
	
	
// Mission 
//	// 빼기 기능 : return 처리 (정수형으로 처리)
//		public int sub(int x,int y) {  // 배열입력은 어떻게 하는지? / 여러개의 값 입력하는 방법?
//			return x - y;
//		}
//		
//	// 곱하기 기능 : return 처리 (정수형으로 처리)
//		public int multi(int x, int y) {
//			return x * y;
//		}
//		
//	// 나누기 기능 : return 처리 (실수형으로 처리)
//		public double div(double x, double y) {
//			return x / y;
//		}
	

// 가변형 메소드
	// 매개변수 값에 제한 없음, 배열구조로 처리됨
//		public int sum(int ... values) { 
//			int sum = 0;
//			
//			for(int num : values) {
//				sum += num;
//			}
//			
//			return sum;
//		}
	
	
// 오버로딩
	// 1. 메소드의 이름이 같아야 한다.
	// 2. 단 매개변수의 타입 또는 갯수가 달라야한다.
	
	void add() {
		System.out.println(5 + 7);
	}
	
	void add(int x) { 
		System.out.println(x);
	}
	
	// 오버로딩 예외조건
//	int add(int x) { // return 값이 다르지만 이름이 같은 값이라고 판단해서 오버로딩x
//		
//	}
	
	void add(double x) { // 매개변수의 / 타입을 다르게.
		System.out.println(x);
	}
	
	void add(int x,int y) {// 갯수를 다르게
		System.out.println(x);
	}
	
	
	
	void add(int x,long y) {
		
	}
	
	void add(long x,int y) { // 서로 타입이 다르게
		
	}
	
//	add(10L,20) // 타입을 맞춰서 호출해줌으로써 누구를 호출할지 구분함.
	
	
	
	
	
	
	
	
	
	
}
