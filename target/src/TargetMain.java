import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TargetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		
	
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://target.com");
		
		/*
		ChromeOptions options = new ChromeOptions();
        try {
            driver = new RemoteWebDriver(new URL("http://80.0.3987.106:13954"), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
	*/
		

	//	WebDriver driver = new ChromeDriver();
		
		
        System.out.println(driver.getTitle());		
		driver.findElement(By.xpath("//a[@href='#accountMenu']")).click();
		WebElement signin = driver.findElement(By.xpath("//li[@id='accountNav-signIn']/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", signin);
		
		driver.findElement(By.id("username")).sendKeys("naveen192@gmail.com");
		driver.findElement(By.id("password")).sendKeys("india123");		
		WebElement login=driver.findElement(By.id("login"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()", login); 
        
        
        
        /*//variables
		String BaseURL="www.target.com"; 
		SetUrl S=new SetUrl();
				
		LoginAndLogout L=new LoginAndLogout();
		L.Login();
	
		SearchItem I=new SearchItem();
		I.EnterInput();
		*/
		
	}

}
