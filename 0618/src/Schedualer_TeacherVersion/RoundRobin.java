package Schedualer_TeacherVersion;

public class RoundRobin implements Scheduler {

	public RoundRobin() {
	}

	
	
	
	@Override
	public void getNextCall() {
		System.out.println("������ ��� ��ȭ���Դϴ�. ������� ���� �˴ϴ�.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("������ ���� �մϴ�.");
	}

}
