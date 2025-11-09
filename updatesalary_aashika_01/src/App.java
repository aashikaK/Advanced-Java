import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swastikc?useSSL=false","root","");
            String insertsql="insert into student(name,gender,address) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(insertsql);
            Scanner sc= new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.println("\nEnter details of student " + (i + 1));
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Gender: ");
                String gender = sc.nextLine();

                System.out.print("Address: ");
                String address = sc.nextLine();

                ps.setString(1, name);
                ps.setString(2, gender);
                ps.setString(3, address);
                ps.executeUpdate();
            }
            con.close();
            sc.close();
            System.out.println("Data Inserted");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
