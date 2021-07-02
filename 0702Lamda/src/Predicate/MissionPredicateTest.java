package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class MissionPredicateTest {
	
	private static List<Student> list = Arrays.asList(
			new Student ( "ȫ�浿", "����", 90),
			new Student ( "�����", "����", 90), 
			new Student ( "���ڹ�", "����", 95), 
			new Student ( "���ѳ�", "����", 92)
			);
	

	// max �Լ� �ϼ� // Operator Interface���.
	
//	private static int max(IntBinaryOperator function) {
//		
//		int max = 0;
//		for (Student student : list) {
//			max = function.applyAsInt(max, student.getScore());
//		}
//		return max;
//		
//		
//	// ���� �� ��
////		int result = list.size();
////		for(int score : list.size()) {
////			result = operator.applyAsInt(result, score);
////		}
////		return result;
//	}
	
	// max �Լ� �ϼ� // Function Interface ���.
	
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
		
	// Operator Interface ���
		
//		int max = max(
//				(a, b) -> {
//					if(a < b) return b;
//					else return a;
//				});
		
	// Function Interface ���
		
		int max = max ( t -> t.getScore() );
		
		
		System.out.println("�ְ� ����: " + max);
	}


	

}
