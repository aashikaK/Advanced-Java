import javax.swing.*;
import java.awt.event.*;

public class App implements ActionListener{
JTextField firstDigit;
JTextField secondDigit;
JButton addButton;
JButton subButton;
JButton mulButton;
JButton divButton;
JTextField outputField;
JFrame f= new JFrame();

public App(){
f.setTitle("Two digit Calculator");
JLabel firstDigitLable = new JLabel("First Digit");
firstDigitLable.setBounds(20,20,100,25);
firstDigit = new JTextField();
firstDigit.setBounds(100, 20, 100, 25);
f.add(firstDigitLable);
f.add(firstDigit);
JLabel secondDigitLable = new JLabel("Second Digit");
secondDigitLable.setBounds(20,60,100,25);
secondDigit = new JTextField();
secondDigit.setBounds(100, 60, 100, 25);
f.add(secondDigitLable);
f.add(secondDigit);

addButton= new JButton("Add");
addButton.setBounds(100, 100, 150, 25);
f.add(addButton);

subButton= new JButton("Subtract");
subButton.setBounds(300, 100, 150, 25);
f.add(subButton);

mulButton= new JButton("Multiply");
mulButton.setBounds(100, 140, 150, 25);
f.add(mulButton);

divButton= new JButton("Divide");
divButton.setBounds(300, 140, 150, 25);
f.add(divButton);

JLabel outputLabel = new JLabel("Result:");
outputLabel.setBounds(20,180,100,25);
outputField = new JTextField();

outputField.setBounds(100,180,100,25);

addButton.addActionListener(this);
subButton.addActionListener(this);
mulButton.addActionListener(this);
divButton.addActionListener(this);

f.add(outputField);
f.add(outputLabel);
f.setSize(800, 400);
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
if(e.getSource()==addButton){
int sum = number1 + number2;
outputField.setText(String.valueOf(sum));
}
else if(e.getSource()==subButton){
    int difference= number1-number2;
    outputField.setText(String.valueOf(difference));
}
else if (e.getSource()==mulButton) {
    int prod= number1*number2;
    outputField.setText(String.valueOf(prod));
}
else if(e.getSource()==divButton){
    try{
        float div= (float)number1/(float)number2;
        outputField.setText(String.valueOf(div));
    }
    catch(Exception ex){
        System.out.println("Error-> " + ex.getMessage());
    }
}
}
}
