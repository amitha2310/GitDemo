import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				System.setProperty("webdriver.chrome.driver", "C:\\Work\\Driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://google.com");
			}
	}


