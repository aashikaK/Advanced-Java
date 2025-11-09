import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swastikc?useSSL=false","root","");
            String sql="create table tblStudent(
            id int primary key identity,
            name varchar 50,
            email varchar 50);";
            PreparedStatement ps = con.prepareStatement(updatesql);
            ps.executeUpdate();
            con.close();
            System.out.println("Salary updated successfully");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
