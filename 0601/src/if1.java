import java.util.Scanner;

public class if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

//		System.out.println("정수를 입력하세요:");
//		int num = sc.nextInt();
//		System.out.println(num);
//		
//		if(num > 100) {
//			System.out.println("100보다 큽니다");
//		} else {
//			System.out.println("100보다 작습니다");
//		}

//		System.out.println("이름을 입력하세요");
//		String name = sc.nextLine();
//		System.out.println(name);

// 다중 if 문		

//		System.out.println("점수를 입력하세요");
//		int score = sc.nextInt();

//		if(score > 100 || score < 0) {
//			System.out.println("잘못 입력 하였습니다.");
//		}else if(score >= 90) {
//			System.out.println("A학점 입니다.");	// 코드의 중복
//		}else if(score >= 80) {
//			System.out.println("B학점 입니다.");
//		}else if(score >= 70) {
//			System.out.println("C학점 입니다.");
//		}else if(score >= 60) {
//			System.out.println("D학점 입니다.");
//		}else {
//			System.out.println("F학점 입니다.");
//		}     
//		

//		String hak = "";
//		
//		if(score > 100 || score < 0) {
//			System.out.println("잘못 입력 하였습니다.");
//		}else if(score >= 90) {
//			hak = "A";
//		}else if(score >= 80) {
//			hak = "B";
//		}else if(score >= 70) {
//			hak = "C";
//		}else if(score >= 60) {
//			hak = "D";
//		}else {
//			hak = "F";
//		} 
//		        
//		System.out.println(hak + "점 입니다.");

// 중첩 if 문		
		// 98 이상이면 A+ / 94 이하면 A- / 중간점수는 A0 / B,C,D 학점까지 동일하게 적용
//
//		String hak = "";
//
//		if (score > 100 || score < 0) {
//			System.out.println("잘못 입력 하였습니다.");
//		} else if (score >= 90) {
//			if (score >= 98) {
//				hak = "A+";
//			} else if (score <= 94) {
//				hak = "A-";
//			} else {
//				hak = "A0";
//			}
//		} else if (score >= 80) {
//			if (score >= 88) {
//				hak = "B+";
//			} else if (score <= 84) {
//				hak = "B-";
//			} else {
//				hak = "B0";
//			}
//		} else if (score >= 70) {
//			if (score >= 78) {
//				hak = "C+";
//			} else if (score <= 74) {
//				hak = "C-";
//			} else {
//				hak = "C0";
//			}
//		} else if (score >= 60) {
//			if (score >= 68) {
//				hak = "D+";
//			} else if (score <= 64) {
//				hak = "D-";
//			} else {
//				hak = "D0";
//			}
//		} else {
//			hak = "F";
//		}
//
//		System.out.println(hak + "점 입니다.");

	System.out.println("정수 입력");
	int num = sc.nextInt();
	
// Switch 문
	
	System.out.println("1,2,3 중 선택하시오.");
	switch(num) {
	case 1: System.out.println("1번 선택");
		break;
	case 2: System.out.println("2번 선택");
		break;
	case 3: System.out.println("3번 선택");
		break;
	default : System.out.println("잘못 선택");
	}
		
		
		
		
		
	}

}
