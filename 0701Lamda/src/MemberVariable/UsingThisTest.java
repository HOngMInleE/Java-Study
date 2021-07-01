package MemberVariable;

public class UsingThisTest {

	public static void main(String...  args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner(); // 내부 클래스를 참조한 객체 생성 방법
		inner.method();
	}
}
