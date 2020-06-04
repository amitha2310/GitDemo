package TestNGTesting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGbasics4 {
@Parameters({"URL"})
@Test
public void WebloginHomeLoan(String urlnm)
{
	//Selenium
	System.out.println("WebloginHome");
	System.out.println(urlnm);

 }

@Test
public void MobileloginHomeLoan()
{
	//Appium
	System.out.println("MobileloginHome");
	
}
@Test(dependsOnMethods= {"WebloginHomeLoan", "MobileloginHomeLoan"})
public void APIloginHomeLoan()
{
	//Rest API Automation
	System.out.println("APIloginHome");
	
}
@BeforeSuite
public void bfsuite()
{
	System.out.println("I am no 1");
}
@BeforeClass
public void bfclass()
{
	System.out.println("before executing any methods in the class");
}
}
