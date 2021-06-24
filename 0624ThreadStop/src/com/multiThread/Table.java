package com.multiThread;

import java.util.ArrayList;

public class Table {

	String[] dishNames = { "Donut", "Dupbap", "Burger" };

	final int MAX_FOOD = 6;

	private ArrayList<String> dishes = new ArrayList<>(); // import해서 사용 // 크기가 정해져있지 않은 배열

	public synchronized void add(String dish) {
		if (dishes.size() >= MAX_FOOD) { // size : 배열의 크기
			return;
		}

		dishes.add(dish);

		System.out.println("Dishes : " + dishes.toString());
	}

	public boolean remove(String dishName) { // 먹으려는 음식(지워지는 배열 항목)
		synchronized (this) {
			for (int i = 0; i < dishes.size(); i++) {
				if (dishName.equals(dishes.get(i))) { // get:ArrayList의 항목 값을 읽어올 수 있다.
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
