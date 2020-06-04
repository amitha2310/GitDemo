import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "c:\\Work\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//	driver.findElement(By.id("draggable")).click();
     		Actions a=new Actions(driver);
			WebElement source=driver.findElement(By.id("draggable"));
			WebElement target=driver.findElement(By.id("droppable"));
			a.dragAndDrop(source, target).build().perform();
			
      /*    to come out from frame
       * 
			driver.switchTo().defaultContent();
	  */
			
	 /*     if you have multiple frames(find by index)
	  * 
	  *     System.out.println(driver.findElement(By.tagname("iframe")).size());
	  *     driver.switchTo().frame(0);		
	  */
			
			
			
		// for multiple frames
			
/*			driver.get("http://the-internet.herokuapp.com/");
			driver.findElement(By.linkText("Nested Frames")).click();
			driver.switchTo().frame("frame-top");
			driver.switchTo().frame("frame-middle");
			System.out.println(driver.findElement(By.id("content")).getText());
*/

	}

}
