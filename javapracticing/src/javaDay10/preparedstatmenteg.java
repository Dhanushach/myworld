package javaDay10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class preparedstatmenteg {
	
	public static void main(String[] args) throws Exception{
		
		//load the driver class 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//get the connection 
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","system");
		
		//create the object for PreparedStatement
		PreparedStatement ps = con.prepareStatement("insert into student values(1,2)");
		
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter student_id");
			
			int student_id = s.nextInt();
			
			System.out.println("enter student_name");
			
			String student_name = s.next();
			
			
			ps.setInt(1, student_id);
			
			ps.setString(2, student_name);
		}
		
		int x= ps.executeUpdate();
		
		System.out.println(x + "row(s) inserted");
		
		
		//close the connection 
		
		con.close();		
	}
}

