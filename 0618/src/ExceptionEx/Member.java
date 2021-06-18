package ExceptionEx;

public class Member {

	public static void main(String[] args) {

		try {
			login("white", " ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		
	}

	public static void login(String id, String password) 
									throws NotExistIDException, WrongPasswordException {
		
	// id�� "blue"�� �ƴ϶�� NotExistIDException �߻���Ŵ
		if (id.equals(" ")) {
			throw new NotExistIDException("�߸��� �Է� �����Դϴ�.");
		}else if(!id.equals("blue")) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		}
		
	// password�� "12345"�� �ƴ϶�� WrongPasswordException �߻���Ŵ
		if (!password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
	}
	
	
	
}
