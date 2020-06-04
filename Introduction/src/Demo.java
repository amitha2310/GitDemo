import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo{
	
	public static void main(String[] args) {
			
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	/*	driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("amitha");
		driver.findElement(By.cssSelector("#password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[contains(@name, 'procee')]")).click();  */
		
		driver.get("http://google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div[2]/input")).sendKeys("friuts");
		//driver.findElement(By.xpath("")).click();
			//driver.get(arg0);
			
		}
}