public class CarTest {

	public static void main(String[] args) {


//	System.out.println(c.company);
//	c.company = "����ڵ���";	
//	System.out.println(c.company);
//	c.speed = 60;
//	System.out.println(c.speed);

		Car c = new Car();
		System.out.println(c.company);
		
		Car c2 = new Car("����ڵ���", "k8");
		System.out.println(c2.company);
		
		Car c3 = new Car("�����ڸ���", "E250");
		c3.KeyTurnOn();
		c3.Accel();
		c3.KeyTurnOff();
		
		
		
	}
}