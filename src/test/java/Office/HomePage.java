package Office;

import org.testng.annotations.Test;

import pageObject.HomePageO;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resor.Base;

public class HomePage extends Base 
{
	public static Logger Log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));	
	}

	@Test
	public void Homepage() throws IOException
	{
		HomePageO h=new HomePageO(driver);
// To Present element present
		if(driver.findElements(By.xpath("//label[contains(text(),'State Industrial Development Authority, Uttarakhan')]")).size()!=0)
	       {
	    	   System.out.println("present");
	       }
	       else
	       {
	    	   System.out.println(" Not present");

	       }
		
//visibile
	       
	     if(driver.findElement(By.cssSelector("div.widget1.col-md-offset-2.col-md-9:nth-child(7) table:nth-child(2) tbody:nth-child(1) tr:nth-child(1) td:nth-child(2) > label:nth-child(2)")).isDisplayed())
	       {
	    	   System.out.println("Displayed");

	       }
	       else
	       {
	    	   System.out.println(" Not Displayed");

	       }
 //Text Present     
	if(driver.getPageSource().contains("State Industrial Development Authority, Uttarakhan"))
			 {
		    	   System.out.println("Text present");

		       }
		   else
		       {
		    	   System.out.println(" Not present");

		       }
	//check Enable
	  if(driver.findElement(By.cssSelector("#ImageButton2")).isEnabled())
      {
	   System.out.println("Link is enabled");

      }
    else
      {
	   System.out.println(" Link is not enabled");

       }		
		
	     System.out.println("HomePage");      

	       Log.info(" Navigated to Home page");
	       Assert.assertEquals(h.getLogoText().getText(), "12State Industrial Development Authority, Uttarakhand");
}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;

	}

}
