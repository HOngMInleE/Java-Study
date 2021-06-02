import java.util.Scanner;

public class if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);	

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

//	System.out.println("정수 입력");
//	int num = sc.nextInt();

// Switch 문

//		System.out.println("1,2,3 중 선택하시오.");
//		switch(num) {
//		case 1: System.out.println("1번 선택");
//			break;
//		case 2: System.out.println("2번 선택");
//			break;
//		case 3: System.out.println("3번 선택");
//			break;
//		default : System.out.println("잘못 선택");
//		}

//		Scanner sc = new Scanner(System.in);	// 값을 buffer로 넘겨 우리가 쓸 수 있게 함
		// enter 값도 문자로 입력되어져서.

//		System.out.println("첫번째 정수 입력");
//		int num1 = sc.nextInt();
//		System.out.println("두번째 정수 입력");
//		int num2 = sc.nextInt();
//		System.out.println("연산자 입력");
//		sc.nextLine();		// 버퍼를 비워주기 위해 사용함	/ buffer : 안정적인 데이터 처리  / buffering 
//		String op = sc.nextLine();		// 연산자 입력이 안됨 
//		
//	switch(op) {
//	case "+" : System.out.println(num1 + num2);
//		break;
//	case "-" : System.out.println(num1 - num2);
//		break;
//	case "*" : System.out.println(num1 * num2);
//		break;
//	case "/" : System.out.println(num1 / num2);
//		break;
//	default:
//	}

// 난수
//		Math.random() 0.0 <= r < 1.0
//		int r = (int) (Math.random() * 10) + 1;  // int : Math.floor 역할함.
//		System.out.println(r);

//		int user,com;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("1.가위 2.바위 3.보 입력");
//		user = sc.nextInt();
//		
//		com = (int) (Math.random() * 3) + 1;
//		
//		System.out.println("나는" + user + "입니다.");
//		System.out.println("컴퓨터는" + com + "입니다.");
//				
//		
////		내가 이겼습니다. / 내가 졌습니다. / 비겼습니다.
//		
//		if(user > 3 || user < 1) {
//			System.out.println("다시 입력하세요.");
//		}else if(user > com) {
//			System.out.println("내가 이겼습니다.");
//		}else if (user < com) {
//			System.out.println("내가 졌습니다.");
//		}else if (user == com) {
//			System.out.println("비겼습니다.");
//		}
//		

// 반복문 for, while, do-while 문

//		int i;
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println(i);

		// 조건문은 사용할 수 없다 1 x 1 = 1 2 x 1 = 2 3 x 1 = 3 4 x 1 = 4 5 x 1 = 5 ..9

//		for(int r = 1; r <= 10; r++) {
//			for(int c = 1; c <= 9; c++) {
//				System.out.println(r + " x " + c  + " = " + (r*c));
//			}
//		}

//		for(int z = 1; z <=5; z++) {
//			System.out.println(z);
//		}

//		for(int i = 1;i <= 6; i += 5) {	// i 가 1 일때, += 5 된 6 일때 총 2 번 나옴
//			for(int r = 1; r <= 9;r++) {
//				for (int c = i; c < i+5; c++) {	// 단에 해당
//					System.out.print(c + " x " + r + " = " + c*r +"\t");	// print : 값이 가로로 출력되어짐		//   \t : tab / 탭기능 
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

// while(조건식) { }

//		int n = 1;
//		while( n <= 6) {
//			int r = 1;
//			while(r <= 9) {
//				int c = n;
//				while(  c < n + 5) {
//					System.out.print(c + " x " + r + " = " + c*r + "\t");
//					c++;
//				}
//				System.out.println();
//				r++;
//			}
//			System.out.println();
//			n += 5;
//		}

// 무한 반복문
//		while(true) { }

//		boolean flag = true; // flag를 통해 while 문을 제어 하겠다 / true : 무한반복 false : 멈춤 / flag : 값이 없는 논리적인 형태
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("정수를 입력");
//
//		while (flag) {
//
//			int num = sc.nextInt();
//
//			if (num == 1) {
//				System.out.println("1번 입력");
//			} else if (num == 2) {
//				System.out.println("2번 입력");
//			} else {
//				System.out.println("잘못 입력");
//				flag = false;
//			}
//		}
//
//		System.out.println("프로그램 종료");

// do-while 문

//		Scanner sc = new Scanner (System.in);
//		
//		String input;
//		do {
//			System.out.println("소문자 입력");
//			input = sc.nextLine();
//			System.out.println(input);
//		}while (!input.equals("q"));		// ! : (현재 조건이) 아니라면~	/ q가 아니라면~
//		
//		System.out.println("프로그램 종료");

//		Scanner sc = new Scanner (System.in);
//		System.out.println("숫자형태로 문자를 입력");
//		
//		String input = sc.nextLine();
//		int num = Integer.parseInt(input);		// 문자구조를 숫자형태로 바꿀 수 있다	//int형 정수로 변환

//		"12345" -> 12345 -> 15			// 문자열의 각 자리의 숫자를 더한 값
// 		"567456" -> 567456 -> 33

// 끝이 정해져 있기 때문에 WHILE 문 사용
//		
//		int sum = 0;
//		while (num != 0) {		// 
//			sum += num % 10;	// 12345 % 10 = 5 	// 일의 자리에 있는 나머지를 구하고 ,  sum에 더해주겠다.
//											// 1234 % 10 = 4
//			num /= 10; 				// 1234 / 10 = 1234		//  num = num / 10;  와 같다.
//											// 1234 / 10 = 123	...... 
//		}
//		
//		System.out.println(sum);

// 예제2
//		Scanner sc = new Scanner (System.in);
//		System.out.println("숫자형태로 문자를 입력");
//		
//		String input = sc.nextLine();
//		int num = Integer.parseInt(input);		// 문자구조를 숫자형태로 바꿀 수 있다	//  int형 정수로 변환
//		
//		int revers = 0;
////		 12345 -> 54321
////		 num			revers
////		 456789   987654
//		
//		while(num != 0 ) {
//			revers += num % 10; 
//			num /= 10;		
//			revers *=  10 ;
//		}
//		System.out.println(revers / 10);

//선생님이랑 같이 한 것 
//		while(num != 0 ) {
//			revers =(revers * 10) + (num % 10); 
//								// 0  * 10 + 5(나머지) -> 5
//								// 5  * 10 + 4 -> 54
//								// 54 * 10 + 3 -> 543
//			num /= 10;		
//		}
//		System.out.println(revers);

//		int a = 10;
//		 a *= 10;
//		System.out.println(a);

// 예제2 / revers를 문자타입으로 바꿔서 해봄
//		String revers = "";
//		while (num != 0) {
//			revers += num % 10;
//			num /= 10;
//		}
//		System.out.println(revers);

// break, continue

//		Scanner sc = new Scanner (System.in);
//		
//		while(true) {
//			System.out.println("정수입력");
//			int num = sc.nextInt();
//			
//			if (num ==1) {
//				System.out.println("1번 입니다.");
//			}else if(num ==2) {
//				System.out.println("2번 입니다.");
//			}else {
//				System.out.println("잘못 입력.");
//				break;
//			}
//		}

// ex 07)

		boolean run = true;

		int balance = 0;

		int select = 0; // 추가한것

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------------");
			System.out.print("선택>");

			// 작성 위치
			select = scanner.nextInt();

			if (select == 1) {
				System.out.println("예금액>");
				balance += scanner.nextInt(); // 입력한 금액만큼 추가
			} else if (select == 2) {
				System.out.println("출금액>");
				balance -= scanner.nextInt(); // 입력한 금액만큼 차감
			} else if (select == 3) {
//				if (balance < 0) {
//					System.out.println("잔고가 부족합니다.");
//					run = false;
//				}
				System.out.println("잔고>" + balance);
			} else {
				break; // break
			}
		}
		System.out.println("프로그램 종료");

	}

}
