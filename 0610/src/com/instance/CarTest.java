package com.instance;

public class CarTest {

	public static void main(String[] args) {
		FireCar fc = new FireCar();
		Ambulance ab = new Ambulance();
		
		work(fc);
		work(ab);
	}
// 강제형변환
	public static void work(Car c) {
		if(c instanceof FireCar) {
			FireCar fc = (FireCar) c;
			fc.fire();		// 강제형변환 하지 않으면 자식 객체의 함수를 사용할 수 없음. 
		}else if(c instanceof Ambulance) {
			Ambulance ab = (Ambulance) c;
			ab.siren();
		}
	}
	
	
}
