package Schedualer_TeacherVersion;

public class RoundRobin implements Scheduler {

	public RoundRobin() {
	}

	
	
	
	@Override
	public void getNextCall() {
		System.out.println("상담원이 모두 통화중입니다. 순서대로 연결 됩니다.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담원을 연결 합니다.");
	}

}
