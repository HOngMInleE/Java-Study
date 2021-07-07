package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcCon {

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
         
         
         
//         String sql = "select * from dept";
//         
//         psmt = con.prepareStatement(sql);
         
         String sql = "select * from dept where loc = ?";
         
         psmt = con.prepareStatement(sql);
         
         //psmt.setInt(1, 20);
         
         psmt.setString(1, "DALLAS");
         
         rs = psmt.executeQuery();
         
         System.out.println("부서번호  부서명  근무지역");
         
         while(rs.next()) {
            int deptno = rs.getInt(1);
            String dname = rs.getString(2);
            String loc = rs.getString(3);
            
            System.out.println(deptno + "  " + dname + "  " + loc);
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
