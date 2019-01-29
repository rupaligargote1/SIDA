package resor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class Base 
{
	public static WebDriver driver;
	public Properties prop;

public WebDriver initializeDriver() throws IOException  
{
prop=new Properties();
FileInputStream fis=new FileInputStream("F:\\Rupali\\SIDA\\src\\main\\resources\\data.properties");
prop.load(fis);
String browserName=prop.getProperty("browser");
		
if(browserName.equals("chrome"))
{
			
System.setProperty("webdriver.chrome.driver", "F:\\Rupali\\Drivers\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();

}
else if(browserName.equals("firefox"))
{
System.setProperty("webdriver.gecko.driver", "F:\\Rupali\\Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
driver=new FirefoxDriver();
}
else if(browserName.equals("IE"))
{
	//execute IE driver
	System.setProperty("webdriver.ie.driver", "F:\\Rupali\\Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	driver=new InternetExplorerDriver();
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
		
	}
public void getScreenshot(String result) throws IOException
{
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(src,new File())
FileHandler.copy(src,new File("F:\\Rupali\\SIDA\\"+result+"screenshot.png"));


}



}
