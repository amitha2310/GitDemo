package TestNGTesting;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics2 {

@Test(groups= {"smoke"})
public void ploan()
{
	System.out.println("Good");

}

@BeforeTest
public void prerequisite()
{
	System.out.println("I will execute first");
}


}
