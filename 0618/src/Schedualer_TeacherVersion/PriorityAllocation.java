package Schedualer_TeacherVersion;

public class PriorityAllocation implements Scheduler {

	public PriorityAllocation() {
	}

	@Override
	public void getNextCall() {
		System.out.println("(����޿� ����) ������ ������Դϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("������ �����մϴ�.");

	}

}
