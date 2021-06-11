package interfaceField;

public abstract class TireInfo implements Tire {

	// 필드 (field)
		public int maxRotation;					// 최대 회전수(타이어 수명)
		public int accumulatedRotation ; 		// 누적 회전수
		public String location; 				// 타이어의 위치
		
		
	// 생성자
			public TireInfo(String location, int maxRotation) {
			this.location = location;
			this.maxRotation = maxRotation;
		}

}
