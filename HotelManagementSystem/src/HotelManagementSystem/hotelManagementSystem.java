package HotelManagementSystem;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class hotelManagementSystem extends JFrame implements ActionListener {
	
 public hotelManagementSystem(){
	  
	  setBounds(100,150,1366,565);
	 // (x,y,length,width)

	  ImageIcon i1= new ImageIcon("first.jpg");
	  JLabel l1= new JLabel(i1);
	  l1.setBounds(0, 0 , 1366, 565);
	  add(l1);
	  JLabel l2 =new JLabel("Hotel Management System");//shows a text above on photo
	  l2.setBounds(20, 410, 1000, 90);
	  l2.setForeground(Color.white);// set the text color white
	  l2.setFont(new Font( "serif", Font.PLAIN, 60));
	  l1.add(l2);
	  
	  JButton b1= new JButton("Next");
	  b1.setBackground(Color.white);
	  b1.setBounds(1150,450,150,50);
	  b1.addActionListener(this);
	  add(b1);
	  setLayout(null);
	  setVisible(true);//always comes at the  last in constructor
	  
	  while(true){
		  l2.setVisible(false);
		  try {
			  
			  Thread.sleep(500);
		  }catch(Exception e) {
			  
		  }
		  l2.setVisible(true);
		  try {
			  Thread.sleep(500);
		  }catch(Exception e){
			  
		  }
	  }
	  
  } 
			public void actionPerformed(ActionEvent ae) {
				
				  new login().setVisible(true);
				  this.setVisible(false);
			}

	public static void main(String[] args) {
		new hotelManagementSystem();
	}

}
