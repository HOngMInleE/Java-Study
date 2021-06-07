package Exam20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.���� | 6.������ü");
			System.out.println("----------------------------------------------------------");
			System.out.print("����> ");

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
		System.out.println("���α׷� ����");
	}

	// ���»����ϱ�
	private static void createAccount() {
		System.out.println("-------------");
		System.out.println("���� ����");
		System.out.println("-------------");

		System.out.println("���� ��ȣ: ");
		String ano = scanner.next();

		System.out.println("������: ");
		String owner = scanner.next();

		System.out.println("�ʱ� �Աݾ�: ");
		int balance = scanner.nextInt();

		Account newAccount = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) { // null �� ���°����� �Ǿ����� ���� �迭�� ã�Ƽ� �ű⿡ ���� �־���
				accountArray[i] = newAccount; // ã�� �� �迭�� ���������� �־���.
				break; // �Ѹ��� ������ �ѹ��� �ֱ����� �������� / ���ϸ� �Ѹ��� ������ ��� �ְԵ�.
			}
		}
	}

	// ���¸�Ϻ���
	private static void accountList() {
		System.out.println("-------------");
		System.out.println("���� ���");
		System.out.println("-------------");

		for (Account acc : accountArray) {
			if (acc != null) { // �迭�� ������� �ʴٸ� / ���� ���� ���
				System.out.println(acc.getAno() + " " + acc.getOwner() + " " + acc.getBalance());
			}
		}
	}

	// �����ϱ�
	private static void deposit() {
		System.out.println("-------------");
		System.out.println("����");
		System.out.println("-------------");

		System.out.println("���� ��ȣ: ");
		String ano = scanner.next();

		System.out.println("���ݾ�: ");
		int money = scanner.nextInt(); // �迭�� ��, ����� �Ǿ��ִ��� �ȵǾ��ִ��� ���ؾ���.
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("���°� �������� �ʾҽ��ϴ�.");
		}else {
			account.setBalance(account.getBalance() + money);
			System.out.println("���: " + money + " ������ �����Ǿ����ϴ�.");
		}
	}

	// ����ϱ�
	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("���");
		System.out.println("-------------");
		
		System.out.println("���� ��ȣ: ");
		String ano = scanner.next();

		System.out.println("��ݾ�: ");
		int money = scanner.nextInt();
		
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("���°� �������� �ʾҽ��ϴ�.");
			return;
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println("���: " + money + " ����� �����Ǿ����ϴ�.");
		
//		���� ���� �Լ�. 
//		if(account == null) {           
//			System.out.println("���°� �������� �ʾҽ��ϴ�.");
//		}else {
//			account.setBalance(account.getBalance() + money);
//			System.out.println("���: money ������ �����Ǿ����ϴ�.");
//		}
	}

	// Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {

		Account account = null;

		for (Account acc : accountArray) {
			if (acc != null) {
				String dbAno = acc.getAno();
				if (dbAno.equals(ano)) { // String (����)�� ���Ҷ� equals(���ϰ����ϴ� ��ü) �� ���.
					// dbAno == ano �� ���� ��.
					account = acc;
					break; // ã���� �ϴ� ���¹�ȣ�� ã���� �Լ� ����
				}
			}
		}
		return account;
	}
	
	// ���� ��ü ��� �߰�
	// ����ϱ�
		private static void send() {
			System.out.println("-------------");
			System.out.println("���� ��ü");
			System.out.println("-------------");
			
			System.out.println("���� ��ȣ: ");
			String ano = scanner.next();

			System.out.println("��ݾ�: ");
			int money = scanner.nextInt();
				
			Account account = findAccount(ano);
			
			if(account == null) {
				System.out.println("���°� �������� �ʾҽ��ϴ�.");
			}else {				
				account.setBalance(account.getBalance() - money);
				System.out.println("�� ����: " + money + " �� ��ü�� �����Ǿ����ϴ�.");
			}
		}
}
