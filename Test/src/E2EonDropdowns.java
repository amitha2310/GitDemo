import java.util.List;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2EonDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\Work\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String passengerid, passengervalue, currencyid, currencyvalue;
	    driver.get("http://spicejet.com");
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		  driver.findElement(By. xpath("//div[@id='travelOptions']//label[contains(text(),'Round Trip')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.cssSelector("input[class='select_CTXT']")).click();
		  driver.findElement(By.xpath("//a[@value='DEL']")).click();
		  driver.findElement(By.xpath("//a[@value='MAA']")).click();
		  Thread.sleep(1000); driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		  driver.findElement(By.id("divpaxinfo")).click(); 
		  passengerid="ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT";
		  passengervalue="4"; 
		  Select s=new
		  Select(driver.findElement(By.id(passengerid)));
		  s.selectByValue(passengervalue); 
		  currencyid="ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency";
		  currencyvalue="USD"; 
		  Select s1=new Select(driver.findElement(By.id(currencyid)));
		  s1.selectByValue(currencyvalue);
		  driver.findElement(By.xpath("//p[@id='seniorcitizen']/parent::div/input")).click();
		  driver.findElement(By.cssSelector("input[type='submit']")).click();
		  
		  
		 

		/*
		 * Thread.sleep(1000); driver.findElement(By.id("name")).sendKeys("Amitha");
		 * Thread.sleep(1000); driver.findElement(By.id("alertbtn")).click();
		 * System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().accept();
		 * driver.findElement(By.id("confirmbtn")).click();
		 * System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().dismiss();
		 */
	}

}
