import java.sql.Connection;//A connection (session) with a specific database
import java.sql.DriverManager;//The basic service for managing a set of JDBC drivers.
import java.sql.ResultSet;//A table of data representing a database result set
import java.sql.SQLException;//An exception that provides information on a database access error or other errors
import java.sql.Statement;//The object used for executing a static SQL statement
import java.util.Scanner;//which can parse primitive types and strings using regular expressions
public class Employee //class name
{
	public static void main(String[] args)  throws SQLException,NullPointerException //main method throws Exception handling technique SQLException,NullPointerException
	{
		int empid;// variable declaration Accessing employee id using integer data type 
		Scanner sc=new Scanner(System.in);//giving input 
		System.out.println("enter employee id");//final statement enter employee id
		empid=sc.nextInt();//employee id object creation
		try//try Exception handling block
		{
			Class.forName("com.mysql.cj.jdbc.Driver");//Driver class
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcs","root","1234");//Entering Connection
			String sql= "select * from employee where eid='"+empid+"'";//SQL query of for creating a employee table
			Statement st=con.createStatement();//Creates a Statement object for sendingSQL statements to the database
			ResultSet rs=st.executeQuery(sql);//Executes the given SQL statement, which returns a single ResultSet object. 
			if(rs.next())//if condition 
			{
			System.out.println("employee id is found"+rs.getString(1));	//print employee id is found in column number 1 
			}
			else// else block
			{
				throw new EmployeeResourceNotFound("Employee not available");//print Employee not available
			}
		}//closing try block
		catch(Exception e)//catch Exception handling block
		{
			System.out.println(e); //if try block contains error then catch block will execute
		}
	System.out.println("Rest Of The Code");//final statement print Rest Of The Code
}
}
