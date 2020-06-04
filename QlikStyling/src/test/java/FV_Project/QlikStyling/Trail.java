package FV_Project.QlikStyling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Trail {

	@Test
	public void traildemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	}
}
