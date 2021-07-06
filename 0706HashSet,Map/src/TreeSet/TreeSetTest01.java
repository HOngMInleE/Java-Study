package TreeSet;

import java.util.TreeSet;

public class TreeSetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(80));
		scores.add(new Integer(95));
		scores.add(new Integer(87));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("���� ���� ���� : " + score);
		
		score = scores.last();
		System.out.println("���� ���� ���� : " + score + "\n");
		
		score = scores.lower(new Integer(95));
		System.out.println("95�� �Ʒ� ���� : " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95�� ���� ���� : " + score + "\n");
		
		score = scores.floor(new Integer(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ���� : " + score);
		
		score = scores.ceiling(new Integer(85));
		System.out.println("85�� �̰ų� �ٷ� ���� ���� : " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + " (���� ��ü �� : " + scores.size() + ")");
		}
		
	}

}
