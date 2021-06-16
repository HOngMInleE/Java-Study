package InnerInterface0615;

public class ButtonTest {

	public static void main(String[] args) {
		
		Button b = new Button();
		
		CallListener c = new CallListener();
		MessageListener m = new MessageListener();
		
		ChattingListener ch = new ChattingListener();
		
		b.setListener(ch);
		
		b.setListener(c);
		b.touch();
		
		b.setListener(m);
		b.touch();
		
	}
}
