package ComparableComparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("È«±æµ¿", 10));
		treeSet.add(new Person("°í±æµ¿", 20));
		treeSet.add(new Person("±èÀÚ¹Ù", 0));
		
		Iterator<Person> it = treeSet.iterator();
		
		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p.name + "  " + p.age);
		}
				
		
				
				
				
				
	}

}
