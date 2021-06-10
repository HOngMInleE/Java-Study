package com.abstractEx;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog("강아지");
		Cat cat = new Cat("고양이");
		
		dog.sound();
		cat.sound();
		System.out.println(cat.kind);
		
		
		Animal an1 = new Dog("강아지");
		an1.sound(); // override 했기 때문에 부모를 호출해도, override 된 자식의 메소드가 호출됨
		
		animalSound(dog);
		animalSound(cat);
	}

	public static void animalSound(Animal animal) {
		animal.sound(); // sound 가 override 된 함수이기 때문에 instanceof(객체타입확인)을 하지 않아도 된다.
	}
	
	
}
