import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class App implements ActionListener{
    JFrame f= new JFrame();
    JTextField usernameField;
    JPasswordField passwordField;
    JCheckBox rememberMe;
    JButton loginButton, resetButton, exitButton;

    public App(){
        f.setLayout(new BorderLayout(10,10));
        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        northPanel.add(new JLabel("Name"));
        northPanel.add(new JLabel("Roll No"));
        northPanel.add(new JLabel("Class"));
        f.add(northPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        centerPanel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        centerPanel.add(usernameField);

        centerPanel.add(new JLabel("Password:"));
        passwordField= new JPasswordField();
        centerPanel.add(passwordField);

         rememberMe = new JCheckBox("Remember Me");
        centerPanel.add(rememberMe);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        centerPanel.add(loginButton);
        f.add(centerPanel, BorderLayout.CENTER);

        JPanel southPanel= new JPanel(new FlowLayout(FlowLayout.CENTER, 10,10));
        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        southPanel.add(resetButton);
        southPanel.add(exitButton);
        f.add(southPanel, BorderLayout.SOUTH);

        f.setSize(450, 250);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            JOptionPane.showMessageDialog(f, "Entered Username: " + username);
        } else if (e.getSource() == resetButton) {
            usernameField.setText("");
            passwordField.setText("");
            rememberMe.setSelected(false);
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
