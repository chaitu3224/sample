package testClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.ustilityClass;
import Configaration.PathConfic;
import PomClass.FacebookSignUp;


public class FaceBookSignUpData {

	WebDriver driver;
	String strID;
	@BeforeClass
	public void Openwebpage() {
		System.setProperty("webdriver.chrome.driver",PathConfic.crome);
		 driver = new ChromeDriver();
		driver.get(PathConfic.FacebookSign);
		driver.manage().window().maximize();
	}	

	@AfterClass
	public void Close_the_browser() {
		driver.close();
		
	}
	@BeforeMethod
	public void signup_page_open() {
		driver.navigate().refresh();
		
	}
	@AfterMethod
	public void back_the_signup_page(ITestResult ss) throws IOException, InterruptedException {
		if(ITestResult.FAILURE==ss.getStatus()) {//ITestResult always use in method as parameterized and it is interface in testng
			ustilityClass.Screenshot(driver,strID);//and its also known as TestNG listener
	}
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
	@Test
	public void TC_01_with_ExcelSheetData() throws EncryptedDocumentException, IOException, InterruptedException {
		strID="001";
		Reporter.log("TC-001 with valid user name and valid password",true);
		FacebookSignUp test=new FacebookSignUp(driver);
		test.firstname(ustilityClass.ExcelSheet(0, 0));
		test.lastname(ustilityClass.ExcelSheet(1, 0));
		test.enteremail(ustilityClass.ExcelSheet(2, 0));
		test.enterpass(ustilityClass.ExcelSheet(3, 0));
		test.enterday(ustilityClass.ExcelSheet(4, 0));
		test.entermonth(ustilityClass.ExcelSheet(5, 0));
		test.enteryear(ustilityClass.ExcelSheet(6, 0));
		test.entermale();
		
		ustilityClass.Screenshot(driver, "TC-1");
		test.entersub();
		Thread.sleep(4000);
//		String tl = driver.getTitle();
//		Assert.assertEquals(tl, "Sign up for Facebook | Facebook");
		
		
	}
	@Test
	public void TC_02_with_ExcelSheetData_Invalid_pass() throws EncryptedDocumentException, IOException, InterruptedException {
		strID="002";
		Reporter.log("TC-002 with valid user name and valid password",true);
		FacebookSignUp test=new FacebookSignUp(driver);
		test.firstname(ustilityClass.ExcelSheet(0, 1));
		test.lastname(ustilityClass.ExcelSheet(1, 1));
		test.enteremail(ustilityClass.ExcelSheet(2, 1));
		test.enterpass(ustilityClass.ExcelSheet(3, 1));
		test.enterday(ustilityClass.ExcelSheet(4, 1));
		test.entermonth(ustilityClass.ExcelSheet(5, 1));
		test.enteryear(ustilityClass.ExcelSheet(6, 1));
		test.entermale();
		ustilityClass.Screenshot(driver, "Tc-2");
		
		 test.entersub();
		Thread.sleep(4000);
		//String tl = driver.getTitle();
		//Assert.assertEquals(tl, "Sign up ");
		Thread.sleep(4000);
		
	}
	@Test
	public void TC_03_with_ExcelSheetData_invalid_Both() throws EncryptedDocumentException, IOException, InterruptedException {
		strID="003";
		Reporter.log("TC-003 with valid user name and valid password",true);
		FacebookSignUp test=new FacebookSignUp(driver);
		test.firstname(ustilityClass.ExcelSheet(0, 2));
		test.lastname(ustilityClass.ExcelSheet(1, 2));
		test.enteremail(ustilityClass.ExcelSheet(2, 2));
		test.enterpass(ustilityClass.ExcelSheet(3, 2));
		test.enterday(ustilityClass.ExcelSheet(4, 2));
		test.entermonth(ustilityClass.ExcelSheet(5, 2));
		test.enteryear(ustilityClass.ExcelSheet(6, 2));
		 test.entermale();
		
		ustilityClass.Screenshot(driver,"TC-3");
		 test.entersub();
		 
//		String tl = driver.getTitle();
//		Assert.assertEquals(tl, "Sign ");
		Thread.sleep(4000);
		
	}
	
	public void scroll(WebElement btn2) {
		((JavascriptExecutor)driver).executeScript("argument[0].scrollIntoView(true);",btn2);
		
	}
	
}
