import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym?useSSL=false","root","");
            
       String insertsql="insert into users_login(username,password,email) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(insertsql);
            for(int i=0;i<5;i++){

            }
            ps.setString(1, "Bimala");
            ps.setString(2, "bimala12");
            ps.setString(3, "bimala2@gmail.com");
            ps.executeUpdate();
            con.close();
            System.out.println("Data Inserted");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
