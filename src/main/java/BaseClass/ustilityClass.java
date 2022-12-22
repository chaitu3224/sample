package BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ustilityClass {

	
		public static void Screenshot(WebDriver driver,String strID) throws IOException {
			Date s=new Date();
			String n = s.toString().replace(":", "-");
			File n1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    File ss=new File("Screenshot"+strID+"_"+n+".jpg");
		    FileHandler.copy(n1, ss);
		}
		public static String ExcelSheet(int row,int col) throws EncryptedDocumentException, IOException {
			FileInputStream ex=new FileInputStream("D:\\automation\\FacebooksignUp.xlsx");
			Sheet data = WorkbookFactory.create(ex).getSheet("Sheet1");
			String excel = data.getRow(row).getCell(col).getStringCellValue();
			return excel;
		}

	}

	


