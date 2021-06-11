package com.Starcraft;

public class SCV extends GroundUnit implements Repairable {

	public SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Unit) {


			Unit u = (Unit) r;
			System.out.println(u + " 을 수리중입니다.");			// override하면 자동호출됨.

			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + " 의 수리를 완료 하였습니다."); // toString 을 지워도 호출이됨.
		} else {
			System.out.println("수리를 할 수 없습니다.");
		}
	}

	@Override
	public String toString() {
		
		return "SCV" ;
	}

	
	
}
