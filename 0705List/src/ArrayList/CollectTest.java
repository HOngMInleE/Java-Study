package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CollectTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("1");
		list.add("3");
		list.add("5");
		list.add("2");
		list.add("4");
		list.add("4");

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println();

	// list �׸� ����
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

	// list �հ� ���ϱ�
		int sum = 0;
		for (int i = 0; i < list.size(); i++) { // String �� Int�� ��ȯ�ϴ� �� �����.
//			sum = (Integer) list.get(i);
			sum += Integer.parseInt(list.get(i));
		} 
		System.out.println(sum);
		System.out.println();
		
		
		List<Integer> list2 = new ArrayList<>();

		list2.add(new Integer(10)); // ���� ����ϴ� ���.
		list2.add(20); // Auto boxing , wrapper Ŭ����������.
		list2.add(30);
		list2.add(40);
		list2.add(50);
		
	// list2 �׸� ����
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println();
		
	// list2 ���� ���ϱ�
		int sum2 = 0;
		for (int i=0; i<list2.size(); i++) {
			sum2 += list2.get(i);
		}
		System.out.println(sum2);
		
	}
}
