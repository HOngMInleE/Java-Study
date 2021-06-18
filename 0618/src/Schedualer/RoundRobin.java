package Schedualer;

public class RoundRobin implements Scheduler {

	public RoundRobin() {
	}

	
	
	
	@Override
	public void getNextCall() {
		System.out.println("순서대로 배분");

	}

	@Override
	public void sendCallToAgent() {

	}

}
