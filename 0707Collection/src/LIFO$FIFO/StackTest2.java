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
		System.out.println("\n" + "뒤로가기 클릭" + "\n");
		printURL();
		
		goBack();
		System.out.println("\n" + "뒤로가기 클릭" + "\n");
		printURL();
		
		goForward();
		System.out.println("\n"+ "앞으로가기 클릭" + "\n");
		printURL();
		
		goURL("휴먼교육센터");
		System.out.println("\n" + "새로운 사이트 방문" + "\n");
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
		
		System.out.println("현재 사이트 : " + back.peek());
	}

}
