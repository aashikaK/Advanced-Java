import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
     JFrame f= new JFrame();
     f.setTitle("Login From");

     JTextField unField= new JTextField();
     JLabel unLabel= new JLabel("Username: ");
     unLabel.setBounds(20, 020, 70, 30);
     unField.setBounds(100,20,100,30);   
     f.add(unField);
     f.add(unLabel);

     
     JPasswordField pwField= new JPasswordField();
     JLabel pwLabel= new JLabel("Password: ");
     pwLabel.setBounds(20, 60, 70, 30);
     pwField.setBounds(100,60,100,30);   
     f.add(pwField);
     f.add(pwLabel);

     JButton btnLogin= new JButton("Login");
     btnLogin.setBounds(60,90,70,30);
     f.add(btnLogin);

     
     f.setLayout(new GridLayout(3,2,4,4));
     f.setSize(250,120);
     f.setVisible(true);
    }
}
