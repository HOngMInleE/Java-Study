package interfaceField;

public class KumhoTire extends TireInfo {

	// 필드 (field)

	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); // 부모가 생성자를 호출하였기 때문에 필연적으로 자식도 부모의 생성자를 호출해야함.
	}

	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation; // 누적 회전수 1 증가
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + 
					(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}

}
