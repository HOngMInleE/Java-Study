package Schedualer_TeacherVersion;

public class LeastJob implements Scheduler {

	public LeastJob() {
	}

	
	
	
	@Override
	public void getNextCall() {
		System.out.println("상담대기가 가장 적은 상담원에게 연결 대기중입니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담원을 연결합니다.");
	}

}
