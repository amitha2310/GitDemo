import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUrl {
		

	public SetUrl() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	System.out.println("Base Url = "+BaseUrl1);
		//driver.get(BaseUrl1);
		driver.get("www.walmart.com");
	}
	public WebDriver driver= new ChromeDriver();

 
}
