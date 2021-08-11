package HotelManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class dashboard extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu m1,m2;
	JMenuItem i1,i2,i3,i4;
	public dashboard() {
		
	mb=new JMenuBar();
	add(mb);
	m1= new JMenu("HOTEL MANAGEMENT");
	m1.setForeground(Color.red);
	mb.add(m1);
	
	m2= new JMenu("ADMIN");
	m2.setForeground(Color.BLUE);
	mb.add(m2);
	
	i1= new JMenuItem("RECEPTION");
	i1.addActionListener(this);
	m1.add(i1);
	
	
	i2= new JMenuItem("ADD EMPLOYEE");
	i2.addActionListener(this);
	m2.add(i2);
	
	i3= new JMenuItem("ADD ROOM");
	i3.addActionListener(this);
	m2.add(i3);	
		
	i4= new JMenuItem("ADD DRIVERS");
	i4.addActionListener(this);
	m2.add(i4);	
	
	mb.setBounds(0,0,1920,30);
	
	ImageIcon img= new ImageIcon("third.jpg");
   JLabel l1= new JLabel(img);
   l1.setBounds(0,0,1500,800);
   add(l1);
   
   
   JLabel l2=new JLabel("THE TAJ GROUP WELCOMES YOU");
   l2.setForeground(Color.WHITE);
   l2.setBounds(400,70,800,130);
   l2.setFont(new Font("Tahoma",Font.PLAIN, 46)); //set the font and size of l2.
   
   l1.add(l2);
		
 setLayout(null);
 setBounds(0,0,1920,1080);
	setVisible(true);	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
 
	public static void main(String[] args) {
		new dashboard();
		

	}













	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==i2) {
		new addEmployee().setVisible(true);
		}
		else if (ae.getSource()==i3){
			new addRooms().setVisible(true);
			
		}else if(ae.getSource()==i4) {
			new addDriver().setVisible(true);
		}else if(ae.getSource()==i1) {
			new  reception();
			this.setVisible(false);
		}
	}

}
