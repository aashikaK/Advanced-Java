import java.sql.*;
import java.util.Scanner;

public class UpdateEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/swastikc?useSSL=false", "root", "");
            System.out.print("Enter Employee ID to update: ");
            int empId = sc.nextInt();
            sc.nextLine(); 
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM emp WHERE id = ?",
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE
            );
            ps.setInt(1, empId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Current Name: " + rs.getString("name"));
                System.out.print("Enter new name: ");
                String newName = sc.nextLine();
                rs.updateString("name", newName);
                rs.updateRow(); 
                System.out.println("Employee name updated successfully!");
            } else {
                System.out.println("Employee with ID " + empId + " not found.");
            }
            rs.close();
            ps.close();
            con.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
