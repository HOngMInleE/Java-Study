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
		System.out.println("가장 낮은 점수 : " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score + "\n");
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수 : " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수 : " + score + "\n");
		
		score = scores.floor(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수 : " + score);
		
		score = scores.ceiling(new Integer(85));
		System.out.println("85점 이거나 바로 위의 점수 : " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + " (남은 객체 수 : " + scores.size() + ")");
		}
		
	}

}
