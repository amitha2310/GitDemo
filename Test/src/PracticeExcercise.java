import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			System.setProperty("webdriver.chrome.driver", "c:\\Work\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("http://qaclickacademy.com/practice.php");
			driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
			String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
			WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
			Select s=new Select(dropdown);
			s.selectByVisibleText(opt);
			driver.findElement(By.name("enter-name")).sendKeys(opt);
			driver.findElement(By.id("alertbtn")).click();
			String text=driver.switchTo().alert().getText();
			if(text.contains(opt)) {
			
				System.out.println("Alert message was success");
			}
		
			
	}

}
