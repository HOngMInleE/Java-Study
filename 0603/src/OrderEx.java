
public class OrderEx {

//	int num;// �ֹ���ȣ : 2021060300001
//	String user;// �ֹ��� ���̵�: abc123
//	int date;// �ֹ� ��¥: 2021/03/12
//	String name;// �ֹ��� �̸�: ȫ�浿
//	String itNum;// �ֹ���ǰ��ȣ: PD03214-12
//	String AD;// ����ּ�: ����� ��������
	
	// Ŭ������ �����Ѵ� 
	// Ŭ������ : Order
	// �����ڸ� �̿��� �ʱ�ȭ
	// ��¸޼ҵ� : orderPrint()
	
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
		System.out.println("�ֹ���ȣ : " + orderNo);
		System.out.println("�ֹ��� ���̵� : " + orderId);
		System.out.println("�ֹ� ��¥ : " + orderDate );
		System.out.println("�ֹ��� �̸� : " + orderName);
		System.out.println("�ֹ� ��ǰ��ȣ : " + productNo);
		System.out.println("��� �ּ� : " + orderAddress);
	}
	
}
