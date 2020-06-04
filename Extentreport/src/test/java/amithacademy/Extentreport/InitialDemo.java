package amithacademy.Extentreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class InitialDemo {
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		//Extent reports, ExtentSparkReporter
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Web Automation Results");
		report.config().setDocumentTitle("Test Results");
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Amitha");
	}
	@Test
	public void demo() { 
		
		extent.createTest("Demo");		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		extent.flush();
				
	}

}
