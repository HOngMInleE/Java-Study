
public class OrderEx {

//	int num;// 주문번호 : 2021060300001
//	String user;// 주문자 아이디: abc123
//	int date;// 주문 날짜: 2021/03/12
//	String name;// 주문자 이름: 홍길동
//	String itNum;// 주문상품번호: PD03214-12
//	String AD;// 배송주소: 서울시 영등포구
	
	// 클래스를 정의한다 
	// 클래스명 : Order
	// 생성자를 이용한 초기화
	// 출력메소드 : orderPrint()
	
	String orderNo;
	String orderId;
	String orderDate;
	String orderName;
	String productNo;
	String orderAddress;
	

	
	
	OrderEx(String orderNo, String orderId, String orderDate, String orderName, String productNo,
			String orderAddress) {
		this.orderNo = orderNo;
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderName = orderName;
		this.productNo = productNo;
		this.orderAddress = orderAddress;
	}

	void orderPrint() {
		System.out.println("주문번호 : " + orderNo);
		System.out.println("주문자 아이디 : " + orderId);
		System.out.println("주문 날짜 : " + orderDate );
		System.out.println("주문자 이름 : " + orderName);
		System.out.println("주문 상품번호 : " + productNo);
		System.out.println("배송 주소 : " + orderAddress);
	}
	
}
