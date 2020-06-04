import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class IfConditionPrograms {

	public static void main(String args[])
	{  
		try{  
			
			int i,n;
			String name1="Amitha", name2 = "amitha";
			
			
			 System.out.println(name1);
			 System.out.println(name1.length());
			 System.out.println(name1.charAt(4));

			 
			 // Comparision of two strings. 
			 System.out.println(name1.compareTo(name2));
			 
			 
			 if (name1.compareToIgnoreCase(name2)==0) {
				 System.out.println("Both Strings are same");
			 }
			 else
			 {
				 System.out.println("Not same");
			 }
			 
			 // printing strings in reverse order 
			 
			 System.out.println(name1);  // this is printing in regular order 
			 //we have to print all the characters in reverse order. 
			 // how to print single character in given string ( index starts from 0 to length -1 ... 
			 //ans : using. name.charAt(index) ... see below example)
			 System.out.println("Character at 4th position of name1 string is : "+name1.charAt(3));
			 System.out.println(" Total characters in Strings are : "+name1.length());
			
			 for (int j=name1.length()-1; j>=0; j--)
			 {
				 System.out.print(name1.charAt(j));
			 }
			 
			 
		
			
				
			
			
		}catch(Exception e)
			{ 
				System.out.println(e);
			} 
		  
	}  
		
}

