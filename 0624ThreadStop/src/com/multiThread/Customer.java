package com.multiThread;

public class Customer implements Runnable {

	private Table table;
	private String food;
	
	
	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				
			}
			
			String name = Thread.currentThread().getName();
			
			if(eatFood()) {
				System.out.println(name + " 음식을 먹었습니다.");
			}else {
				System.out.println(name + " 음식을 못 먹었습니다.");
			}
			
		}
	}

	boolean eatFood() {
		return table.remove(food);
	}
	

}
