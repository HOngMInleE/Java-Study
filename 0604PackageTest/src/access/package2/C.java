package access.package2;

import access.package1.A;

public class C { // public ���� ���� ��� �Ұ���
	
	public C() {
		A a = new A();

		a.field1 = 1; // public 
//		a.field2 = 1; // default
//		a.field3 = 1; // private

		a.method1(); // public 
//		a.method2(); // default
//		a.method3(); // private
	}
}
