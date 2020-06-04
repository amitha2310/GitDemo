import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updateddropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://spicejet.com/");
	//	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	//	System.out.println(driver.findElement(By.xpath("//div[@id='divdiscountcheckbox']//em[contains(text(),'Senior Citizen')]")).isSelected());
	//	driver.findElement(By.xpath("//input[@id='divdiscountcheckbox']//input[contains(text(), 'checkbox')")).click();
	//	System.out.println(driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen']")).isSelected());
		
	//count the number of check boxes
		
	//	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
/* this is for Check of Rahulshetty application
 */
		/*
		 * System.out.println(driver.findElement(By.cssSelector(
		 * "input[id='checkBoxOption1']")).isSelected());
		 * driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		 * System.out.println(driver.findElement(By.cssSelector(
		 * "input[id='checkBoxOption1']")).isSelected());
		 * driver.findElement(By.cssSelector("input[id='checkBoxOption2']")).click();
		 * driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).click();
		 * driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).click();
		 * 
		 * 
		 * System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		 */
	}

}
