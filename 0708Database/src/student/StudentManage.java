package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		int menu = 0;
		int no = 0;
		String name = "";
		int age = 0;
		String phone = "";
		String email = "";
		String search = "";
		String sql = "";
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "TIGER";
		
		System.out.println("===============================");
		System.out.println("       SMHRD학생관리 프로그램      ");
		System.out.println("===============================");
		
		while (true) {
			
			System.out.print("1.학생추가 2.전체학생조회 3.특정학생조회 4.학생정보수정 5.학생삭제 6.프로그램종료" + "\n");
			System.out.println("메뉴 선택 >> ");
			menu = sc.nextInt();
			
			switch (menu) {
			
			case 1 :
				System.out.println("등록할 학생의 정보를 입력하세요.");
				System.out.println("이름 : ");
				name = sc.next();
				System.out.println("나이 : ");
				age = sc.nextInt();
				System.out.println("전화번호 : ");
				phone = sc.next();
				System.out.println("이메일 : ");
				email = sc.next();
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url,id,pw);
					sql = "insert into student values (studentSeq.nextval,?,?,?,?)";
					pst = conn.prepareStatement(sql);
					pst.setString(1, name);
					pst.setInt(2, age);
					pst.setString(3, phone);
					pst.setString(4, email);
					
					int cnt = pst.executeUpdate();
					if (cnt > 0) {
						System.out.println("학생추가 성공");
					} else {
						System.out.println("학생추가 실패");
					}
					
				} catch (ClassNotFoundException e) {

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						pst.close();  // DB 계속 실행됨, 종료시켜주기 위해 사용
						conn.close();						
					} catch (SQLException e) {
						
					} // try catch end
				} // try catch finally end
				
				System.out.println();
				break;
				
			case 2:
				System.out.println("==== SMHRD학생 목록 ====");
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url,id,pw);
					sql = "select rownum, a.* from student a order by no desc";
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				break;
				
			} // switch end
			
		} // while end
		
	} // main end

} // Class StudentManage end
