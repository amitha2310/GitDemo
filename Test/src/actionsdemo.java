import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "c:\\Work\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		/*	driver.get("https://www.amazon.com/");
		    Actions a= new Actions(driver);
		    WebElement move=driver.findElement(By.id("nav-link-accountList"));
		    a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick();
			a.moveToElement(move).contextClick().build().perform();
		*/
			
		//For handling multiple windows
			driver.get("http://the-internet.herokuapp.com");
			driver.findElement(By.linkText("Multiple Windows")).click();
			driver.findElement(By.linkText("Click Here")).click();
			Set<String> ids=driver.getWindowHandles();
			Iterator<String> it=ids.iterator();
			String parentid=it.next();
			String childid=it.next();
			
			driver.switchTo().window(childid);
			System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
			driver.switchTo().window(parentid);
			System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());


			
			
	}

}
