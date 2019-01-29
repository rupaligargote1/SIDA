package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registrationPage 

{
	public WebDriver driver;
	
		public registrationPage(WebDriver driver) 
	{
		this.driver=driver;
	}

  
  By Initials=By.cssSelector("#cboInital");
  By Name=By.id("txtFName");
  By ApplicantType=By.xpath("//select[@id='cboArchitechType']");
  By Pincode=By.xpath("//input[@id='txtZip']");
  By MobileNo=By.xpath("//input[@id='txtMob']");
  By Email=By.xpath("//input[@id='txtEmail']");
  By ValidUptodate=By.xpath("//i[@id='raddate']");
  By Month=By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'»')]");
  By next=By.xpath("//td[@class='day'][contains(text(),'25')]");
	
  By RegistrationNo=By.xpath("//input[@id='txtRegNo']");
  By LoginName=By.xpath("//input[@id='txtLoginName']");
  By Password=By.xpath("//input[@id='txtPass']");
  By RePassword=By.xpath("//input[@id='txtPassR']");
  By Accepatance=By.xpath("//input[@id='chkDeclare']");
  By Submit=By.xpath("//button[@id='btnSubmit']");
  By AlertOk=By.xpath("//input[@id='txtRegNo']");
	public WebElement getInitials()
	{
		return driver.findElement(Initials);
	}
	
	public WebElement getName()
	{
		return driver.findElement(Name);
	}
	
	public WebElement getApplicantType()
	{
		return driver.findElement(ApplicantType);
	}
	
	public WebElement getPincode()
	{
		return driver.findElement(Pincode);
	}
	public WebElement getMobileNo()
	{
		return driver.findElement(MobileNo);
	}
	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}

	public WebElement getValidUptodate()
	{
		return driver.findElement(ValidUptodate);
	}
	
	public WebElement getMonth()
	{
		return driver.findElement(Month);
	}
	
	public WebElement getnext()
	{
		return driver.findElement(next);
	}
	public WebElement getRegistrationNo()
	{
		return driver.findElement(RegistrationNo);
	}
	public WebElement getLoginName()
	{
		return driver.findElement(LoginName);
	}
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement getRePassword()
	{
		return driver.findElement(RePassword);
	}
	public WebElement getAccepatance()
	{
		return driver.findElement(Accepatance);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(Submit);
	}
	
	public WebElement getAlertOk()
	{
		return driver.findElement(AlertOk);
	}
}

