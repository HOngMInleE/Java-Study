package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcCon2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Connection con = null;
      ResultSet rs = null;
      PreparedStatement psmt = null;

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String id = "scott";
         String pw = "TIGER";
         
         con = DriverManager.getConnection(url,id,pw);
         
//     // emp01 데이터 삽입하기
//     //  sql += "values(1111, '홍길동', 'MANAGER', 7788, '21/07/07',' ', 2000,' ', 10)";
//         
//         String sql = "insert into emp01 values (?,?,?,?,?,?,?,?)";
//         
//         psmt = con.prepareStatement(sql);
//         
//         psmt.setInt(1, 1111);
//         psmt.setString(2, "홍길동");
//         psmt.setString(3, "MANAGER");
//         psmt.setInt(4, 7788);
//         psmt.setString(5,"21/07/07");
//         psmt.setInt(6,2000);
//         psmt.setInt(7, 0);
//         psmt.setInt(8, 10);
         
         String sql = "update emp01 set ename = '이순신' where empno = ?";
         
         psmt = con.prepareStatement(sql);
         
         psmt.setInt(1,1111);
         
         int result = psmt.executeUpdate();		// insert, update, delete 때 사용 
         
         if(result > 0) {
        	 System.out.println("데이터 삽입 성공");
        	 con.commit();        	 
         } else {
        	 System.out.println("데이터 삽입 실패");
        	 con.rollback();
         }
        
         
        
         String sql1 = "select * from emp01";
         
         psmt = con.prepareStatement(sql1);
         
         rs = psmt.executeQuery();
         
         System.out.println("부서번호  부서명  근무지역 ");
         
         while(rs.next()) {
        	 int empno = rs.getInt(1);
        	 String ename = rs.getString(2);
        	 String job = rs.getString(3);
        	 String mgr = rs.getString(4);
        	 String hiredate = rs.getString(5);
        	 String sal = rs.getString(6);
        	 String comm = rs.getString(7);
        	 String deptno = rs.getString(8);
        	 
        	 
        	 System.out.println(empno + " " +ename +" " + job + " " + 
        	 mgr +" " + hiredate +" " + sal + " " +comm + " " +deptno);
         }
         
      }catch(SQLException e) {
         e.printStackTrace();
         System.out.println("DB연결 실패");
      } catch (ClassNotFoundException e) {

         e.printStackTrace();
         System.out.println("DB 사용불가");
      }

   }

}
