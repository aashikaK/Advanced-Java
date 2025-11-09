import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swastikc?useSSL=false","root","");
            String sql="create table tblStudent(id INT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(50),email VARCHAR(50));";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            String insertSql="insert into tblStudent(name,email) values(?,?)";
            PreparedStatement ips= con.prepareStatement(insertSql);
            ips.setString(1, "Anna Thapa");
            ips.setString(2, "annat2@gmail.com");
            ips.executeUpdate();
            con.close();
            System.out.println("Salary updated successfully");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
