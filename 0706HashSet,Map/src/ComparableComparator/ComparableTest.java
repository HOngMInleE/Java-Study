package ComparableComparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("ȫ�浿", 10));
		treeSet.add(new Person("��浿", 20));
		treeSet.add(new Person("���ڹ�", 0));
		
		Iterator<Person> it = treeSet.iterator();
		
		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p.name + "  " + p.age);
		}
				
		
				
				
				
				
	}

}
