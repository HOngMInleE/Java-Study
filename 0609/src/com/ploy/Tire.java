package com.ploy;

public class Tire {

// �ʵ� (field)
	public int maxRotation;					// �ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation ; 		// ���� ȸ����
	public String location; 				// Ÿ�̾��� ��ġ
	
	
// ������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	
// �޼ҵ�
	public boolean roll() {
		++accumulatedRotation;	// ���� ȸ���� 1 ����	// ������������ ��ġ�� ���� ������ https://dojang.io/mod/page/view.php?id=96   
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire ����: " + 
					(maxRotation-accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
}
