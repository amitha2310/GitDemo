import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		String passengerid,passengervalue;
//		driver.get("http://spicejet.com/");		
//		driver.get("http://rahulshettyacademy.com/dropdownsPractise/#");
//		driver.get("https://www.makemytrip.com/");
		driver.get("https://www.bankofamerica.com/");
		
		
/*  Test case to passenger counts
 * 
 
		passengerid = "ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT";
		passengervalue = "2";
		driver.findElement(By.id("divpaxinfo")).click();
		Select s=new Select(driver.findElement(By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT']")));
		s.selectByValue(passengervalue);
		s.selectByIndex(6);
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD']")));
		s1.selectByValue("2");
*/
//Test case for + or - passengers
		
/*		for(int i=1;i<5;i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
		}
	
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		
*/

/*		driver.findElement(By.xpath("//div[@id='travelOptions']//label[contains(text(),'Round Trip')]")).click();
		driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
*/
		
// Code for Checkbox Seleciton 
		System.out.println("Checkbox is Selection ready");	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10); WebElement element1 =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(demo)));
		 * element1.click(); driver.manage().window().maximize();
		 * if(!driver.findElement(By.xpath(demo)).isSelected()) // to check the checkbox
		 * is already selected or not {
		 * 
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath(demo)).click(); // Select the checkbox
		 * 
		 * }
		 */


		
		String demo = "//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends']";
		String demo2= "//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen']";
		String demo3="//input[@id='saveOnlineId']";  // This is for Bank of America
		if(!driver.findElement(By.xpath(demo3)).isSelected())    
			// to check the checkbox is already selected or not
			{
			System.out.println("Inside Condition");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath(demo3)).click();   // Select the checkbox

			}
		System.out.println("outside Condition");
	
/* This is for Bank of America. 
 * 		
 */
	 
		
		
/* This is the parent-child way of xpath for "//a[@value='MAA']"	
		driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[@value='MAA']")).click();
*/		
		
/* Autosuggestive dropdowns
 */
//	WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']"));
//	driver.findElement(By.id("fromCity")).click();
//	source.sendKeys("Mum");
//	source.sendKeys(Keys.ARROW_DOWN);
//	source.sendKeys(Keys.ENTER);
	
//	WebElement destination=driver.findElement(By.xpath("//input[@placeholder='To']"));
//	driver.findElement(By.id("toCity")).click();
//	destination.sendKeys("del");
//	for(int i=0;i<=3;i++) {
//		destination.sendKeys(Keys.ARROW_DOWN);
//	}
//	destination.sendKeys(Keys.ENTER);
//		
		
	//	WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']"));
		
	/*	  driver.findElement(By.id("fromCity")).click();
		  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mum");
		  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys. ARROW_DOWN);
		  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER); 
		  System.out.println("hi"); 
		  System.out.println(driver.findElement(By.xpath("//p[@title='BOM, Chhatrapati Shivaji International Airport India']")));
	*/

	//	WebElement destination=driver.findElement(By.xpath("//input[@placeholder='To']"));
	//	driver.findElement(By.id("toCity")).click();
	//	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("del");
		/*
		 * System.out.println(" hello"); for(int i=0;i<=3;i++) {
		 * driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.
		 * ARROW_DOWN); Thread.sleep(1000);
		 * 
		 * System.out.println((driver.findElement(By.xpath("//input[@placeholder='To']")
		 * ).getClass().getName()));
		 * 
		 * } Thread.sleep(1000);
		 * driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
		 */
}
}
