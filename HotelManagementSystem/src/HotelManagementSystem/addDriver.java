package HotelManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class addDriver extends JFrame implements ActionListener{
	JLabel  l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t2,t3,t5,t6,t8;
	JComboBox cb4,cb7;
	JButton b1,b2;
	
	public addDriver() {
		
		l1= new JLabel("ADD DRIVER");
		l1.setBounds(150,10,250,30);
		l1.setFont(new Font("Tahoma",Font.PLAIN,30));
		l1.setForeground(Color.BLUE);
		add(l1);
		
		
		l2= new JLabel("Name");
		l2.setBounds(30,80,150,30);
		l2.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(l2);
		
     	t2=new JTextField();		
     	t2.setBounds(220,80,150,30);
     	t2.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(t2);
		
		l3= new JLabel("Age");
		l3.setBounds(30,130,150,30);
		l3.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(l3);
		t3=new JTextField();		
     	t3.setBounds(220,130,150,30);
     	t3.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(t3);
		
		l4= new JLabel("Gender");
		l4.setBounds(30,180,150,30);
		l4.setFont(new Font("Tahoma",Font.PLAIN,18));
		
		add(l4);
		String str4[]= {"Male","Female"};
	     cb4=new JComboBox(str4);		
     	cb4.setBounds(220,180,150,30);
     	cb4.setFont(new Font("Tahoma",Font.PLAIN,18));
     	cb4.setBackground(Color.WHITE);
		add(cb4);
		
		l5= new JLabel("Car Company");
		l5.setBounds(30,230,150,30);
		l5.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(l5);
		t5=new JTextField();		
     	t5.setBounds(220,230,150,30);
     	t5.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(t5);
		
		l6= new JLabel("Car Model");
		l6.setBounds(30,280,150,30);
		l6.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(l6);

		t6=new JTextField();		
     	t6.setBounds(220,280,150,30);
     	t6.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(t6);
		
		l7= new JLabel("Availability");
		l7.setBounds(30,330,150,30);
		l7.setFont(new Font("Tahoma",Font.PLAIN,18));
		
		add(l7);
		
		String str7[]= {"Available","Not-Available"};
		 cb7=new JComboBox(str7);
		 cb7.setBackground(Color.WHITE);
		 cb7.setFont(new Font("Tahoma",Font.PLAIN,18));
	     cb7.setBounds(220,330,150,30);
		add(cb7);
		
		l8= new JLabel("Location");
		l8.setBounds(30,380,150,30);
		l8.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(l8);
		t8=new JTextField();		
     	t8.setBounds(220,380,150,30);
     	t8.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(t8);
		
		b1=new JButton("Add Driver");
		b1.setBounds(30,430,150,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Canel");
		b2.setBounds(220,430,150,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		
		ImageIcon img = new ImageIcon("eleven.jpg");
		Image img2= img.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT );
		ImageIcon img3= new ImageIcon(img2);
		JLabel im= new JLabel(img3);
		im.setBounds(280,60,800,400);
		add(im);
		
		setBounds(300,120,1000,550);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);	
		setVisible(true);
		
		
		
	}

	
	
	
	public static void main(String[] args) {
		new addDriver();

	}




	
	public void actionPerformed(ActionEvent ae) {
		
		String name=t2.getText();
		String age=t3.getText();
		String gender=(String)cb4.getSelectedItem();
		String carCompany= t5.getText();
		String carModel=t6.getText();
		String availability=(String)cb7.getSelectedItem();
		String location= t8.getText();
		conn c= new conn();
		
		if(ae.getSource()==b1) {
			
			
			try {
				
				
				String str="insert into driver values('"+name+"','"+age+"','"+gender+"','"+carCompany+"','"+carModel+"','"+availability+"','"+location+"')";
			c.s.execute(str);
			JOptionPane.showMessageDialog(null, "driver added successfully");
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
