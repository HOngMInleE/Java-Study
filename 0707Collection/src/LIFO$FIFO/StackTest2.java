package LIFO$FIFO;

import java.util.Stack;

public class StackTest2 {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		goURL("1.Naver");
		goURL("2.Daum");
		goURL("3.Youtube");
		goURL("4.Google");
		
		printURL();
		
		goBack();
		System.out.println("\n" + "�ڷΰ��� Ŭ��" + "\n");
		printURL();
		
		goBack();
		System.out.println("\n" + "�ڷΰ��� Ŭ��" + "\n");
		printURL();
		
		goForward();
		System.out.println("\n"+ "�����ΰ��� Ŭ��" + "\n");
		printURL();
		
		goURL("�޸ձ�������");
		System.out.println("\n" + "���ο� ����Ʈ �湮" + "\n");
		printURL();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
	
	public static void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}
	
	public static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}
	
	public static void printURL() {
		System.out.println("back " + back);
		System.out.println("forward " + forward);
		
		System.out.println("���� ����Ʈ : " + back.peek());
	}

}
