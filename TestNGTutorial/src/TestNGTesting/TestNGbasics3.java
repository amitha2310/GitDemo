package TestNGTesting;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGbasics3 {
@AfterClass
public void afclass()
{
	System.out.println("after executing any methods in the class");
}
@AfterMethod
public void afeverymethod()
{
	System.out.println("I will execute after every test method in this class");
}
@Parameters({"URL", "APIKey/usrname"})
@Test
public void WebloginCarLoan(String urlname,String Key)
{
	//Selenium
	System.out.println("WebloginCar");
	System.out.println(urlname);
	System.out.println(Key);

 }
@BeforeMethod
public void bfeverymethod()
{
	System.out.println("I will execute before every test method in this class");
}
@Test(dataProvider="getdata")
public void MobileloginCarLoan(String username,String password)
{
	//Appium
	System.out.println("MobileloginCar");
	System.out.println(username);
	System.out.println(password);
}
@Test(enabled=false)
public void MobilesigninCarLoan()
{
	//Appium
	System.out.println("Mobilesignin");
}
@Test(timeOut=4000)
public void MobilesignoutCarLoan()
{
	//Appium
	System.out.println("Mobilesignout");
}
@Test(groups= {"smoke"})
public void APIloginCarLoan()
{
	//Rest API Automation
	System.out.println("APIloginCar");
	
}
@DataProvider
public Object[][] getdata()
{
	//1st combination - usernmae password - good credit history=row
	//2nd - username password - no crdit history
	//3rd - fraudelent credit history
	Object[][] data=new Object[3][2];
	data[0][0]="firstusername";
	data[0][1]="password";
	
	//coloumn in the row are nothing but values for that paricular combination(row)
	
	//2nd set
	data[1][0]="secondusername";
	data[1][1]="secondpassword";
	
	//3rd set
	data[2][0]="tirdusername";
	data[2][1]="thirdpassword";
	return data;
}

}
