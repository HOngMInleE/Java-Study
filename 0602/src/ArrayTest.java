
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		a = 10;
		b = 20;
		c = 30;

// 배열
		// 1차원 배열, 다차원배열

//		int[] arr = new int[10];	// 배열의 선언 / 과 생성을 한번에 함. 
//		//arr = new int[10]; // 배열의 생성 / 모든 배열들이 0으로 자동 초기화 됨 
//		 	// []안에는 배열의 크기를 작성 / int : 배열의 타입 / new : 새로운 객체 생성
//		
//		arr[0] = 10; // 배열의 초기화
//		arr[9] = 100;
//		System.out.println(arr[0]); // 10
//		System.out.println(arr[2]); // 0
//		System.out.println(arr[9]); // 100

//		int[] arr = {1,2,3,4,5}; // 배열의 선언, 생성, 선언 을 한번에 함.
//		System.out.println(arr[4]);

//		int[] score = new int[5];
//		score[0] = 10;
//		score[1] = 20;
//		score[2] = 30;
//		score[3] = 40;
//		score[4] = 50;

//		int sum = score[0] + score[1] + score[2] + score[3] + score[4];
//		System.out.println(sum); //150

// 배열의 활용

//		int sum = 0;
//		
//		for(int i = 0; i < score.length; i ++) { // 크기에 5가 아닌 score의 배열의 수(크기)를 넣어놔도 됨.
////			System.out.println(score[i]);
//			sum += score[i];
//		}
//		System.out.println(sum);

//		String[] strArr = new String[3];
//		strArr[0] = "a";
//		strArr[1] = "b";
//		strArr[2] = "c";
//
//		for(int i = 0; i < strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}

//		int[] score = {98,78,87};
		// 배열의 값의 총점, 평균

//		int sum = 0;		
//		double avg = 0.0;
//		System.out.println(avg);

//		for(int i = 0; i < score.length; i++) {
//			sum += score[i];
//			avg = (double)sum / score.length; // double 로 sum 형변환
//		}
//		System.out.println(score.length); // 배열의 크기(길이)
//		System.out.println("총점은 " + sum + " 입니다."); // 배열의 총합
//		System.out.println("평균은 " + avg + " 입니다."); // 배열의 평균 = 총합 / 크기

//		for(int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//		avg = (double)sum / score.length;

//		avg = (int)(avg * 100) / 100.0;  //87.66
//		avg = (int)(avg * 100 + 1) / 100.0;		// 두번째 자리에 +1하는 방법 / 1.
//		avg = (int)(avg * 100) / 100.0 + 0.01; // 두번째 자리에 +1하는 방법 / 2.
//		avg = (int)(avg * 100 + 0.5) / 100.0;  // 0.5로 반올림해줌.. 하지만 .1 이 남지 않음.. 이유는..?
//		
//		System.out.println(score.length);
//		System.out.println("총점은 " + sum + " 입니다."); 
//		System.out.println("평균은 " + avg + " 입니다."); 

//		int[] score = {1,2,3,4,5};
//		
//		System.out.println("swap이전");
//		
//		for (int i = 0; i <score.length; i++) {
//			System.out.println(score[i] + " ");
//		}
//		
////		score[0]	score[3]
//		
//	
//		int temp;
//		
//		temp = score[0];
//		score[0] = score[3];
//		score[3] = temp;	
//		
//		System.out.println("swap이후");  // [0]과 [3]의 값이 바뀜
//		for (int i = 0; i <score.length; i++) {
//			System.out.println(score[i] + " ");
//		}

// 로또 만들기

//		int[] lotto = new int[45];
//		
//		for(int i =0; i < lotto.length;i++) {	// 배열의 초기화 / 섞기 전
//			lotto[i] = i + 1;
////			System.out.println(lotto[i] + " ");
//		}
//		
//		int r1 = 0;	// 난수 만들기 (랜덤한 값)
//		int r2 = 0;
//		
//		for(int i = 0;i < lotto.length * 2; i++) { // 많이 섞이게 하기위해 * 2
//			int temp;
//			r1 = (int)(Math.random() * 45); // 0~45 까지 나오는 난수
//			r2 = (int)(Math.random() * 45);
//			
//			temp = lotto[r1];
//			lotto[r1] = lotto[r2];
//			lotto[r2] = temp;
//		}
//		
//		for(int i = 0; i < 6; i++) {
//			System.out.println(lotto[i]);
//		}

// 배열의 정렬
		// 선택정렬 / 오름차순 / 하나선택,을 기준으로 비교해가며 가는 방식.

//		int[] score = {36, 65, 3, 12, 78};
//				
//		for(int i = 0;i < score.length; i++) {
//			for(int j = i + 1; j < score.length; j++) { // 4,3,2,1 / 반복 횟수
//				if(score[i] < score[j]) { //  > : 오름차순 / < : 내림차순
//					int temp;
//					temp = score[i];
//					score[i] = score[j];
//					score[j] = temp;
//				}
//			}
//			System.out.print(score[i] + " ");
//		}

// 다차원 배열		/ 2차원 배열

//		int[][] score;
//		score = new int[5][3]; 	//  [행] [열]

//		int[][] score = new int [5][3];
//		
//		score[0][0] = 1;
//		score[0][1] = 2;
//		score[4][2] = 15;
//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[4][2]);

//		int[][] score = {
//				{1,2,3}, 	/* {} : 행을 의미 */
//				{4,5,6,},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15}
//		};

//		for(int i =0; i <score.length;i++) { // 행의 크기만큼 반복
//			for(int j=0; j < score[i].length; j++) { // 열의 크기만큼 반복
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}

//향상된 for문

//		for(변수의선언 : 배열의 이름(배열변수 명)) {  }

//		for(int[] temp : score ) {	
//			for(int num : temp) {
//				System.out.print(num + " ");
//			}
//			System.out.println();
//		}

// 예제)
		// 1 ~ 15 까지의 값을 배열에 초기화 한다. (for 문을 사용해서)
		// 배열의 값에 총 합을 구하고 출력한다.
		// i j // 수의 규칙을 찾아서 식으로 정리하자.
		// 0 0
		// 0 1
		// 0 2

		int[][] score = new int[5][3];

//		int k = 1;
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (i * score[i].length) + (j + 1);
				sum += score[i][j];
			}
		}
		System.out.println(sum);

	}

}
