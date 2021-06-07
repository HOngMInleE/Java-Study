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
	
// Getter, Setter 캡슐화(외부로부터 숨긴다)
	
//	public int getSpeed() { // 반드시 public + type + get***
//		 return speed;   // return 값은 private 한 멤버변수
//	} 
//		
//	public void setSpeed() { // public + void + set***
//		if (speed < 0) {
//			return; // void 에서 return : 즉시 이 함수의 실행을 종료한다.
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
