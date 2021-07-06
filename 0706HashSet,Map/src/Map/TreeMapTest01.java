package Map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Map 컬렉션 생성
		TreeMap<String, Integer> map = new TreeMap<>(new ValueComparator());
		
		
	// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); 
		
		Iterator it = map.entrySet().iterator();
		
		System.out.println("=== 기본 정렬 ===");
		
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " " + value);
		}
		System.out.println(map);
	}
	
	static class ValueComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;
				
				int v1 = ((Integer)e1.getValue()).intValue();
				int v2 = ((Integer)e2.getValue()).intValue();
				
				return v2 - v1;
			} else {
				return -1;				
			}
		}
		
	}
	
	

}
