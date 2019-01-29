package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageO 
{

 WebDriver driver;
	

	public HomePageO(WebDriver driver) 
	{
		this.driver=driver;
		
	}
    By LogoText=By.xpath("//label[contains(text(),'State Industrial Development Authority, Uttarakhan')]");
	By Bar=By.xpath("//ul[@class='level1 static']");
	By UserName=By.xpath("//input[@id='txtUsername']");
	By PassWord=By.xpath("//input[@id='txtPassword']");
	By ArchitectRegistrationLink=By.cssSelector("#ImageButton2");
	
	public WebElement getLogoText()
	{
		return driver.findElement(LogoText);
	}
	public WebElement getBar()
	{
		return driver.findElement(Bar);
	}
	public WebElement getUserName()
	{
		return driver.findElement(UserName);
	}
	public WebElement getPassWord()
	{
		return driver.findElement(PassWord);
	}


public WebElement getArchitectRegistrationLink()
{
	return driver.findElement(ArchitectRegistrationLink);
}







}
