package MultiTypeParameter;

public class ProductTest {

	public static void main(String[] args) {

		Product<Tv, String> product1 = new Product<>(); // 타입 사용을 위해 Tv 객체 생성(클래스)
		
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.println(tvModel); 
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println(carModel); 
	
	}

}
