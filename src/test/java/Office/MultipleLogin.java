package Office;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.HomePageO;
import resor.Base;



public class MultipleLogin extends Base
{
	public static Logger Log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));	
	}
	
@Test(dataProvider="getData")
	public void LoginP(String Username,String Password) throws IOException
	{
	
	//one is inheritance
	//creating object to that class & invoke methods of it
	//driver.manage().window().maximize();

	HomePageO Home=new HomePageO(driver);
	Home.getUserName().sendKeys(Username);
	Home.getPassWord().sendKeys(Password);
	
    System.out.println("Multiple Registration Done");      
 
    Log.info(" Navigated to multiple login home page");
	
	}
@DataProvider
public Object[][] getData()
{
	//row stands for how many diff data types test should run
	//column stand for how many values per each test
	Object[][] data=new Object[2][2];
	//0th row
	data[0][0]="nru@qw.com";
	data[0][1]="12345";
	//data[0][2]=" non Restricted User";

	//1st row
	data[1][0]="ru@qw.com";
	data[1][1]="8911";
	//data[1][2]="Restricted User";

	return data;
}
@AfterTest
public void teardown()
{
	driver.close();
	//driver.quit();
	driver=null;

}
}

