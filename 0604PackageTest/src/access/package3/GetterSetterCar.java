package access.package3;

public class GetterSetterCar {

	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
// Getter, Setter ĸ��ȭ(�ܺηκ��� �����)
	
//	public int getSpeed() { // �ݵ�� public + type + get***
//		 return speed;   // return ���� private �� �������
//	} 
//		
//	public void setSpeed() { // public + void + set***
//		if (speed < 0) {
//			return; // void ���� return : ��� �� �Լ��� ������ �����Ѵ�.
//		}else {
//			this.speed = speed;			
//		}
//	}
//	
//	public boolean isStop() {
//		return stop;
//	}
//	
//	public void setStop(boolean stop) {
//			this.stop = stop;
//	}
	
	
	
}
