package LocallVariable;

public class UsingLocalVariable {

	void method(int arg) {	// arg �� final Ư���� ����
		int localVar = 40;	// localVar �� final Ư���� ����
//		int x = 10;		// ���ٽĿ��� ������ ����߱� ������ final Ư���� ����. 
					// ���ٽĿ��� ������� �ʴ� ������ final Ư���� \ ������ �ʴ´� \ 
		
//		 arg = 31;			// final Ư�� ������ ���� �Ұ�
//		 localVar = 41;		// final Ư�� ������ ���� �Ұ�
		
		// ���ٽ�
		MyFunctionalInterface fi = () -> {
			// ���� ���� �б�
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.methoid();
	}
}
