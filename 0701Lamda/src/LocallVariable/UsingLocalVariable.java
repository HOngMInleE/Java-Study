package LocallVariable;

public class UsingLocalVariable {

	void method(int arg) {	// arg 는 final 특성을 가짐
		int localVar = 40;	// localVar 는 final 특성을 가짐
//		int x = 10;		// 람다식에서 변수를 사용했기 때문에 final 특성을 가짐. 
					// 람다식에서 사용하지 않는 변수는 final 특성을 \ 가지지 않는다 \ 
		
//		 arg = 31;			// final 특성 때문에 수정 불가
//		 localVar = 41;		// final 특성 때문에 수정 불가
		
		// 람다식
		MyFunctionalInterface fi = () -> {
			// 로컬 변수 읽기
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.methoid();
	}
}
