import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//

public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		List<WebElement> firstCol=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
			
		ArrayList<String> originalList=new ArrayList<String>();
		
		for(int i=0;i<firstCol.size();i++)
		{
			originalList.add((firstCol.get(i).getText()));
		}
		
		ArrayList<String> copiedList=new ArrayList<String>();
		
		for(int i=0;i<copiedList.size();i++)
		{
			copiedList.add(originalList.get(i));
		}
		
			System.out.println("***********************************");
			Collections.sort(copiedList);
		//  Collections.reverse(copiedList);
			
		for(String s1: copiedList)
		{
			System.out.println(s1);
		}
			System.out.println("**************originalList****************");
		for(String s2: originalList)
		{
			System.out.println(s2);
			
		}
		
	}

}
