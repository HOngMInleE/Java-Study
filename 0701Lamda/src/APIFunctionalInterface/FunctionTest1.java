package APIFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionTest1 {

	private static List<Student> list = Arrays.asList(
			new Student("홍길동" , 90 , 96), 
			new Student("신굥원" , 95 , 93)
			);
	
	public static void printString(Function<Student, String> function) {
		for (Student student : list) {		// list에 저장된 항목 수만큼 루핑 /향상된 for문
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt( ToIntFunction<Student> function) {
		for(Student student : list) {		// list에 저장된 항목 수만큼 루핑 /향상된 for문
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
		System.out.println("[학생 이름]");
		printString( t -> t.getName() );
		
		System.out.println("[영어 점수]");
		printInt( t -> t.getEnglishscore() );
		
		System.out.println("[수학 점수]");
		printInt( t -> t.getMathScore() );
		
		System.out.println("[영어 평균]");
		double engAvg = avg( t -> t.getEnglishscore() );
		System.out.println(engAvg);
		System.out.println();
		
		System.out.println("[수학 평균]");
		double mathAvg = avg( t -> t.getMathScore() );
		System.out.println(mathAvg);
		System.out.println();
		
		System.out.println("[모든 학생 점수 총합]");
//		printInt(t -> t.getEnglishscore() + t.getMathScore()); // 186, 188 각각 따로 나옴.
		int totalSum = totalSum(t -> t.getEnglishscore() + t.getMathScore());
		System.out.println(totalSum); // 374. 
		System.out.println();
		
		System.out.println("[각각 학생 점수 총합]");
		printInt(t -> t.getEnglishscore() + t.getMathScore());
				// return 값이 int 인 method 였다면 총합 점수가 나왔을까?
	}
	
	
}
