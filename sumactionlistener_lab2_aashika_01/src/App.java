import javax.swing.*;
import java.awt.event.*;

public class App implements ActionListener{
JTextField firstDigit;
JTextField secondDigit;
JButton calculateButton;
JTextField outputField;
JFrame f= new JFrame();

public App(){
f.setTitle("Two digit Calculator");
JLabel firstDigitLable = new JLabel("First Digit");
firstDigitLable.setBounds(20,20,200,25);
firstDigit = new JTextField();
firstDigit.setBounds(200, 20, 150, 25);
f.add(firstDigitLable);
f.add(firstDigit);
JLabel secondDigitLable = new JLabel("Second Digit");
secondDigitLable.setBounds(20,60,200,25);
secondDigit = new JTextField();
secondDigit.setBounds(200, 60, 150, 25);
f.add(secondDigitLable);
f.add(secondDigit);
calculateButton= new JButton("Calculate");
calculateButton.setBounds(200, 100, 150, 25);
f.add(calculateButton);
JLabel outputLabel = new JLabel("Sum:");
outputLabel.setBounds(20,140,200,25);
outputField = new JTextField();
outputField.setBounds(200,140,150,25);
calculateButton.addActionListener(this);
f.add(outputField);
f.add(outputLabel);
f.setSize(400, 300);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String[] args) throws Exception {

new App();
}


@Override

public void actionPerformed(ActionEvent e){
int number1 = Integer.parseInt(firstDigit.getText());
int number2 = Integer.parseInt(secondDigit.getText());
int sum = number1 + number2;
outputField.setText(String.valueOf(sum));
}
}
