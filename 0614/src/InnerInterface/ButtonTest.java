package InnerInterface;

public class ButtonTest {

	public static void main(String[] args) {
		
		Button b = new Button();
		
		CallListener c = new CallListener();
		MessageListener m = new MessageListener();
		
		b.setListener(c);
		b.touch();
		
		b.setListener(m);
		b.touch();
		
	}
}
