package Framework.ExcelDriven;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			dataDriven d=new dataDriven();
			ArrayList data=d.getData("Purcahse");
			System.out.println(data.get(0));
			System.out.println(data.get(1));
			System.out.println(data.get(2));
			System.out.println(data.get(3));
			
	// if you are working with selenuim or appium just give the path and send data from xls 		
	//		driver.findElement(By.xpath("fdee")).sendkeys(data.get(2));
			
	}

}
