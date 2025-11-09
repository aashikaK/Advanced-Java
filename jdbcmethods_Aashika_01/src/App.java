import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swastikc?useSSL=false","root","");
            Statement stmt= con.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT * FROM emp ORDER BY id");
          
            rs.first();
            System.out.println("First Record:\n Id: "+ rs.getInt("id") +" Name: " + rs.getString("name")+" Salary: " + rs.getDouble("salary") + " Gender: "+ rs.getString("gender"));

            rs.last();
            System.out.println("Last Record:\n Id: "+ rs.getInt("id") +" Name: " + rs.getString("name")+" Salary: " + rs.getDouble("salary") + " Gender: "+ rs.getString("gender"));

            rs.previous();
            System.out.println("Previous Record:\n Id: "+ rs.getInt("id") +" Name: " + rs.getString("name")+" Salary: " + rs.getDouble("salary") + " Gender: "+ rs.getString("gender"));

            rs.next();
            System.out.println("Previous Record:\n Id: "+ rs.getInt("id") +" Name: " + rs.getString("name")+" Salary: " + rs.getDouble("salary") + " Gender: "+ rs.getString("gender"));

            rs.close();
            stmt.close();
            con.close();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
