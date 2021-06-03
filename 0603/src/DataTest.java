
public class DataTest {

	public static void main(String[]args) {
	
		Data d = new Data();
		d.x = 10;	// d라는 객체안에 (10이라는 값을 가진) x 의 주소값이 입력됨. so, d.x 는 주소값을 참조하여 x 의 값을 찾는 것.
		d.y = 20;
		
		System.out.println(d.x + " " + d.y);
		swap( d ); // x,y의 주소값이 있는 객체 d
		System.out.println(d.x + " " + d.y); // swap 후
	}	
		
		
	public static void swap(Data z) {  // d 와 z 는 같은 변수가 아님.
		int tmp;
		tmp = z.x;
		z.x = z.y;
		z.y = tmp;
	}
		
		
		
		
		
		
		
//// 참조형매개변수
	
//		Data d = new Data(); 
//		d.x = 10;
//		System.out.println(d.x); // 10 / d 의 값 : x에서 넘어온 주소 값 
//		change(d); 
//		System.out.println(d.x); // 100

//	// 주소값을 전달하는 방식의 매개변수 void함수에서 변화를 줘도 똑같은 위치를 가졌기때문에 
//	public static void change(Data z) {	 
//		
//		z.x = 100;
//		System.out.println(z.x); // 100
//	} 
//	
}
