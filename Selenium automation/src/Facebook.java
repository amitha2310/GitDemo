import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	/*	driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#email")).sendKeys("amitha");
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys("naveen");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345rew"); */
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//div[@class=’RNNXgb’]/div[2]/div/input")).sendKeys("friuts");
		driver.findElement(By.xpath("//div[class='gb_Zf']/div/div/div[2]/a")).click();
		
	}

}
