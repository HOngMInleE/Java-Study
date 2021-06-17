package RuntimeException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �̸��� �Է��ϼ���: ");
		String fileName = sc.nextLine();

		try {
			
			File f = createFile(fileName);
			System.out.println("���� ���� �Ϸ�");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static File createFile(String fileName) throws IOException, Exception {

//		try {
		
			if (fileName == null || fileName.equals("")) {
				throw new Exception("������ �̸��� ��ȿ���� �ʽ��ϴ�.");
			}
			
//		} catch (Exception e) {
//			fileName = "���� ����.txt";
//		} finally { // ���ܰ� �߻��ϵ� ���ϵ� �����.
			
			File f = new File(fileName);

//			try {
			
			f.createNewFile(); // File Ŭ���� �ȿ� �̹� ���ǰ� �Ǿ��ִ� �޼ҵ�
			
//			} catch (IOException e) {
//				System.out.println("���� ������ ������ �ֽ��ϴ�.");
//			}
			return f;
//		}

	}

}
