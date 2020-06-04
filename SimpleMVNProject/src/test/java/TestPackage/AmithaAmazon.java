package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmithaAmazon {
	@Test
	public void OpenWebPage() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
	System.setProperty("webdriver.chrome.silentOutput","true");
	

	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://amazon.com");
	System.out.println(driver.getTitle());		
	driver.findElement(By.xpath("//a[@href='#accountMenu']")).click();
}
	
	
}
