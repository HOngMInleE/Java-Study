package TreeSet;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		
	// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); 
		

		Set<String> KeySet = map.keySet(); 
		Iterator<String> KeyIterator = KeySet.iterator(); 
		while(KeyIterator.hasNext()) {
			String key = KeyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();	
	}
	
	static class ValueComprator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			
			return 0;

			// 오름차순 : o1 - o2
			// 내림차순 : o2 - o1
		}
		
	}
	

}
