package com.abstractEx;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog("������");
		Cat cat = new Cat("�����");
		
		dog.sound();
		cat.sound();
		System.out.println(cat.kind);
		
		
		Animal an1 = new Dog("������");
		an1.sound(); // override �߱� ������ �θ� ȣ���ص�, override �� �ڽ��� �޼ҵ尡 ȣ���
		
		animalSound(dog);
		animalSound(cat);
	}

	public static void animalSound(Animal animal) {
		animal.sound(); // sound �� override �� �Լ��̱� ������ instanceof(��üŸ��Ȯ��)�� ���� �ʾƵ� �ȴ�.
	}
	
	
}
