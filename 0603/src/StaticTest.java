
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Static s = new Static();
//		System.out.println(s.PI); // 3.14
		// c.PI = 123.456; // final 로 인한 변경 불가능
		
		Static s = new Static(); 
		// 오류 발생 생성자가 있으면 기본 생성자 사용 불가능
		// 기본생성자를 클래스안에 정의 해주어야 함.
		Static s1 = new Static(0.98);
		System.out.println(s);
		System.out.println(s1);
		
// Static : 클래스 생성없이 사용 가능
		
//		double result = Static.pi * 10 * 10;
//		System.out.println(result); // 314 
//		
//		int sum = Static.plus(10, 20);
//		System.out.println(sum);
//		
//		int sub = Static.sub(30, 10);
//		System.out.println(sub);
//		
//		
//		Static s1 = new Static();
//		Static s2 = new Static();
//		
//		s1.iv = 100;
//		System.out.println(s1.iv); // 100 / 입력할때 s1(참조) 꼭해줘야함. 
//		System.out.println(s2.iv); // 0
//		
//		s1.pi = 123.456;
//		System.out.println(s1.pi); // 123.456 / 바뀐 값이 찍힘
//		System.out.println(s2.pi); // 123.456 / 바뀐 값을 공유함
		
		
		
		
		
	}

}
