import java.util.Scanner;

public class if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);	

//		System.out.println("������ �Է��ϼ���:");
//		int num = sc.nextInt();
//		System.out.println(num);
//		
//		if(num > 100) {
//			System.out.println("100���� Ů�ϴ�");
//		} else {
//			System.out.println("100���� �۽��ϴ�");
//		}

//		System.out.println("�̸��� �Է��ϼ���");
//		String name = sc.nextLine();
//		System.out.println(name);

// ���� if ��		

//		System.out.println("������ �Է��ϼ���");
//		int score = sc.nextInt();

//		if(score > 100 || score < 0) {
//			System.out.println("�߸� �Է� �Ͽ����ϴ�.");
//		}else if(score >= 90) {
//			System.out.println("A���� �Դϴ�.");	// �ڵ��� �ߺ�
//		}else if(score >= 80) {
//			System.out.println("B���� �Դϴ�.");
//		}else if(score >= 70) {
//			System.out.println("C���� �Դϴ�.");
//		}else if(score >= 60) {
//			System.out.println("D���� �Դϴ�.");
//		}else {
//			System.out.println("F���� �Դϴ�.");
//		}     
//		

//		String hak = "";
//		
//		if(score > 100 || score < 0) {
//			System.out.println("�߸� �Է� �Ͽ����ϴ�.");
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
//		System.out.println(hak + "�� �Դϴ�.");

// ��ø if ��		
		// 98 �̻��̸� A+ / 94 ���ϸ� A- / �߰������� A0 / B,C,D �������� �����ϰ� ����
//
//		String hak = "";
//
//		if (score > 100 || score < 0) {
//			System.out.println("�߸� �Է� �Ͽ����ϴ�.");
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
//		System.out.println(hak + "�� �Դϴ�.");

//	System.out.println("���� �Է�");
//	int num = sc.nextInt();

// Switch ��

//		System.out.println("1,2,3 �� �����Ͻÿ�.");
//		switch(num) {
//		case 1: System.out.println("1�� ����");
//			break;
//		case 2: System.out.println("2�� ����");
//			break;
//		case 3: System.out.println("3�� ����");
//			break;
//		default : System.out.println("�߸� ����");
//		}

//		Scanner sc = new Scanner(System.in);	// ���� buffer�� �Ѱ� �츮�� �� �� �ְ� ��
		// enter ���� ���ڷ� �ԷµǾ�����.

//		System.out.println("ù��° ���� �Է�");
//		int num1 = sc.nextInt();
//		System.out.println("�ι�° ���� �Է�");
//		int num2 = sc.nextInt();
//		System.out.println("������ �Է�");
//		sc.nextLine();		// ���۸� ����ֱ� ���� �����	/ buffer : �������� ������ ó��  / buffering 
//		String op = sc.nextLine();		// ������ �Է��� �ȵ� 
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

// ����
//		Math.random() 0.0 <= r < 1.0
//		int r = (int) (Math.random() * 10) + 1;  // int : Math.floor ������.
//		System.out.println(r);

//		int user,com;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("1.���� 2.���� 3.�� �Է�");
//		user = sc.nextInt();
//		
//		com = (int) (Math.random() * 3) + 1;
//		
//		System.out.println("����" + user + "�Դϴ�.");
//		System.out.println("��ǻ�ʹ�" + com + "�Դϴ�.");
//				
//		
////		���� �̰���ϴ�. / ���� �����ϴ�. / �����ϴ�.
//		
//		if(user > 3 || user < 1) {
//			System.out.println("�ٽ� �Է��ϼ���.");
//		}else if(user > com) {
//			System.out.println("���� �̰���ϴ�.");
//		}else if (user < com) {
//			System.out.println("���� �����ϴ�.");
//		}else if (user == com) {
//			System.out.println("�����ϴ�.");
//		}
//		

// �ݺ��� for, while, do-while ��

//		int i;
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println(i);

		// ���ǹ��� ����� �� ���� 1 x 1 = 1 2 x 1 = 2 3 x 1 = 3 4 x 1 = 4 5 x 1 = 5 ..9

//		for(int r = 1; r <= 10; r++) {
//			for(int c = 1; c <= 9; c++) {
//				System.out.println(r + " x " + c  + " = " + (r*c));
//			}
//		}

//		for(int z = 1; z <=5; z++) {
//			System.out.println(z);
//		}

//		for(int i = 1;i <= 6; i += 5) {	// i �� 1 �϶�, += 5 �� 6 �϶� �� 2 �� ����
//			for(int r = 1; r <= 9;r++) {
//				for (int c = i; c < i+5; c++) {	// �ܿ� �ش�
//					System.out.print(c + " x " + r + " = " + c*r +"\t");	// print : ���� ���η� ��µǾ���		//   \t : tab / �Ǳ�� 
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

// while(���ǽ�) { }

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

// ���� �ݺ���
//		while(true) { }

//		boolean flag = true; // flag�� ���� while ���� ���� �ϰڴ� / true : ���ѹݺ� false : ���� / flag : ���� ���� ������ ����
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("������ �Է�");
//
//		while (flag) {
//
//			int num = sc.nextInt();
//
//			if (num == 1) {
//				System.out.println("1�� �Է�");
//			} else if (num == 2) {
//				System.out.println("2�� �Է�");
//			} else {
//				System.out.println("�߸� �Է�");
//				flag = false;
//			}
//		}
//
//		System.out.println("���α׷� ����");

// do-while ��

//		Scanner sc = new Scanner (System.in);
//		
//		String input;
//		do {
//			System.out.println("�ҹ��� �Է�");
//			input = sc.nextLine();
//			System.out.println(input);
//		}while (!input.equals("q"));		// ! : (���� ������) �ƴ϶��~	/ q�� �ƴ϶��~
//		
//		System.out.println("���α׷� ����");

//		Scanner sc = new Scanner (System.in);
//		System.out.println("�������·� ���ڸ� �Է�");
//		
//		String input = sc.nextLine();
//		int num = Integer.parseInt(input);		// ���ڱ����� �������·� �ٲ� �� �ִ�	//int�� ������ ��ȯ

//		"12345" -> 12345 -> 15			// ���ڿ��� �� �ڸ��� ���ڸ� ���� ��
// 		"567456" -> 567456 -> 33

// ���� ������ �ֱ� ������ WHILE �� ���
//		
//		int sum = 0;
//		while (num != 0) {		// 
//			sum += num % 10;	// 12345 % 10 = 5 	// ���� �ڸ��� �ִ� �������� ���ϰ� ,  sum�� �����ְڴ�.
//											// 1234 % 10 = 4
//			num /= 10; 				// 1234 / 10 = 1234		//  num = num / 10;  �� ����.
//											// 1234 / 10 = 123	...... 
//		}
//		
//		System.out.println(sum);

// ����2
//		Scanner sc = new Scanner (System.in);
//		System.out.println("�������·� ���ڸ� �Է�");
//		
//		String input = sc.nextLine();
//		int num = Integer.parseInt(input);		// ���ڱ����� �������·� �ٲ� �� �ִ�	//  int�� ������ ��ȯ
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

//�������̶� ���� �� �� 
//		while(num != 0 ) {
//			revers =(revers * 10) + (num % 10); 
//								// 0  * 10 + 5(������) -> 5
//								// 5  * 10 + 4 -> 54
//								// 54 * 10 + 3 -> 543
//			num /= 10;		
//		}
//		System.out.println(revers);

//		int a = 10;
//		 a *= 10;
//		System.out.println(a);

// ����2 / revers�� ����Ÿ������ �ٲ㼭 �غ�
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
//			System.out.println("�����Է�");
//			int num = sc.nextInt();
//			
//			if (num ==1) {
//				System.out.println("1�� �Դϴ�.");
//			}else if(num ==2) {
//				System.out.println("2�� �Դϴ�.");
//			}else {
//				System.out.println("�߸� �Է�.");
//				break;
//			}
//		}

// ex 07)

		boolean run = true;

		int balance = 0;

		int select = 0; // �߰��Ѱ�

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("------------------------------------");
			System.out.print("����>");

			// �ۼ� ��ġ
			select = scanner.nextInt();

			if (select == 1) {
				System.out.println("���ݾ�>");
				balance += scanner.nextInt(); // �Է��� �ݾ׸�ŭ �߰�
			} else if (select == 2) {
				System.out.println("��ݾ�>");
				balance -= scanner.nextInt(); // �Է��� �ݾ׸�ŭ ����
			} else if (select == 3) {
//				if (balance < 0) {
//					System.out.println("�ܰ� �����մϴ�.");
//					run = false;
//				}
				System.out.println("�ܰ�>" + balance);
			} else {
				break; // break
			}
		}
		System.out.println("���α׷� ����");

	}

}
