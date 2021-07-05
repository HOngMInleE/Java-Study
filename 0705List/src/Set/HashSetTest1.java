package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		set.add("1");
		set.add("4");
		set.add("2");
		set.add("5");
		set.add("3");
		
		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
			String s = it.next();

			System.out.println(s); 
			
		}
		
		System.out.println("============================");
		
		it = set.iterator();
		
		while (it.hasNext()) {
			String s = it.next();

			System.out.println(s); 
			
		}
	}

}
