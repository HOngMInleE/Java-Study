package com.multiThread;

import java.util.ArrayList;

public class Table {

	String[] dishNames = { "Donut", "Donut", "Burger" };

	final int MAX_FOOD = 6;

	private ArrayList<String> dishes = new ArrayList<>(); // import�ؼ� ��� // ũ�Ⱑ ���������� ���� �迭

	public synchronized void add(String dish) {

		while (dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + "is waiting");

			try {
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		dishes.add(dish);
		notifyAll();
		System.out.println("Dishes : " + dishes.toString());

//		if (dishes.size() >= MAX_FOOD) { // size : �迭�� ũ��
//			return;
//		}
//		
//		dishes.add(dish);
//		System.out.println("Dishes : " + dishes.toString());

	}

	public void remove(String dishName) { // �������� ����(�������� �迭 �׸�)
		synchronized (this) {
			
			String name = Thread.currentThread().getName();
			while (dishes.size() == 0) {
				System.out.println(name + "is waiting");
				try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
			}

			while (true) {
				for (int i = 0; i < dishes.size(); i++) {
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notifyAll();
						return; // remove �Լ��� �����ϴ� ����.
					}
				}
				try { 
					System.out.println(name + "is waiting");
					wait();
					Thread.sleep(500);

				} catch (InterruptedException e) { e.printStackTrace(); }
			}

//			for (int i = 0; i < dishes.size(); i++) {
//				if (dishName.equals(dishes.get(i))) { // get:ArrayList�� �׸� ���� �о�� �� �ִ�.
//					dishes.remove(i);
//					return true;
//				}
//			}
//			return false;
			
		}

	}

	public int dishNum() {
		return dishNames.length;
	}

}
