package com.Starcraft;

public class SCV extends GroundUnit implements Repairable {

	public SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Unit) {


			Unit u = (Unit) r;
			System.out.println(u + " �� �������Դϴ�.");			// override�ϸ� �ڵ�ȣ���.

			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + " �� ������ �Ϸ� �Ͽ����ϴ�."); // toString �� ������ ȣ���̵�.
		} else {
			System.out.println("������ �� �� �����ϴ�.");
		}
	}

	@Override
	public String toString() {
		
		return "SCV" ;
	}

	
	
}
