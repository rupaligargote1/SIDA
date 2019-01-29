package Office;

import org.testng.annotations.Test;

import com.google.common.base.Verify;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePageO;
import resor.Base;

public class Assetcase extends Base {

	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));	
	}
	@Test
	public void assertC()
{
	HomePageO h=new HomePageO(driver);
	

	Assert.assertEquals(h.getLogoText().getText(), "111State Industrial Development Authority, Uttarakhand");
	//
    System.out.println("Running assert"); 
    Assert.assertTrue(h.getBar().isDisplayed());
    System.out.println("Running True"); 

    /* Assert.assertFalse(h.getBar().isDisplayed());
     System.out.println("Running false");*/ 

}
	@AfterTest
	public void teardown()
	{
		driver.close();
		//driver.quit();
		driver=null;

	}

}
