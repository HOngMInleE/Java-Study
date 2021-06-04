package access.package1;

public class A {

// 필드
	public int field1; // public 접근제한
	int field2;		   // default 접근제한
	private int field3; // private 접근제한
	// 상속, 다용성, 캡슐화(은닉) - private : 외부로부터 데이터를 보호
	// Getter Setter : private한 멤버변수와 연결되어서 사용되는 메소드
	
// 생성자
	public A( ) {
		field1 =1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
// 메소드
	public void method1() {}  // public 접근제한
	void method2() {} 		// default 접근제한
	private void method3() {} // private 접근제한
	
}
