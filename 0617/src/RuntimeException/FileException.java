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
		} catch (IOException e) {
			System.out.println("���� ������ ������ �ֽ��ϴ�.");
		}

		System.out.println("���� ���� �Ϸ�");
	}

	public static File createFile(String fileName) throws IOException {

		try {
			if (fileName == null || fileName.equals("")) {
				throw new Exception("������ �̸��� ��ȿ���� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			fileName = "���� ����.txt";
		} finally { // ���ܰ� �߻��ϵ� ���ϵ� �����.
			File f = new File(fileName);

//			try {
			f.createNewFile(); // File Ŭ���� �ȿ� �̹� ���ǰ� �Ǿ��ִ� �޼ҵ�
//			} catch (IOException e) {
//				System.out.println("���� ������ ������ �ֽ��ϴ�.");
//			}
			return f;
		}

	}

}
