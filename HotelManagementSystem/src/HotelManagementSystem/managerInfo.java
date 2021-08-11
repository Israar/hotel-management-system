package HotelManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.*;

public class managerInfo extends JFrame implements ActionListener{
	JTable t1;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	
	
	
	managerInfo(){
		l1=new JLabel("Name");
		l1.setBounds(100,15,40,30);
		add(l1);
		
		l2=new JLabel("Age");
		l2.setBounds(240,15,40,30);
		add(l2);
		
		l3=new JLabel("Gender");
		l3.setBounds(360,15,50,30);
		add(l3);
		
		l4=new JLabel("Job");
		l4.setBounds(490,15,30,30);
		add(l4);
		
		l5=new JLabel("Salary");
		l5.setBounds(620,15,40,30);
		add(l5);
		
		l6=new JLabel("Contact");
		l6.setBounds(750,15,50,30);
		add(l6);
		
		l7=new JLabel("Adhaar No.");
		l7.setBounds(870,15,65,30);
		add(l7);
		
		l8=new JLabel("Gmail ID");
		l8.setBounds(1000,15,65,30);
		add(l8);
		
		t1=new JTable();
		t1.setBounds(50,40,1050,500);
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
		
		
	setBounds(80,50,1170,630);
	setLayout(null);
	getContentPane().setBackground(Color.white);
	setVisible(true);
	
	}
	
	

	public static void main(String[] args) {
	new managerInfo();	

	}



	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			
			
			try {
				conn c= new conn();
				String str="select* from employee where job='Manager'";
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