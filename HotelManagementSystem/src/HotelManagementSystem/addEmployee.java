package HotelManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class addEmployee extends JFrame implements ActionListener{
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2;
	JRadioButton rb1,rb2;
	JComboBox cb;
	
	
	
  
	public addEmployee() {
		
		JLabel name= new JLabel("NAME");
		name.setBounds(30,80,150,30);
		name.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(name);
		
		t1= new JTextField();
		t1.setBounds(200,80,150, 30);
		add(t1);
		
		JLabel age= new JLabel("AGE");
		age.setBounds(30,130,150,30);
		age.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(age);

		t2= new JTextField();
		t2.setBounds(200,130,150, 30);
		add(t2);
		
		
		JLabel gender= new JLabel("GENDER");
		gender.setBounds(30,180,150,30);
		gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(gender);

		rb1=new JRadioButton("male");
		rb1.setBounds(200, 180, 65, 30);
		rb1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rb1.setBackground(Color.white);
		add(rb1);
		rb2=new JRadioButton("female");
		rb2.setBounds(280, 180, 75, 30);
		rb2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rb2.setBackground(Color.white);
		add(rb2);
		
		
		JLabel job= new JLabel("JOB");
		job.setBounds(30,230,150,30);
		job.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(job);
		
		
		String str[]= {"Front Desk Clerk","Porters","House Keeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
	    cb= new JComboBox(str);
		cb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb.setBackground(Color.white);
	    cb.setBounds(200,230,150,30);
	    add(cb);
	    
	    JLabel salary= new JLabel("SALARY");
		salary.setBounds(30,280,150,30);
		salary.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(salary);
		
		t3=new JTextField();
		t3.setBounds(200,280,150, 30);
		add(t3);
		
		JLabel phone= new JLabel("PHONE");
		phone.setBounds(30,330,150,30);
		phone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(phone);
			
		t4=new JTextField();
		t4.setBounds(200,330,150, 30);
		add(t4);
		
		
		JLabel aadhar= new JLabel("AADHAR");
		aadhar .setBounds(30,380,150,30);
		aadhar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(aadhar);
				
		t5=new JTextField();
		t5.setBounds(200,380,150, 30);
		add(t5);
		
		
		JLabel email= new JLabel("EMAIL");
		email.setBounds(30,430,150,30);
		email.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(email);
					
		t6=new JTextField();
		t6.setBounds(200,430,150, 30);
		add(t6);
		
		JLabel txt= new JLabel("ADD EMPLOYEE DETAILS");
	    txt.setBounds(420,50,400,70);
	    txt.setForeground(Color.blue);
	    txt.setFont(new Font("Tahoma", Font.PLAIN, 30));
	    add(txt);
	    
	    
	    b1=new JButton("Submit");
	    b1.setBounds(200,500,150,30);
	    b1.setBackground(Color.BLACK);
	    b1.setForeground(Color.white);
	    b1.addActionListener(this);
	    add(b1);
	    
		
		
		ImageIcon img1= new ImageIcon("tenth.jpg");
		//Image img2= img1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
		//ImageIcon img3= new ImageIcon(img2);
		Image img2=img1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
		ImageIcon img3=new ImageIcon(img2);
		
		JLabel l1=new JLabel(img3);
		l1.setBounds(390, 120, 450, 400);
		add(l1);
		
		
		setLayout(null);
		setBounds(350,120,900,650);

	   getContentPane().setBackground(Color.white);
		setVisible(true);
		
		
	}
	
        public static void main(String[] args) {
		new addEmployee();

	}



        public void actionPerformed(ActionEvent ae) {
		 String name=t1.getText();
	     String age =t2.getText();
	     
	     String gender=null;              //to get the selected item in radioButton, we need to do like this
	     if(rb1.isSelected()){
	    	 gender="Male";
	     } else if(rb2.isSelected()) {
	    	 gender="Female";
	     }
	     
	     String job =(String)cb.getSelectedItem(); //to get to selected item,we do like this in combobox..
	     
	     
	     String salary=t3.getText();
	     String phone =t4.getText();
	     String aadhar= t5 .getText();
	     String email =t6.getText();
	     conn c=new conn();
         String str= "insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+aadhar+"','"+email+"')";
	      try {
	    	  c.s.execute(str);
	    	  JOptionPane.showMessageDialog(null, "new Employee Added");
	    	 this.setVisible(false);
	      }
	      catch(Exception e) {
	    	  
	    	
	    	  
	      }
	     
	}

}
