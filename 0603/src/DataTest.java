
public class DataTest {

	public static void main(String[]args) {
	
		Data d = new Data();
		d.x = 10;	// d��� ��ü�ȿ� (10�̶�� ���� ����) x �� �ּҰ��� �Էµ�. so, d.x �� �ּҰ��� �����Ͽ� x �� ���� ã�� ��.
		d.y = 20;
		
		System.out.println(d.x + " " + d.y);
		swap( d ); // x,y�� �ּҰ��� �ִ� ��ü d
		System.out.println(d.x + " " + d.y); // swap ��
	}	
		
		
	public static void swap(Data z) {  // d �� z �� ���� ������ �ƴ�.
		int tmp;
		tmp = z.x;
		z.x = z.y;
		z.y = tmp;
	}
		
		
		
		
		
		
		
//// �������Ű�����
	
//		Data d = new Data(); 
//		d.x = 10;
//		System.out.println(d.x); // 10 / d �� �� : x���� �Ѿ�� �ּ� �� 
//		change(d); 
//		System.out.println(d.x); // 100

//	// �ּҰ��� �����ϴ� ����� �Ű����� void�Լ����� ��ȭ�� �൵ �Ȱ��� ��ġ�� �����⶧���� 
//	public static void change(Data z) {	 
//		
//		z.x = 100;
//		System.out.println(z.x); // 100
//	} 
//	
}
