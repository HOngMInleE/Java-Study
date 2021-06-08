package com.cellphone;

public class DmbCellPhone extends CellPhone {

// field
	int channel;

	
// 생성자
	public DmbCellPhone(String model, String color, int channel) {
		super(); // 부모 생성자를 호출 / 없으면 기본생성자를 호출
		this.channel = channel;
		this.model = model;
		this.color = color;
	}
	
	
// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
