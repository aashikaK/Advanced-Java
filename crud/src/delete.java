import java.sql.*;

public class delete {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gym?useSSL=false", "root","");

            String deleteSql="Delete from users_login where id=?";
            PreparedStatement ps= con.prepareStatement(deleteSql);
            ps.setInt(1, 14);
            ps.executeUpdate();
            con.close();
            System.out.println("Deleted the data");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
