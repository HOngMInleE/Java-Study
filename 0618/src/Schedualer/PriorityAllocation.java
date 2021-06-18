package Schedualer;

public class PriorityAllocation implements Scheduler {

	public PriorityAllocation() {
	}

	@Override
	public void getNextCall() {
		System.out.println("순서대로 배분");
	}

	@Override
	public void sendCallToAgent() {

	}

}
