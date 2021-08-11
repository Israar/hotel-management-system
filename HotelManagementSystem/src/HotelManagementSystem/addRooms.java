package HotelManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class addRooms extends JFrame implements ActionListener {
	

	JLabel  l1,l2,l3,l4,l5;
	JButton b1,b2;
	JTextField t1,t4;
	JComboBox cb2,cb3,cb5;
	
	
	
	
	 public addRooms(){
		 JLabel L=new JLabel("ADD ROOMS");
		 L.setBounds(110,10,250,30);
		 L.setFont(new Font("Tahoma",Font.PLAIN,30));
		 L.setForeground(Color.BLUE);
		 add(L);
		 
		 l1= new JLabel("Room Number");
		 l1.setBounds(30,80,150,30);
		 l1.setFont(new Font("Tahoma",Font.PLAIN,16));
		 add(l1);
		 
		 t1= new JTextField();
		 t1.setBounds(200,80,150,30);
		 t1.setFont(new Font("Tahoma",Font.PLAIN,16));
		 add(t1);
		 
		 l2= new JLabel("Availability");
		 l2.setBounds(30,130,150,30);
		 l2.setFont(new Font("Tahoma",Font.PLAIN,16));
		 add(l2);
		 
		 String str[]= {"Available","Non-Availability"};
		 cb2= new JComboBox(str);
		 cb2.setBounds(200,130,150,30);
		 cb2.setFont(new Font("Tahoma",Font.PLAIN,16));
		 cb2.setBackground(Color.WHITE);
		 add(cb2);
		 
		 
		 
		 
		 l3= new JLabel("Cleaning Status");
		 l3.setBounds(30,180,150,30);
		 l3.setFont(new Font("Tahoma",Font.PLAIN,16));
		 add(l3);
		 
		 String str3[]={"Cleaned", "Not-Cleaned"};
		 cb3= new JComboBox(str3);
		 cb3.setBounds(200,180,150,30);
		 cb3.setFont(new Font("Tahoma",Font.PLAIN,16));
		 cb3.setBackground(Color.WHITE);
		 add(cb3);
		
		 
		 
		 l4= new JLabel("Price");
		 l4.setBounds(30,230,150,30);
		 l4.setFont(new Font("Tahoma",Font.PLAIN,16));
		 add(l4);
		 
		 t4= new JTextField();
		 t4.setBounds(200,230,150,30);
		 t4.setFont(new Font("Tahoma",Font.PLAIN,16));
		 add(t4);
		 
		 
		 l5= new JLabel("Bed Type");
		 l5.setBounds(30,280,150,30);
		 l5.setFont(new Font("Tahoma",Font.PLAIN,16));
		 add(l5);
		 
		 String str2[]= {"Single Bed","Double Bed", "Honeymoon Sweet"};
		 cb5= new JComboBox(str2);
		 cb5.setBounds(200,280,150,30);
		 cb5.setFont(new Font("Tahoma",Font.PLAIN,16));
		 cb5.setBackground(Color.WHITE);
		 add(cb5);
		 
		 
		 
		 b1= new JButton("Add Room");
		 b1.setBounds(30,380,140,30);
		 b1.setFont(new Font("Tahoma",Font.PLAIN,16));
		 b1.setBackground(Color.BLACK);
		 b1.setForeground(Color.WHITE);
		 b1.addActionListener(this);
		 
		 add(b1);
		 
		 
		 b2= new JButton("Cancel");
		 b2.setBounds(200,380,140,30);
		 b2.setFont(new Font("Tahoma",Font.PLAIN,16));
		 b2.setBackground(Color.BLACK);
		 b2.setForeground(Color.WHITE);
		 b2.addActionListener(this);
		 add(b2);
		 
		 
		 ImageIcon i1= new ImageIcon("twelve.jpg");
		 Image i2= i1.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
		 ImageIcon i3=new ImageIcon(i2);
		 JLabel img= new JLabel(i3);
		 img.setBounds(365,10,550,440);
		 add(img);
		 
		
		 
		 
		 
		 
		 setLayout(null);
		 
		setBounds(350, 120,950,550);
		   getContentPane().setBackground(Color.white);
			setVisible(true);
	 }

	public static void main(String[] args) {
		 
		 new addRooms();
		

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			String RoomNumber= t1.getText();
			String Availability=(String)cb2.getSelectedItem();
			String Status= (String)cb3.getSelectedItem();
			String Price= t4.getText();
			String BedType= (String)cb5.getSelectedItem();
			
			
			conn c= new conn();
			try{
				String str= "insert into room values('"+RoomNumber+"','"+Availability+"','"+Status+"','"+Price+"','"+BedType+"')";
				
				c.s.executeUpdate(str);
				JOptionPane.showMessageDialog(null, "New Room added Successfully");
			}
			catch(Exception e) {
		    System.out.println(e);
			}
			
			
			
		}
		else if(ae.getSource()==b2) {
			setVisible(false);
		}
		
	}

}
