package javaDay10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbcexample {
	
	public static void main(String[] args) {
		try {
	
//load the driver class//
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("driver class loaded");
				
//get the connection//
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
System.out.println("i got the connection");
Statement st  = con.createStatement();

st.addBatch("insert into student values(04,'Meher')");
st.addBatch("update student set student_name='Dhanu' where student_id=104");
st.addBatch("delete from student where student_id =54656");


int x[] = st.executeBatch();

System.out.println(x[0] + "row(s) inserted");
System.out.println(x[1] + "row(s) updated");
System.out.println(x[2] + "row(s) deleted");

//close the connection// 
con.close();
}
		
catch(Exception e)
	 {
System.out.println(e);
}
}
}