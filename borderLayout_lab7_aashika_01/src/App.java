import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App implements ActionListener {
    JFrame f= new JFrame();
     JTextField firstNumber, secondNumber, resultField;
    JButton addBtn, subBtn, mulBtn, divBtn;
    public App(){

        f.setLayout(new BorderLayout(10,10));

        JPanel northPanel = new JPanel();
        JLabel titleLabel = new JLabel("Simple Calculator");
        northPanel.add(titleLabel);
        f.add(northPanel, BorderLayout.NORTH);

        JPanel centerPanel= new JPanel(new GridLayout(3,4,4,4));
        centerPanel.add(new JLabel("First Number:"));
        firstNumber = new JTextField();
        centerPanel.add(firstNumber);

        centerPanel.add(new JLabel("Second Number:"));
        secondNumber = new JTextField();
        centerPanel.add(secondNumber);

        centerPanel.add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        centerPanel.add(resultField);

        addBtn = new JButton("Add");
        addBtn.addActionListener(this);
        centerPanel.add(addBtn);

        subBtn = new JButton("Subtract");
        subBtn.addActionListener(this);
        centerPanel.add(subBtn);

        mulBtn = new JButton("Multiply");
        mulBtn.addActionListener(this);
        centerPanel.add(mulBtn);

        divBtn = new JButton("Divide");
        divBtn.addActionListener(this);
        centerPanel.add(divBtn);

        f.add(centerPanel, BorderLayout.CENTER);

        JPanel eastPanel= new JPanel(new GridLayout(2,1,4,4));
       ImageIcon originalIcon = new ImageIcon("C:/Users/User/Desktop/java/copy.png");
Image img = originalIcon.getImage(); // transform to Image
Image scaledImg = img.getScaledInstance(40, 40, Image.SCALE_SMOOTH); // scale to 40x40
ImageIcon icon = new ImageIcon(scaledImg);
JButton iconBtn1 = new JButton("Icon1", icon);
ImageIcon originalIcon2 = new ImageIcon("C:/Users/User/Desktop/java/scissors.png");
Image img2 = originalIcon2.getImage();
Image scaledImg2 = img2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
JButton iconBtn2 = new JButton("Icon2", new ImageIcon(scaledImg2));

eastPanel.add(iconBtn1);
        eastPanel.add(iconBtn2);
        f.add(eastPanel, BorderLayout.EAST);

        f.setSize(600,300);
        f.setVisible(true);
    }
@Override
    public void actionPerformed(ActionEvent e) {
        
            int num1 = Integer.parseInt(firstNumber.getText());
            int num2 = Integer.parseInt(secondNumber.getText());
            int res;

            if (e.getSource() == addBtn) {
                res = num1+num2;
                
            resultField.setText(String.valueOf(res));
            } else if (e.getSource() == subBtn) {
                res = num1 - num2;
                
            resultField.setText(String.valueOf(res));
            } else if (e.getSource() == mulBtn) {
                res = num1 * num2;
                
            resultField.setText(String.valueOf(res));
            } else if (e.getSource() == divBtn) {
                try{
                float result =(float) num1 /(float) num2;
            resultField.setText(String.valueOf(result));
            }
            
            catch(Exception ex){
                System.out.println("Error-> " +ex.getMessage());
            }
            }
        

       
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
