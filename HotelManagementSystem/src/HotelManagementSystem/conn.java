package HotelManagementSystem;
import java.sql.*;

public class conn {
	Connection c;
	Statement s;
	

	
	public conn(){
		try{
			
			Class.forName("com.mysql.jdbc.Driver");//to register drivers, we use a java Class whose name is 'class'
		
			
//			
//			 String url       = "jdbc:mysql://localhost:3308/projecthms";
//			    String user      = "root";
//			    String password  = "";
//				
			    // create a connection to the database
//			    c = DriverManager.getConnection(url, user, password);
		c = DriverManager.getConnection("jdbc:mysql://localhost:3308/projecthms","root","");//to set connection between 
		s= c.createStatement();			                                                     //database and project..
			          	
		}
		
		
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}	

}
