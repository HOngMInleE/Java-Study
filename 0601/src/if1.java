import java.util.Scanner;

public class if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

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

	System.out.println("���� �Է�");
	int num = sc.nextInt();
	
// Switch ��
	
	System.out.println("1,2,3 �� �����Ͻÿ�.");
	switch(num) {
	case 1: System.out.println("1�� ����");
		break;
	case 2: System.out.println("2�� ����");
		break;
	case 3: System.out.println("3�� ����");
		break;
	default : System.out.println("�߸� ����");
	}
		
		
		
		
		
	}

}
