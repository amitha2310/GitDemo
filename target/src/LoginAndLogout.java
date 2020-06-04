import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogout extends SetUrl{
	
	 public LoginAndLogout() {
		 System.out.println("Doing Login ang Logout for Target");
	 }
	
	public void Login() {
		
		System.out.println(driver.getTitle());		
		driver.findElement(By.xpath("//a[@href='#accountMenu']")).click();
		WebElement signin = driver.findElement(By.xpath("//li[@id='accountNav-signIn']/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", signin);
		
		driver.findElement(By.id("username")).sendKeys("naveen192@gmail.com");
		driver.findElement(By.id("password")).sendKeys("india123");		
		WebElement login=driver.findElement(By.id("login"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()", login); 
	}

}
