package Schedualer_TeacherVersion;

public class LeastJob implements Scheduler {

	public LeastJob() {
	}

	
	
	
	@Override
	public void getNextCall() {
		System.out.println("����Ⱑ ���� ���� �������� ���� ������Դϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("������ �����մϴ�.");
	}

}
