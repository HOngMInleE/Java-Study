package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class MissionPredicateTest {
	
	private static List<Student> list = Arrays.asList(
			new Student ( "홍길동", "남자", 90),
			new Student ( "김순희", "여자", 90), 
			new Student ( "감자바", "남자", 95), 
			new Student ( "박한나", "여자", 92)
			);
	

	// max 함수 완성 // Operator Interface사용.
	
//	private static int max(IntBinaryOperator function) {
//		
//		int max = 0;
//		for (Student student : list) {
//			max = function.applyAsInt(max, student.getScore());
//		}
//		return max;
//		
//		
//	// 내가 한 것
////		int result = list.size();
////		for(int score : list.size()) {
////			result = operator.applyAsInt(result, score);
////		}
////		return result;
//	}
	
	// max 함수 완성 // Function Interface 사용.
	
	public static int max (ToIntFunction<Student> function) {
		
		int max = 0;
		int score = 0;
		
		for (Student student : list) {
			score = function.applyAsInt(student);
			if (max < score) {
				max = score;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Operator Interface 사용
		
//		int max = max(
//				(a, b) -> {
//					if(a < b) return b;
//					else return a;
//				});
		
	// Function Interface 사용
		
		int max = max ( t -> t.getScore() );
		
		
		System.out.println("최고 점수: " + max);
	}


	

}
