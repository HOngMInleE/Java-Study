package Schedualer;

public class Schedulertest {

	public static void main(String[] args) {
		
		PriorityAllocation pa = new PriorityAllocation(); // �켱 ����
		LeastJob lj = new LeastJob(); // ª�� ��⿭
		RoundRobin rr = new RoundRobin(); // ���� ����
		
//		int wait = (int) pa.getNextCall(); 
				
		int x = 7; // ���� ��
		int y= 5; // �մ� ��
		
		int[] sc = new int[x];
		int[] customer = new int[y];
		
		if(sc.length >= customer.length) {
			for(int i = 0; i<sc.length; i++) { // i = ���� ����
				System.out.print(i +" ");
				y--;
				rr.getNextCall();
			}
		}else if (sc.length < customer.length) {
			
		}
		
		
		

		
	}

}
