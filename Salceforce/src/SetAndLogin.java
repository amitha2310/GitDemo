import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetAndLogin {
	String ClientName;

	public SetAndLogin() {
		System.out.println(" I am in Constructor");
		System.out.println("Assigning Client Name");
		ClientName="amitha";
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\ChromeDriver.exe");
		
	}
	
	public void DoLogin() {
		System.out.println("I am in DoLogin Method");
		WebDriver driver=new ChromeDriver();
		    driver.get("https://login.salesforce.com/");
		    driver.findElement(By.id("username")).sendKeys(ClientName);
		    driver.findElement(By.name("pw")).sendKeys("123456");
		    driver.findElement(By.xpath("//*[@id='Login']")).click();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		    driver.close();
		
		    
	}
	
	public void DoLogout() {
		System.clearProperty("webdriver.chrome.driver");
	}
	
	
	
}
