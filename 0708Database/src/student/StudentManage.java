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
		System.out.println("       SMHRD�л����� ���α׷�      ");
		System.out.println("===============================");
		
		while (true) {
			
			System.out.print("1.�л��߰� 2.��ü�л���ȸ 3.Ư���л���ȸ 4.�л��������� 5.�л����� 6.���α׷�����" + "\n");
			System.out.println("�޴� ���� >> ");
			menu = sc.nextInt();
			
			switch (menu) {
			
			case 1 :
				System.out.println("����� �л��� ������ �Է��ϼ���.");
				System.out.println("�̸� : ");
				name = sc.next();
				System.out.println("���� : ");
				age = sc.nextInt();
				System.out.println("��ȭ��ȣ : ");
				phone = sc.next();
				System.out.println("�̸��� : ");
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
						System.out.println("�л��߰� ����");
					} else {
						System.out.println("�л��߰� ����");
					}
					
				} catch (ClassNotFoundException e) {

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						pst.close();  // DB ��� �����, ��������ֱ� ���� ���
						conn.close();						
					} catch (SQLException e) {
						
					} // try catch end
				} // try catch finally end
				
				System.out.println();
				break;
				
			case 2:
				System.out.println("==== SMHRD�л� ��� ====");
				
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
