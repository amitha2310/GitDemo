import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// give me the count of links on the page
		
		System.setProperty("webdriver.chrome.driver", "c:\\Work\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//count of footer section
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));   //Limiting webdriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
//count of footer column section
		
		WebElement coloumnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumnDriver.findElements(By.tagName("a")).size());
		
//click on each link in the column and check the each page is open
		
		for(int i=1;i<coloumnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonLinkTab=Keys.chord(Keys.CONTROL, Keys.ENTER);
			coloumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
		}//open all the tabs
		
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
	}

}
