package interfaceField;

public class HankookTire extends TireInfo {

// 필드 (field)

// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
//		location = "한국타이어"; 
	}

// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation; // 누적 회전수 1 증가
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + 
					(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}

}
