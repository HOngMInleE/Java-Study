package MemberVariable;

public class UsingThisTest {

	public static void main(String...  args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner(); // ���� Ŭ������ ������ ��ü ���� ���
		inner.method();
	}
}
