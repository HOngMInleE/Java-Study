package com.Starcraft;

public class Medic extends GroundUnit implements Heal {

	public Medic() {
		super(50);
	}

	void heal(Heal h) {
		if (h instanceof Unit) {

			Unit u = (Unit) h;
			System.out.println(u + " �� ȸ����Ű�� ���Դϴ�.");			// override�ϸ� �ڵ�ȣ���.

			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + " �� ü���� ��� ȸ�� �Ͽ����ϴ�."); // toString �� ������ ȣ���̵�.
		} else {
			System.out.println("ȸ���� �� �� ���� ����Դϴ�.");
		}
	}

	@Override
	public String toString() {
		return "Medic";
	}
	
	
}
