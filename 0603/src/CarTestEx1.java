public class CarTestEx1 {
	public static void main(String[] args) {
		CarEx1 car1 = new CarEx1();
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		CarEx1 car2 = new CarEx1("�ڰ���");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();

		CarEx1 car3 = new CarEx1("�ڰ���", "����");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();

		CarEx1 car4 = new CarEx1("�ý�", "����", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}
