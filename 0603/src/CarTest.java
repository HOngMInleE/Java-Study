public class CarTest {

	public static void main(String[] args) {


//	System.out.println(c.company);
//	c.company = "기아자동차";	
//	System.out.println(c.company);
//	c.speed = 60;
//	System.out.println(c.speed);

		Car c = new Car();
		System.out.println(c.company);
		
		Car c2 = new Car("기아자동차", "k8");
		System.out.println(c2.company);
		
		Car c3 = new Car("벤츠코리아", "E250");
		c3.KeyTurnOn();
		c3.Accel();
		c3.KeyTurnOff();
		
		
		
	}
}