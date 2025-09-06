import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
     JFrame f= new JFrame();
     f.setTitle("Login From");

   

    GridBagLayout gbl= new GridBagLayout();
    f.setLayout(gbl);
    GridBagConstraints gbc= new GridBagConstraints();
    gbc.insets = new Insets(2,2,2,2);

     JLabel unLabel= new JLabel("Username: ");
     gbc.gridx =0; //column
     gbc.gridy= 0; //row
     gbc.anchor = GridBagConstraints.EAST;
     
     f.add(unLabel,gbc);

       JTextField unField= new JTextField(5);
       gbc.gridx=1;
       gbc.gridy=0;
       gbc.anchor= GridBagConstraints.WEST;
       f.add(unField,gbc);

JLabel pwLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        f.add(pwLabel, gbc);
     
     JTextField pwField= new JTextField(5);
       gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        f.add(pwField, gbc);

    JButton btnLogin = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        f.add(btnLogin, gbc);

    f.setSize(300,300);
     f.setVisible(true);
    }
}
