package com.cellphone;

public class DmbCellPhone extends CellPhone {

// field
	int channel;

	
// ������
	public DmbCellPhone(String model, String color, int channel) {
		super(); // �θ� �����ڸ� ȣ�� / ������ �⺻�����ڸ� ȣ��
		this.channel = channel;
		this.model = model;
		this.color = color;
	}
	
	
// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
