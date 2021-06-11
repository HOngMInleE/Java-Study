package com.Starcraft;

public class Medic extends GroundUnit implements Heal {

	public Medic() {
		super(50);
	}

	void heal(Heal h) {
		if (h instanceof Unit) {

			Unit u = (Unit) h;
			System.out.println(u + " 을 회복시키는 중입니다.");			// override하면 자동호출됨.

			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + " 의 체력을 모두 회복 하였습니다."); // toString 을 지워도 호출이됨.
		} else {
			System.out.println("회복을 할 수 없는 대상입니다.");
		}
	}

	@Override
	public String toString() {
		return "Medic";
	}
	
	
}
