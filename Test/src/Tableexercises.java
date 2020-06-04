import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class Tableexercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		System.setProperty("webdriver.chrome.driver", "c:\\Work\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		System.out.println(rowcount);
		System.out.println(count);
		for(int i=0;i<count-2;i++)
		{
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueinteger=  Integer.parseInt(value);
		sum=sum+valueinteger;//103
		}
		//System.out.println(sum);

		String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(Extras);
		int TotalSumValue=sum+extrasValue;
		System.out.println(TotalSumValue);


		String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalVAlue=Integer.parseInt(ActualTotal);
		if(ActualTotalVAlue==TotalSumValue)
		{
		System.out.println("Count Matches");
		}
		else
		{
		System.out.println("count fails");
		}
	}

}
