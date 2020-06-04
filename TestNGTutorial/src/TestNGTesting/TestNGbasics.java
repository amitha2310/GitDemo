package TestNGTesting;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGbasics {
@AfterSuite
public void afsuite()
{
	System.out.println("I am the no 1 from last");
}
@AfterTest
public void lastexecution()
{
	System.out.println("I will execute last");
}
@Test(groups= {"smoke"})
public void Demo()
{
	System.out.println("Hello");

	}
@Test
public void Demo2()
{
	System.out.println("Bye");
	Assert.assertTrue(false);;
}
}
