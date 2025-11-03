import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym?useSSL=false","root","");

       String insertsql="insert into emp(name,password,email) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(insertsql);
            ps.setString(2, "Bimala");
            ps.setString(3, "bimala12");
            ps.setString(4, "bimala2@gmail.com");
            ps.executeUpdate();
            con.close();
            System.out.println("Data Inserted");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
