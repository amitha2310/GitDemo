import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();

driver.get("https://login.salesforce.com/");
driver.findElement(By.id("username")).sendKeys("amitha");
driver.findElement(By.name("pw")).sendKeys("123456");
driver.findElement(By.xpath("//*[@id='Login']")).click();

	}

}
