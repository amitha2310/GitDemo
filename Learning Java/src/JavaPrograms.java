 import java.util.Scanner;

public class JavaPrograms {

	public static void main(String[] args) {
		
		String age=null;
		try {
		if (age.equals("Amitha")) {
			System.out.println("Hello ");
		}
		else
		{
			System.out.println("Bye");
		}
	
	}catch(NullPointerException e) 
    { 
        System.out.print("NullPointerException Caught"); 
    } 
	

		
}
}




