package Framework.ExcelDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	//once column is identified then scan entire testcase coloumn to identify purchase testcase row
	//after you grab purchase testcase row, pull all the data of that row and feed into test
	
	public ArrayList<String> getData(String testcaseName) throws IOException
	//fileinputstream argument
	{
			ArrayList<String> a=new ArrayList<String>();
			FileInputStream fis=new FileInputStream("c://users//navee//Documents//demodata.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			int sheets=workbook.getNumberOfSheets();
			
		 
			for(int i=0;i<sheets;i++)
			{
				if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
				{
					XSSFSheet sheet=workbook.getSheetAt(i);
					//identify the testcase by scanning the entire 1st row
					Iterator<Row> rows=sheet.iterator(); //sheet is a collection of rows
					Row firstrow=rows.next();
					Iterator<Cell> cel=firstrow.cellIterator();
					int k=0;
					int coloumn = 0;
					while(cel.hasNext()) //row is collection of cells
					{
						Cell value=cel.next();
						if(value.getStringCellValue().equalsIgnoreCase("testcase"))
						{
							coloumn=k;
						}
						k++;
					}
					System.out.println(coloumn);
					//once column is defined then scan entire testcase colomn to identif purchase testcase row
					while(rows.hasNext())

					{
						Row r=rows.next();
						if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("testcaseName"))
						{
							//after you grab purchase testcase row, pull all the data of that row and feed into test
							Iterator<Cell> cv=r.cellIterator();
							while(cv.hasNext())
							{
							a.add(cv.next().getStringCellValue());
							}
						}
						
					}
					
				}
			}
			return a;
			}
			
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
					
		
	}

}
