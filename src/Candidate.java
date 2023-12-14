import java.util.Scanner;//A simple text scanner which can parse primitive types and strings usingregular expressions. 

public class Candidate //class name
{
	static void CheckAge(int ageinput) throws CheckAgeException //user defined method 
	{
		if(ageinput>=18)//22>=18 if condition
		{
			System.out.println("you are Eligible For Vote");//print you are Eligible For Vote
		}
		else//else block
		{
			throw new CheckAgeException("Sorry!! you are not Eligible For Vote");//print Sorry!! you are not Eligible For Vote
		}
	}

	public static void main(String[] args)//method name
	{
	int age;//variable declaration Accessing employee department using String data type 
	Scanner sc=new Scanner(System.in);//giving user input
	System.out.println("Enter Your Age");//final statement enter Department name 
	age=sc.nextInt();//object creation of age
	try//try exception handling block
	{
		CheckAge(age);//check age 
	}
	catch(CheckAgeException e) //catch Exception handling block
	{
		e.printStackTrace();//if try block contains error then catch block will execute
	}
	}
    }
