package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 6; i++) {
			int lotto = (int) (Math.random() * 45) + 1;
			System.out.println(lotto);
		}
		System.out.println();
		
		Set<Integer> set = new HashSet();
		
		for (int i = 0; set.size() < 6; i++) {
			int lotto = (int) (Math.random() * 45) + 1;
			set.add(lotto);
		}
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			int lotto = it.next();
			System.out.println(lotto);
		}
		
		
	}

}
