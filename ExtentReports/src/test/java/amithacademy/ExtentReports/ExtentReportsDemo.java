package amithacademy.ExtentReports;

import org.testng.annotations.Test;

public class ExtentReportsDemo {
	
	@Test
	public void initialDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	}

}
