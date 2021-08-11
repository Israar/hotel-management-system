package HotelManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.*;

public class employeeInfo extends JFrame implements ActionListener{
	JTable t1;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	
	
	
	employeeInfo(){
		l1=new JLabel("Name");
		l1.setBounds(60,15,40,30);
		add(l1);
		
		l2=new JLabel("Age");
		l2.setBounds(220,15,40,30);
		add(l2);
		
		l3=new JLabel("Gender");
		l3.setBounds(350,15,50,30);
		add(l3);
		
		l4=new JLabel("Job");
		l4.setBounds(490,15,30,30);
		add(l4);
		
		l5=new JLabel("Salary");
		l5.setBounds(620,15,40,30);
		add(l5);
		
		l6=new JLabel("Contact");
		l6.setBounds(760,15,50,30);
		add(l6);
		
		l7=new JLabel("Adhaar No.");
		l7.setBounds(900,15,65,30);
		add(l7);
		
		l8=new JLabel("Gmail ID");
		l8.setBounds(1050,15,65,30);
		add(l8);
		
		t1=new JTable();
		t1.setBounds(10,50,1165,500);
		add(t1);
		
		b1= new JButton("Load data");
		b1.setBounds(400,550, 120,30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		

		b2= new JButton("Back");
		b2.setBounds(600,550, 120,30);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		
	setBounds(80,50,1200,630);
	setLayout(null);
	getContentPane().setBackground(Color.WHITE);
	setVisible(true);
	
	}
	
	

	public static void main(String[] args) {
	new employeeInfo();	

	}



	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			
			
			try {
				conn c= new conn();
				String str="select* from employee";
				ResultSet rs=c.s.executeQuery(str);
				t1.setModel(DbUtils.resultSetToTableModel(rs));
			}
			catch(Exception e) {
				
			}
		}
		
		else if(ae.getSource()==b2) {
			new reception().setVisible(true);
			this.setVisible(false);
			
		}
	

}
}