
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		a = 10;
		b = 20;
		c = 30;

// �迭
		// 1���� �迭, �������迭

//		int[] arr = new int[10];	// �迭�� ���� / �� ������ �ѹ��� ��. 
//		//arr = new int[10]; // �迭�� ���� / ��� �迭���� 0���� �ڵ� �ʱ�ȭ �� 
//		 	// []�ȿ��� �迭�� ũ�⸦ �ۼ� / int : �迭�� Ÿ�� / new : ���ο� ��ü ����
//		
//		arr[0] = 10; // �迭�� �ʱ�ȭ
//		arr[9] = 100;
//		System.out.println(arr[0]); // 10
//		System.out.println(arr[2]); // 0
//		System.out.println(arr[9]); // 100

//		int[] arr = {1,2,3,4,5}; // �迭�� ����, ����, ���� �� �ѹ��� ��.
//		System.out.println(arr[4]);

//		int[] score = new int[5];
//		score[0] = 10;
//		score[1] = 20;
//		score[2] = 30;
//		score[3] = 40;
//		score[4] = 50;

//		int sum = score[0] + score[1] + score[2] + score[3] + score[4];
//		System.out.println(sum); //150

// �迭�� Ȱ��

//		int sum = 0;
//		
//		for(int i = 0; i < score.length; i ++) { // ũ�⿡ 5�� �ƴ� score�� �迭�� ��(ũ��)�� �־���� ��.
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
		// �迭�� ���� ����, ���

//		int sum = 0;		
//		double avg = 0.0;
//		System.out.println(avg);

//		for(int i = 0; i < score.length; i++) {
//			sum += score[i];
//			avg = (double)sum / score.length; // double �� sum ����ȯ
//		}
//		System.out.println(score.length); // �迭�� ũ��(����)
//		System.out.println("������ " + sum + " �Դϴ�."); // �迭�� ����
//		System.out.println("����� " + avg + " �Դϴ�."); // �迭�� ��� = ���� / ũ��

//		for(int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//		avg = (double)sum / score.length;

//		avg = (int)(avg * 100) / 100.0;  //87.66
//		avg = (int)(avg * 100 + 1) / 100.0;		// �ι�° �ڸ��� +1�ϴ� ��� / 1.
//		avg = (int)(avg * 100) / 100.0 + 0.01; // �ι�° �ڸ��� +1�ϴ� ��� / 2.
//		avg = (int)(avg * 100 + 0.5) / 100.0;  // 0.5�� �ݿø�����.. ������ .1 �� ���� ����.. ������..?
//		
//		System.out.println(score.length);
//		System.out.println("������ " + sum + " �Դϴ�."); 
//		System.out.println("����� " + avg + " �Դϴ�."); 

//		int[] score = {1,2,3,4,5};
//		
//		System.out.println("swap����");
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
//		System.out.println("swap����");  // [0]�� [3]�� ���� �ٲ�
//		for (int i = 0; i <score.length; i++) {
//			System.out.println(score[i] + " ");
//		}

// �ζ� �����

//		int[] lotto = new int[45];
//		
//		for(int i =0; i < lotto.length;i++) {	// �迭�� �ʱ�ȭ / ���� ��
//			lotto[i] = i + 1;
////			System.out.println(lotto[i] + " ");
//		}
//		
//		int r1 = 0;	// ���� ����� (������ ��)
//		int r2 = 0;
//		
//		for(int i = 0;i < lotto.length * 2; i++) { // ���� ���̰� �ϱ����� * 2
//			int temp;
//			r1 = (int)(Math.random() * 45); // 0~45 ���� ������ ����
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

// �迭�� ����
		// �������� / �������� / �ϳ�����,�� �������� ���ذ��� ���� ���.

//		int[] score = {36, 65, 3, 12, 78};
//				
//		for(int i = 0;i < score.length; i++) {
//			for(int j = i + 1; j < score.length; j++) { // 4,3,2,1 / �ݺ� Ƚ��
//				if(score[i] < score[j]) { //  > : �������� / < : ��������
//					int temp;
//					temp = score[i];
//					score[i] = score[j];
//					score[j] = temp;
//				}
//			}
//			System.out.print(score[i] + " ");
//		}

// ������ �迭		/ 2���� �迭

//		int[][] score;
//		score = new int[5][3]; 	//  [��] [��]

//		int[][] score = new int [5][3];
//		
//		score[0][0] = 1;
//		score[0][1] = 2;
//		score[4][2] = 15;
//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[4][2]);

//		int[][] score = {
//				{1,2,3}, 	/* {} : ���� �ǹ� */
//				{4,5,6,},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15}
//		};

//		for(int i =0; i <score.length;i++) { // ���� ũ�⸸ŭ �ݺ�
//			for(int j=0; j < score[i].length; j++) { // ���� ũ�⸸ŭ �ݺ�
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}

//���� for��

//		for(�����Ǽ��� : �迭�� �̸�(�迭���� ��)) {  }

//		for(int[] temp : score ) {	
//			for(int num : temp) {
//				System.out.print(num + " ");
//			}
//			System.out.println();
//		}

// ����)
		// 1 ~ 15 ������ ���� �迭�� �ʱ�ȭ �Ѵ�. (for ���� ����ؼ�)
		// �迭�� ���� �� ���� ���ϰ� ����Ѵ�.
		// i j // ���� ��Ģ�� ã�Ƽ� ������ ��������.
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
