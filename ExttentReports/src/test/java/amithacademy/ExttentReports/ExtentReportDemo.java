package amithacademy.ExttentReports;

import org.testng.annotations.Test;

public class ExtentReportDemo {
	
@Test
public void initialDemo()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println((driver.getTitle());
	
}

}
