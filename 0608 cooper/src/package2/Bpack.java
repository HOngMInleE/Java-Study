package package2;

import package1.Apack;

public class Bpack extends Apack{

//	Apack ap = new Apack();
//	ap.y = 100;
	
	void printTest() {
//		x = 10; // ¿À·ù private 
		y = 20; // protected
		z = 30; // public 
		
//		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
