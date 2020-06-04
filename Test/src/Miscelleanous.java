import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:\\work\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		//  driver.manage().deleteCookieNamed("sessionkey");
			
		//  click on any link
		//  login page- verify login url
			
			driver.get("http://google.com");
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Work\\Amitha\\screenshot.png"));
	}

}
