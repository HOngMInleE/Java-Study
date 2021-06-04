
public class Q2 {

	public static void main(String[] args) {
		
		int fahrenheit = 100;
//		float celcius = (int)((5/9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
		float celcius = (int)((5/9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : "+ celcius);
		
		
//		[정답] (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f
//		[해설] 먼저 화씨를 섭씨로 바꾸는 공식은 '5/9f * (fahrenheit - 32)' 이다. 5/9의 결과
//		는 0이기 때문에 두 피연산자 중 어느 한 쪽을 반드시 float나 double로 해야만 실수형태
//		의 결과를 얻을 수 있다. 그래서 정수형 리터럴인 9대신 float타입의 리터럴인 9f를 사용
//		하였다. 소수점 셋째자리에서 반올림을 하려면 다음의 과정을 거쳐야한다.
//
//		1. 값에 100을 곱한다.
//		37.77778 * 100
//		2. 1의 결과에 0.5를 더한다.
//		3777.778 + 0.5 → 3778.278
//		3. 2의 결과를 int타입으로 변환한다.
//		(int)3778,278 → 3778
//		4. 3의 결과를 100f로 나눈다.(100으로 나누면 소수점 아래의 값을 잃는다.)
//		3778 / 100f → 37.78
	}
}
