package Exam20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 | 6.계좌이체");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;				
			}else if (selectNo == 6) {
				send();
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("-------------");
		System.out.println("계좌 생성");
		System.out.println("-------------");

		System.out.println("계좌 번호: ");
		String ano = scanner.next();

		System.out.println("계좌주: ");
		String owner = scanner.next();

		System.out.println("초기 입금액: ");
		int balance = scanner.nextInt();

		Account newAccount = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) { // null 즉 계좌개설이 되어있지 않은 배열을 찾아서 거기에 값을 넣어줌
				accountArray[i] = newAccount; // 찾은 빈 배열에 계좌정보를 넣어줌.
				break; // 한명의 정보를 한번만 넣기위해 강제종료 / 안하면 한명의 정보를 계속 넣게됨.
			}
		}
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("-------------");
		System.out.println("계좌 목록");
		System.out.println("-------------");

		for (Account acc : accountArray) {
			if (acc != null) { // 배열이 비어있지 않다면 / 계좌 정보 출력
				System.out.println(acc.getAno() + " " + acc.getOwner() + " " + acc.getBalance());
			}
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");

		System.out.println("계좌 번호: ");
		String ano = scanner.next();

		System.out.println("예금액: ");
		int money = scanner.nextInt(); // 배열과 비교, 등록이 되어있는지 안되어있는지 비교해야함.
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("계좌가 개설되지 않았습니다.");
		}else {
			account.setBalance(account.getBalance() + money);
			System.out.println("결과: " + money + " 예금이 성공되었습니다.");
		}
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");
		
		System.out.println("계좌 번호: ");
		String ano = scanner.next();

		System.out.println("출금액: ");
		int money = scanner.nextInt();
		
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("계좌가 개설되지 않았습니다.");
			return;
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: " + money + " 출금이 성공되었습니다.");
		
//		같은 뜻의 함수. 
//		if(account == null) {           
//			System.out.println("계좌가 개설되지 않았습니다.");
//		}else {
//			account.setBalance(account.getBalance() + money);
//			System.out.println("결과: money 예금이 성공되었습니다.");
//		}
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {

		Account account = null;

		for (Account acc : accountArray) {
			if (acc != null) {
				String dbAno = acc.getAno();
				if (dbAno.equals(ano)) { // String (문자)를 비교할땐 equals(비교하고자하는 객체) 를 사용.
					// dbAno == ano 와 같은 식.
					account = acc;
					break; // 찾고자 하는 계좌번호를 찾으면 함수 종료
				}
			}
		}
		return account;
	}
	
	// 계좌 이체 기능 추가
	// 출금하기
		private static void send() {
			System.out.println("-------------");
			System.out.println("계좌 이체");
			System.out.println("-------------");
			
			System.out.println("계좌 번호: ");
			String ano = scanner.next();

			System.out.println("출금액: ");
			int money = scanner.nextInt();
				
			Account account = findAccount(ano);
			
			if(account == null) {
				System.out.println("계좌가 개설되지 않았습니다.");
			}else {				
				account.setBalance(account.getBalance() - money);
				System.out.println("내 계좌: " + money + " 로 이체가 성공되었습니다.");
			}
		}
}
