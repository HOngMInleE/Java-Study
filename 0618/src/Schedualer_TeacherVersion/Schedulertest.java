package Schedualer_TeacherVersion;

import java.util.Scanner;

public class Schedulertest {

	public static void main(String[] args) {
		
		System.out.println("���� ���� ����� �����ϼ���: ");
		System.out.println("R : �Ѹ� ������� ���");
		System.out.println("L : ��� ������ ���� ª�� �������� ��� ");
		System.out.println("P : �� ��޿� ���� ���");
		
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
