import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Target {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.target.com/");		
		driver.manage().window().maximize() ;		
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='secondary']")).click();
		driver.findElement(By.xpath("//li[@id='5']/a")).click();
		
	/*	driver.findElement(By.xpath("//a[@href='#accountMenu']")).click();
		WebElement signin = driver.findElement(By.xpath("//li[@id='accountNav-signIn']/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", signin);
		
		driver.findElement(By.id("username")).sendKeys("naveen192@gmail.com");
		driver.findElement(By.id("password")).sendKeys("india123");		
		WebElement login=driver.findElement(By.id("login"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()", login); 		
		
	/*	driver.findElement(By.id("search")).sendKeys("096-13-0875");
		driver.findElement(By.xpath("//*[@id='headerMain']/div/form/button[2]")).click();
		WebElement image=driver.findElement(By.xpath("//h3/a[contains(@href,'/p/women-s-fia-crochet-flip-flops-shade-shore/')]"));
	   	JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", image);*/
		
		/*driver.findElement(By.id("search")).sendKeys("096-13-0875"); 		
		driver.findElement(By.xpath("//*[@id=\"headerMain\"]/div[1]/form/button[2]")).click(); 		
		driver.findElement(By.xpath("//h3/a[contains(@href,'/p/women-s-fia-crochet-flip-flops-shade-shore/')]")).click(); 		
		*/
				
	}

}
