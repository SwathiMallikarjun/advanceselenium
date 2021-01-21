package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements FrameWork_constants
{
	public WebDriver driver;
	@BeforeMethod
	public void openAppl()
	{
		System.setProperty(Gecko_Key, Gecko_Value);
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}	
	
	@AfterMethod
	public void closeAppl(ITestResult res) throws IOException
	{	
		if(ITestResult.FAILURE==res.getStatus())
		{
			Screenshot.getPhoto(driver);
		}	
		driver.quit();
	}
}