import java.sql.*;

public class update {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gym?useSSL=false", "root","" );
            String updateSql="Update users_login set password=? where id=?";
            PreparedStatement ps= con.prepareStatement(updateSql);
            ps.setString(1,"Bimala123" );
            ps.setInt(2,15);
            ps.executeUpdate();
            con.close();
            System.out.println("Updated data successfully");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
