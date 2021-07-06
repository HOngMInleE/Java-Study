package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberTest {
	
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		Member m1 = new Member("��浿", 10);
		Member m2 = new Member("��浿", 10);
		
		set.add(m1);
		set.add(m2);
		
		System.out.println(set.add(m1)); // false // �ߺ���ü�� false�� ����.
		System.out.println(set.add(m2)); // false
		
		Iterator<Member> it = set.iterator();
		
		while(it.hasNext()) {
			Member m = it.next();
			System.out.println(m.name); // ��浿
			System.out.println(m.age); // 10
		}
		
	}

}
