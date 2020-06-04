import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchItem  {
	
	public SearchItem() {
		
		System.out.println("I am searching an Item");
			}

	public void EnterInput() {		
		
		System.out.println(driver.getTitle());
	//	driver.findElement(By.xpath("//*[@id='secondary']")).click();
	//	driver.findElement(By.xpath("//*li[@id='deals-clearance']")).click();
		driver.findElement(By.xpath("//*[@id='search']")).sendKeys("women");
		driver.findElement(By.xpath("//*[@id='headerMain']/div/form/button[2]")).click();
		
	/*	driver.findElement(By.id("search")).sendKeys("096-13-0875");
		driver.findElement(By.xpath("//*[@id='headerMain']/div/form/button[2]")).click();
		WebElement image=driver.findElement(By.xpath("//h3/a[contains(@href,'/p/women-s-fia-crochet-flip-flops-shade-shore/')]"));
	   	JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", image);
	//	driver.close(); */
	}
	}
	


