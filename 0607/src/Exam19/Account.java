package Exam19;

public class Account {

	 private int balance;
	 static int MIN_BALANCE = 0;
	 static int NAX_BALANCE = 1000000;
	 
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		
		if(balance < MIN_BALANCE || balance > NAX_BALANCE) {
			System.out.println("금액을 확인하세요");
			return; // 함수의 실행 강제 종료
		}
		this.balance = balance;
	}
	
	 
	 
}
