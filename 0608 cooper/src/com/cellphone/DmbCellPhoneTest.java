package com.cellphone;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		
	// DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
								// () = ������ ȣ�� / ��ü�� ������ �� �ݵ�� �ؾ���.
		
	// CellPhone ���κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);
		
	// DmbCellPhone�� �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);
		
	// CellPHone ���κ��� ��� ���� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�");
		dmbCellPhone.hangUp();
		
	// DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
