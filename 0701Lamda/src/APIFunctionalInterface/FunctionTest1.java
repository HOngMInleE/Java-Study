package APIFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionTest1 {

	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿" , 90 , 96), 
			new Student("�ł���" , 95 , 93)
			);
	
	public static void printString(Function<Student, String> function) {
		for (Student student : list) {		// list�� ����� �׸� ����ŭ ���� /���� for��
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt( ToIntFunction<Student> function) {
		for(Student student : list) {		// list�� ����� �׸� ����ŭ ���� /���� for��
			System.out.println(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static double avg( ToIntFunction<Student> function) {
		int sum = 0;
		
		for(Student student : list) {
			sum += function.applyAsInt(student);			
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static int totalSum( ToIntFunction<Student> function) {
		int sum = 0;
		int totalSum = 0;
		
		for (Student sutudent : list) {
			sum += function.applyAsInt(sutudent);
		}
		totalSum += sum;
		return totalSum;
	}
	
	public static void main(String[] args) {
		System.out.println("[�л� �̸�]");
		printString( t -> t.getName() );
		
		System.out.println("[���� ����]");
		printInt( t -> t.getEnglishscore() );
		
		System.out.println("[���� ����]");
		printInt( t -> t.getMathScore() );
		
		System.out.println("[���� ���]");
		double engAvg = avg( t -> t.getEnglishscore() );
		System.out.println(engAvg);
		System.out.println();
		
		System.out.println("[���� ���]");
		double mathAvg = avg( t -> t.getMathScore() );
		System.out.println(mathAvg);
		System.out.println();
		
		System.out.println("[��� �л� ���� ����]");
//		printInt(t -> t.getEnglishscore() + t.getMathScore()); // 186, 188 ���� ���� ����.
		int totalSum = totalSum(t -> t.getEnglishscore() + t.getMathScore());
		System.out.println(totalSum); // 374. 
		System.out.println();
		
		System.out.println("[���� �л� ���� ����]");
		printInt(t -> t.getEnglishscore() + t.getMathScore());
				// return ���� int �� method ���ٸ� ���� ������ ��������?
	}
	
	
}
