package RuntimeException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 파일 이름을 입력하세요: ");
		String fileName = sc.nextLine();

		try {
			File f = createFile(fileName);
		} catch (IOException e) {
			System.out.println("파일 생성에 문제가 있습니다.");
		}

		System.out.println("파일 생성 완료");
	}

	public static File createFile(String fileName) throws IOException {

		try {
			if (fileName == null || fileName.equals("")) {
				throw new Exception("파일의 이름이 유효하지 않습니다.");
			}
		} catch (Exception e) {
			fileName = "제목 없음.txt";
		} finally { // 예외가 발생하둔 안하든 실행됨.
			File f = new File(fileName);

//			try {
			f.createNewFile(); // File 클래스 안에 이미 정의가 되어있는 메소드
//			} catch (IOException e) {
//				System.out.println("파일 생성에 문제가 있습니다.");
//			}
			return f;
		}

	}

}
