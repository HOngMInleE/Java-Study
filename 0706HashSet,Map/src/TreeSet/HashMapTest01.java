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

	// Map �÷��� ����
		Map<String, Integer> map = new HashMap<>();
		
		
	// ��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); 
		

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

			// �������� : o1 - o2
			// �������� : o2 - o1
		}
		
	}
	

}
