public class CarTest {

	public static void main(String[] args) {

		Car c = new Car();
		System.out.println(c.company);

		Car c2 = new Car("기아자동차", "k8");
		System.out.println(c2.company);

//	System.out.println(c.company);
//	c.company = "기아자동차";	
//	System.out.println(c.company);
//	c.speed = 60;
//	System.out.println(c.speed);

	}
}