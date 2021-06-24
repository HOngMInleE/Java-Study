package com.multiThread;

import java.util.ArrayList;

public class Table {

	String[] dishNames = { "Donut", "Dupbap", "Burger" };

	final int MAX_FOOD = 6;

	private ArrayList<String> dishes = new ArrayList<>(); // import�ؼ� ��� // ũ�Ⱑ ���������� ���� �迭

	public synchronized void add(String dish) {
		if (dishes.size() >= MAX_FOOD) { // size : �迭�� ũ��
			return;
		}

		dishes.add(dish);

		System.out.println("Dishes : " + dishes.toString());
	}

	public boolean remove(String dishName) { // �������� ����(�������� �迭 �׸�)
		synchronized (this) {
			for (int i = 0; i < dishes.size(); i++) {
				if (dishName.equals(dishes.get(i))) { // get:ArrayList�� �׸� ���� �о�� �� �ִ�.
					dishes.remove(i);
					return true;
				}
			}
			return false;
		}
	}

	public int dishNum() {
		return dishNames.length;
	}

}
