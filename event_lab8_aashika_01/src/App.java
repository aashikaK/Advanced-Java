import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App implements ActionListener{
JFrame f= new JFrame();
JButton redButton, blueButton, greenButton;
public App(){
    redButton= new JButton("RED");
    redButton.setBounds(20,20,90,25);
    blueButton = new JButton("BLUE");
    blueButton.setBounds(120,20,90,25);
    greenButton= new JButton("GREEN");
    greenButton.setBounds(220,20,90,25);
    f.add(redButton);
    f.add(blueButton);
    f.add(greenButton);

    redButton.addActionListener(this);
blueButton.addActionListener(this);
greenButton.addActionListener(this);

    f.setSize(500,200);
    f.setLayout(null);
    f.setVisible(true);
}
@Override
    public void actionPerformed(ActionEvent e) {
        // Check which button was clicked
        if (e.getSource() == redButton) {
            redButton.setBackground(Color.RED);
        } else if (e.getSource() == blueButton) {
            blueButton.setBackground(Color.BLUE);
        } else if (e.getSource() == greenButton) {
            greenButton.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
