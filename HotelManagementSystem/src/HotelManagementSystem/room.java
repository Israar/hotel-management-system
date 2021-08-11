package HotelManagementSystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.*;
import javax.swing.*;


public class room extends JFrame implements ActionListener {
	
	
	
		JTable t1;
		JButton b1,b2;
		JLabel l1,l2,l3,l4,l5;
		
		
		
		room(){
			
			t1= new JTable();
			t1.setBounds(0, 35, 650, 460);
			add(t1);
			
			
			l1=new JLabel("Roll Number");
			l1.setBounds(25,5,90,30);
			add(l1);
			
			l2=new JLabel("Availability");
			l2.setBounds(150,5,90,30);
			add(l2);
			
			l3=new JLabel("Cleaning Status");
			l3.setBounds(270,5,90,30);
			add(l3);
			
			l4=new JLabel("Price");
			l4.setBounds(420,5,90,30);
			add(l4);
			
			l5=new JLabel("Bed Type");
			l5.setBounds(540,5,90,30);
			add(l5);
			
			b1= new JButton("Refresh Data");
			b1.setBounds(80,500,130,30);
			b1.setBackground(Color.BLACK);
			b1.setForeground(Color.white);
			b1.addActionListener(this);
		    add(b1);	
			
		    b2= new JButton("Back");
			b2.setBounds(250,500,130,30);
			b2.setBackground(Color.BLACK);
			b2.setForeground(Color.white);
			b2.addActionListener(this);
		    add(b2);	

		
		    ImageIcon i1= new ImageIcon("eight.jpg");
			 Image i2= i1.getImage().getScaledInstance(550, 500, Image.SCALE_DEFAULT);
			 ImageIcon i3=new ImageIcon(i2);
			 JLabel img= new JLabel(i3);
			 img.setBounds(650,0,500,550);
			 add(img);
			 
			 setBounds(80,50,1200,580);
			 setLayout(null);
			getContentPane().setBackground(Color.white);
			 setVisible(true);
			
	}

	public static void main(String[] args) {
		
new room();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			conn c=new conn();
			String str="select * from room; ";
			try {
				
				
				ResultSet rs= c.s.executeQuery(str);
				t1.setModel(DbUtils.resultSetToTableModel(rs));
				
			}
				catch(Exception e) {}
			
			
		}
		if(ae.getSource()==b2) {
			new reception().setVisible(true);
			this.setVisible(false);
		}
		
	}

}
