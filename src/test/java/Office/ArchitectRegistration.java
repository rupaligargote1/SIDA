package Office;


import org.testng.annotations.Test;
import java.awt.List;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/*import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;*/
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.Iterators;

import pageObject.HomePageO;
import pageObject.registrationPage;
import resor.Base;
import resor.ExcelDataConfig;

public class ArchitectRegistration<Webelements> extends Base
{
	public static Logger Log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));	
	}
	
	@Test
	
	public void architectRegistration() throws IOException, InterruptedException
	{
		
		ExcelDataConfig excel=new ExcelDataConfig("F:\\Rupali\\demodata.xlsx");
		HomePageO Home=new HomePageO(driver);
		Home.getArchitectRegistrationLink().click();
	    registrationPage reg=new registrationPage(driver);

//Fill Personal Information
       Set<String> ids=driver.getWindowHandles() ;
       Iterator<String> it=ids.iterator();
       String parent=it.next();
       String child=it.next();
       driver.switchTo().window(child);
  
       System.out.println(driver.getTitle());
      
       Select s1=new Select(reg.getInitials());
       
       s1.selectByVisibleText(excel.getData(1, 0, 2));
       reg.getName().sendKeys(excel.getData(1, 1, 2));
       Select s2=new Select(reg.getApplicantType());
       s2.selectByVisibleText(excel.getData(1, 2, 2));
//Fill Contact Information
       reg.getPincode().sendKeys(excel.getData(1, 3, 2));
       reg.getMobileNo().sendKeys(excel.getData(1, 4, 2));
       reg.getEmail().sendKeys(excel.getData(1, 5, 2));       
       
//Fill Registration Details  
     
/*      Screen s=new Screen();
Pattern p1=new Pattern("F:\\Rupali\\Attachments\\Attach1.png");
s.click(p1);
Pattern p2=new Pattern("F:\\Rupali\\Attachments\\Attach2.png");
s.wait(p2, 20);
s.click(p2);
//Thread.sleep(500);
Pattern p3 = new Pattern("F:\\Rupali\\Attachments\\FileTextBox.png");
s.click(p3);
s.type(p3, "C:\\Users\\Pradip\\Desktop\\cc.pdf");
Pattern p4 = new Pattern("F:\\Rupali\\Attachments\\OpenButton.png");
s.click(p4);
WebDriverWait wait = new WebDriverWait(driver,30);


Pattern p5=new Pattern("F:\\Rupali\\Attachments\\Attach3.png");
s.click(p5);
Pattern p6=new Pattern("F:\\Rupali\\Attachments\\Attach4.png");
s.wait(p6, 20);
s.click(p6);
//Thread.sleep(500);
Pattern p7 = new Pattern("F:\\Rupali\\Attachments\\Attach5.png");
s.wait(p7, 20);
s.click(p7);
s.type(p7, "C:\\Users\\Pradip\\Desktop\\cc1.pdf");
Pattern p8 = new Pattern("F:\\Rupali\\Attachments\\Attach6.png");
s.click(p8);*/
       
       
       /*reg.getMonth().click();
       reg.getDay().click();
       reg.getRegistrationNo().sendKeys(excel.getData(1, 11, 2));*/
      // reg.getValidUptodate().click();
       //reg.getDay().click();
/*  driver.findElements(By.className("datepicker-switch")).size();
boolean text1=driver.findElement(By.cssSelector("[class='datepicker-days'][class='datepicker-switch']")).getText().contains("December");
while(!text1)
{
	reg.getnext().click();
}
   int count=driver.findElements(By.className("day")).size();
    for(int i=0;i<count;i++)
    {
    	String text2=driver.findElements(By.className("day")).get(i).getText();
    	if(text2.equals("25"))
    	{
        	driver.findElements(By.className("day")).get(i).click();
        	break;
    	
    	}
    	
    }*/
       
//Fill Login Information
       //reg.getLoginName().sendKeys(excel.getData(1, 12, 2));
       reg.getPassword().sendKeys(excel.getData(1, 13, 2));
       reg.getRePassword().sendKeys(excel.getData(1, 14, 2));
       reg.getAccepatance().click();
      // reg.getSubmit().click();
     System.out.println("Registration Done");      
       Log.info("Navigated to arcjitect Regis page");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}

}
