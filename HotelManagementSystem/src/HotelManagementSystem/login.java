package HotelManagementSystem;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener{
	JButton b1,b2;
	JTextField t1;
	JPasswordField t2;
	JLabel l1,l2;
	
	public login(){
		l1=new JLabel("Username");
		l1.setBounds(40,20,100,30);
		add(l1);
		
		l2=new JLabel ("Password");
		l2.setBounds(40,70,100,30);
		add(l2);
		
		t1= new JTextField();
		t1.setBounds(150,20,150,30);
		add(t1);
		 
		t2=new JPasswordField();
		t2.setBounds(150,70,150,30);
		add(t2);
		
		b1= new JButton("Login");
		b1.setBounds(40,170,120,30);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.addActionListener(this);
        add(b1);
		
		b2= new JButton("Cancel");
		b2.setBounds(180,170,120,30);
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.addActionListener(this);
		add(b2);
		
		
		ImageIcon i1= new ImageIcon("second.jpg");
	
		Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l3= new JLabel(i3);
		l3.setBounds(350,10,200,200);
		add(l3);
		
		getContentPane().setBackground(Color.WHITE);
		
		
		
		setBounds(500,300,600,400);
		setLayout(null);
		setVisible(true);
		}
	
	
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			
		String	Username= t1.getText();
		@SuppressWarnings("deprecation")
	String Password= t2.getText();
		
		conn c= new conn();
		String str= "select * from login where Username ='"+Username+"' and Password = '"+Password+"'";
		
		try{
			ResultSet rs=c.s.executeQuery(str);
			if(rs.next()) {
				new dashboard().setVisible(true);
				this.setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(null, "invalid Credentials");
				this.setVisible(false);
			}
		}
		catch(Exception e) {
			
		}
		}
		
		
		
	else if(ae.getSource()==b2) {
			System.exit(0);
			
		}
		
		
	}

	
	

	

	public static void main(String[] args) {
		new login();

	}


	}














	
