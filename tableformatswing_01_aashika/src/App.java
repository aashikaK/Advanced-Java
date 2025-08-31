import javax.swing.*;
public class App extends JFrame{
public static void main(String[] args) throws Exception{

JFrame f=new JFrame();
String data[][]={{"101","sunil","60000"},{"102", "Anil", "70000"}, {"103", "Manil", "80000"}};
String column[]={"ID", "NAME", "SALARY"};
JTable jt=new JTable(data, column);
jt.setBounds(30,40,200,300);
JScrollPane sp =new JScrollPane(jt);
f.add(sp);
f.setSize(300,400);
f.setVisible(true);
}}