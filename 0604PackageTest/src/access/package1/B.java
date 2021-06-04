package access.package1;

public class B { // 같은 package 이기 때문에 private 빼고 전부 사용 가능
	
	public B() {
		A a = new A();

		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; // private

		a.method1();
		a.method2();
//		a.method3(); // private
	}
}
