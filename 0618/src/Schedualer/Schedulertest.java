package Schedualer;

public class Schedulertest {

	public static void main(String[] args) {
		
		PriorityAllocation pa = new PriorityAllocation(); // 우선 순위
		LeastJob lj = new LeastJob(); // 짧은 대기열
		RoundRobin rr = new RoundRobin(); // 직원 순서
		
//		int wait = (int) pa.getNextCall(); 
				
		int x = 7; // 직원 수
		int y= 5; // 손님 수
		
		int[] sc = new int[x];
		int[] customer = new int[y];
		
		if(sc.length >= customer.length) {
			for(int i = 0; i<sc.length; i++) { // i = 직원 순서
				System.out.print(i +" ");
				y--;
				rr.getNextCall();
			}
		}else if (sc.length < customer.length) {
			
		}
		
		
		

		
	}

}
