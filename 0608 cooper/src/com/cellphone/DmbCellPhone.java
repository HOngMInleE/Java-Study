package com.cellphone;

public class DmbCellPhone extends CellPhone {

// field
	int channel;

	
// ������
	public DmbCellPhone(String model, String color, int channel) {
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
