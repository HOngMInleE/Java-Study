package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcCon3 {

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
         
//         String sql = "insert into emp01 values (?,?,?,?,?,?,?,?)";
//         
//         psmt = con.prepareStatement(sql);
//         
//         psmt.setInt(1, 1111);
//         psmt.setString(2, "홍길동");
//         psmt.setString(3, "MANAGER");
//         psmt.setInt(4, 7788);
//         psmt.setString(5, "21/07/07");
//         psmt.setInt(6, 2000);
//         psmt.setInt(7, 0);
//         psmt.setInt(8, 10);
//         
//         String sql = "update emp01 set ename = '이순신' where empno = ?";
//         
//         psmt = con.prepareStatement(sql);
//         
//         psmt.setInt(1, 1111);
         
//         String sql = "delete from emp01 where empno = ?";
//         
//         psmt = con.prepareStatement(sql);
//         
//         psmt.setInt(1, 1111);
//         
//         int result = psmt.executeUpdate();   // insert , update ,delete
//         
//         if(result > 0) {
//            System.out.println("데이터 처리 성공");
//            con.commit();
//         }else {
//            System.out.println("데이터 처리 실패");
//            con.rollback();
//         }
               
         String sql2 = "select empno,ename,sal,dname,grade\r\n"
               + "from emp e,dept d,salgrade s\r\n"
               + "where e.deptno = d.deptno\r\n"
               + "and e.sal BETWEEN s.losal and s.hisal";
         
         psmt = con.prepareStatement(sql2);
         

         rs = psmt.executeQuery();
         
         System.out.println("사원번호  사원명  급여 부서명 급여등급");
         
         while(rs.next()) {
            int empno = rs.getInt(1);
            String ename = rs.getString(2);
            int sal = rs.getInt(3);
            String dname = rs.getString(4);
            int grade = rs.getInt(5);
                     
            System.out.println(empno + "   " + ename + "   " + sal + "   " + dname + "   " + grade);
         }
         
//         System.out.println("사원번호  사원명  직급 매니져 입사일 급여 성과급 부서번호");
//         
//         while(rs.next()) {
//            int empno = rs.getInt(1);
//            String ename = rs.getString(2);
//            String job = rs.getString(3);
//            String mgr = rs.getString(4);
//            String hiredate = rs.getString(5);
//            String sal = rs.getString(6);
//            String comm = rs.getString(7);
//            String deptno = rs.getString(8);
//            
//            
//            System.out.println(empno + "  " + ename + "  " + job + "  " + mgr + "  " + hiredate + "  " + sal + "  " + comm + "  " + deptno);
//         }
         
         
      }catch(SQLException e) {
         e.printStackTrace();
         System.out.println("DB연결 실패");
      } catch (ClassNotFoundException e) {

         e.printStackTrace();
         System.out.println("DB 사용불가");
      }

   }

}