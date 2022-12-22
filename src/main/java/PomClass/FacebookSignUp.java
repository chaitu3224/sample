package PomClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	@FindBy(xpath="//input[@name='firstname']") private WebElement firstname; 
	@FindBy(xpath="//input[@name='lastname']") private WebElement lastname;
	@FindBy(xpath="//input[@name='reg_email__']") private WebElement email;
	@FindBy(xpath="(//input[@type='password'])") private WebElement pass;
	@FindBy(xpath="//select[@title='Day']") private WebElement day;
	@FindBy(xpath="//select[@id='month']") private WebElement month;
	@FindBy(xpath="//select[@id='year']") private WebElement year;
	@FindBy(xpath="(//input[@type='radio'])[2]") private WebElement btn;
	@FindBy(xpath="(//button[@type='submit'])[1]") private WebElement submit;
	
	WebDriver driver;

	public FacebookSignUp(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void firstname(String name) {
		firstname.sendKeys(name);
	}
	public void lastname(String last) {
		lastname.sendKeys(last);
	}
	public void enteremail(String mail) {
		email.sendKeys(mail);
	}
	public void enterpass(String password) {
		pass.sendKeys(password);
	}
	public void enterday(String aa) {
		Select dy=new Select(day);
		dy.selectByVisibleText(aa);
			
	}
	public void entermonth(String mth) {
		Select mm=new Select(month);
		mm.selectByVisibleText(mth);
	}
	public void enteryear(String yr) {
		Select yy=new Select(year);
		yy.selectByVisibleText(yr);
	}
	public void entermale() {
		 btn.click();
		
	}
	public void entersub() {
		submit.click();
	}

}
