package Schedualer_TeacherVersion;

import java.util.Scanner;

public class Schedulertest {

	public static void main(String[] args) {
		
		System.out.println("상담원 연결 방식을 선택하세요: ");
		System.out.println("R : 한명씩 순서대로 상담");
		System.out.println("L : 대기 순서가 가장 짧은 상담원에게 상담 ");
		System.out.println("P : 고객 등급에 따라 상담");
		
		Scanner sc = new Scanner(System.in);
//		char c = sc.nextLine().charAt(0);
		String s = sc.nextLine();
		
//		Scheduler rr = new RoundRobin();
//		Scheduler lj = new LeastJob();
//		Scheduler pa = new PriorityAllocation();
		
		Scheduler sch = null;
		
		if(s.equalsIgnoreCase("r")) {
			sch = new RoundRobin();
		}else if (s.equalsIgnoreCase("l")) {
			sch = new LeastJob();
		}else if (s.equalsIgnoreCase("p")) {
			sch = new PriorityAllocation();
		}
		
		sch.getNextCall();
		sch.sendCallToAgent();
		
		
		
		
	}

}
