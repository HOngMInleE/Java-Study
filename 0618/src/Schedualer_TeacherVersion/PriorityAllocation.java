package Schedualer_TeacherVersion;

public class PriorityAllocation implements Scheduler {

	public PriorityAllocation() {
	}

	@Override
	public void getNextCall() {
		System.out.println("(고객등급에 따라) 상담원이 대기중입니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담원을 연결합니다.");

	}

}
