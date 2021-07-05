package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet();
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		set.add("6");
		set.add("7");
		set.add("8");
		set.add("9");
		set.add("10");
		
		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
			String s = it.next();
			int x = Integer.parseInt(s);
			if (x % 2 == 0) {
				it.remove();
			}
			System.out.println(s);
		}
		
		System.out.println();
		
		it = set.iterator();
		
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			}
		

	}

}
