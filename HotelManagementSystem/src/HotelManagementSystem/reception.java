package HotelManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class reception extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;

	reception(){
		
	
		 b1=new JButton("New Customer Form");
		 b1.setBounds(30,50,180,30);
		 b1.setBackground(Color.black);
		 b1.setForeground(Color.WHITE);
		 b1.setFont( new Font("Tahoma", Font.PLAIN, 16));
		 b1.addActionListener(this);
		 add(b1);
			
		 b2=new JButton("Room");
		 b2.setBounds(30,90,180,30);
		 b2.setBackground(Color.black);
		 b2.setForeground(Color.WHITE);
		 b2.setFont( new Font("Tahoma", Font.PLAIN, 16));
		 b2.addActionListener(this);
		 add(b2);
		
		 b3=new JButton("Department");
		 b3.setBounds(30,130,180,30);
		 b3.setBackground(Color.black);
		 b3.setForeground(Color.WHITE);
		 b3.setFont( new Font("Tahoma", Font.PLAIN, 16));
		 b3.addActionListener(this);
		 add(b3);
		
		 b4 =new JButton("All Employee Info");
		 b4.setBounds(30,170,180,30);
		 b4.setBackground(Color.black);
		 b4.setForeground(Color.WHITE);
		 b4.setFont( new Font("Tahoma", Font.PLAIN, 16));
		 b4.addActionListener(this);
		 add(b4);
		 
		 b5 =new JButton("Customer Info");
		 b5.setBounds(30,210,180,30);
		 b5.setBackground(Color.black);
		 b5.setForeground(Color.WHITE);
		 b5.setFont( new Font("Tahoma", Font.PLAIN, 16));
		 b5.addActionListener(this);
		 add(b5);
		 
		 b6=new JButton("Manager Info");
		 b6.setBounds(30,250,180,30);
		 b6.setBackground(Color.black);
		 b6.setForeground(Color.WHITE);
		 b6.setFont( new Font("Tahoma", Font.PLAIN, 16));
		 b6.addActionListener(this);
		 add(b6);
		 
		 b7=new JButton("Check Out");
		 b7.setBounds(30,290,180,30);
		 b7.setBackground(Color.black);
		 b7.setForeground(Color.WHITE);
		 b7.setFont( new Font("Tahoma", Font.PLAIN, 16));
		 b7.addActionListener(this);
		 add(b7);
		 
		 b8 =new JButton("Update Check status");
		 b8.setBounds(30,330,180,30);
		 b8.setBackground(Color.black);
		 b8.setForeground(Color.WHITE);
		 b8.setFont( new Font("Tahoma", Font.PLAIN, 16));
		 b8.addActionListener(this);
		 add(b8);
		 
		 b9=new JButton("Update Room Status");
		 b9.setBounds(30,370,180,30);
		 b9.setBackground(Color.black);
		 b9.setForeground(Color.WHITE);
		 b9.setFont( new Font("Tahoma", Font.PLAIN, 16));
		 b9.addActionListener(this);
		 add(b9);
		 
		b10 =new JButton("Pick up Service");
		b10 .setBounds(30,410,180,30);
		 b10.setBackground(Color.black);
		 b10.setForeground(Color.WHITE);
		 b10.setFont( new Font("Tahoma", Font.PLAIN, 16));
		 b10.addActionListener(this);
		 add(b10);
		 
		 b11=new JButton("Search Room");
		 b11.setBounds(30,450,180,30);
		 b11.setBackground(Color.black);
		 b11.setForeground(Color.WHITE);
		 b11.setFont( new Font("Tahoma", Font.PLAIN, 16));
		 b11.addActionListener(this);
		 add(b11);
		 
		b12 =new JButton("Logout");
		 b12.setBounds(30,490,180,30);
		 b12.setBackground(Color.black);
		 b12.setForeground(Color.WHITE);
		 b12.setFont( new Font("Tahoma", Font.PLAIN, 16));
		 b12.addActionListener(this);
		 add(b12);
		 
		 
		 
		 ImageIcon img= new ImageIcon("fourth.jpg");
		 
		 JLabel l= new JLabel(img);
		 l.setBounds(200,50,580,470);
		 
		 add(l);
		 
		 
		
		
		
	
		setBounds(250,60,800,590);
		setLayout(null);
		setVisible(true);
	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
			new reception();
			
		} 
	
	  public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {}
		else if(ae.getSource()==b2) {
			new room().setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b3) {}
		else if(ae.getSource()==b4) {
			new employeeInfo().setVisible(true);
			this.setVisible(false);
			
		}
		else if(ae.getSource()==b5) {}
		else if(ae.getSource()==b6) {
		new	managerInfo().setVisible(true);
		this.setVisible(false);
		}
		else if(ae.getSource()==b7) {}
		else if(ae.getSource()==b8) {}
		else if(ae.getSource()==b9) {}
		else if(ae.getSource()==b10) {}
		else if(ae.getSource()==b11) {}
		else if(ae.getSource()==b12) 
	
		{
			setVisible(false);
			}
		

		
	}
			 
			 
			 
			 
		 	

	}


