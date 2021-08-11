package HotelManagementSystem;
import javax.swing.*;
import java.awt.*;



public class newCustomer extends JFrame {
	JLabel l, l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1,b2;
	JTextField t1, t2,t3,t5,t7,t8;
	JComboBox cb1,cb2;
	JRadioButton rb4;
	
   newCustomer(){
	 l=new JLabel("New Customer Form");  
	  l.setBounds(80,30,250,40); 
	 l.setFont(new Font("Tahoma", Font.PLAIN, 24));
	 l.setForeground(Color.blue);
	 add(l);
	   
	 l1= new JLabel("Name");  
	  l1.setBounds(30, 100, 60, 30);
	  add(l1);
	  
	  t1=new JTextField();
	  t1.setBounds(200,100,150,30);
	  add(t1);
	 
	 
	 
	 l2= new JLabel("Document");  
	  l2.setBounds(30, 150, 60, 30);
	  add(l2);
	  
	  String str[]= {"Passport", "Aadhar Card", "Voter Card", "Pancard"};
	  cb1=new JComboBox(str);
	  cb1.setBounds(200,150,150,30);
	  cb1.setBackground(Color.white);
	  add(cb1);
	  
	  l3= new JLabel("ID Number");  
	  l3.setBounds(30, 200, 60, 30);
	  add(l3);
	  
	  t3=new JTextField();
	  t3.setBounds(200,200,150,30);
	  add(t3);
	  

	  l4= new JLabel("Gender");  
	  l4.setBounds(30, 250, 60, 30);
	  add(l4);
	  
	  rb4=new JRadioButton("Male");
	  rb4.setBounds(200,250,65,30);
	  rb4.setBackground(Color.white);
	  add(rb4);
	  rb4=new JRadioButton("Female");
	  rb4.setBounds(275,250,70,30);
	  rb4.setBackground(Color.white);
	  add(rb4);
	  
	  l5= new JLabel("Country");  
	  l5.setBounds(30, 300, 60, 30);
	  add(l5);
	  
	  t5=new JTextField();
	  t5.setBounds(200,300,150,30);
	  add(t5);
	   
	   
	   
	   
   
   setBounds(120,60,800,650);
   setLayout(null);
   getContentPane().setBackground(Color.white);
   setVisible(true);
   
   }
	public static void main(String[] args) {
		
new newCustomer();
	}

}
