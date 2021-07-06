package Map;

import java.util.Collection;
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
		map.put("ȫ�浿", 95); // Ű�� ���� ������ ���� �������� ������ ������ ��ġ
		System.out.println("�� Entry ��: " + map.size()); // ����� �� Entry �� ���
		
		
	// ��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿")); // �̸�(Ű)���� ����(��)�� �˻�
		System.out.println();
	
		
	// ��ü�� �ϳ��� ó��
		Set<String> KeySet = map.keySet(); // Key Set ���
		Iterator<String> KeyIterator = KeySet.iterator(); // �ݺ��ؼ� Ű�� ��� ���� Map���� ��
		while(KeyIterator.hasNext()) {
			String key = KeyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		
	// ��ü ����
		map.remove("ȫ�浿"); // Ű�� Map.Entry�� ����
		System.out.println("�� Entry �� : " + map.size());
		
		
	// ��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.EntrySet ���
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {  // �ݺ��ؼ� Map.Entry�� ��� Ű�� ���� ��
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
	// value �� ó��
		System.out.println("�� Entry �� : " + map.size());
		
		Collection values = map.values();
		Iterator<Integer> valueIterator = values.iterator();
		while(valueIterator.hasNext()) {
			int value = valueIterator.next();
			
			System.out.println("\t value : " + value);
		}
		System.out.println();
		
	// ��ü ��ü ����
		map.clear(); // ��� Map.Entry ����
		System.out.println("�� Entry �� : " + map.size());
		
	}

}
