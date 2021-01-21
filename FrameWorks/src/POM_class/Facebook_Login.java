package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Facebook_Login extends Base_Page
{
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="u_0_b")
	private WebElement loginbtn;
	
	public Facebook_Login(WebDriver driver)
	{
		super(driver);
	}
	
	public void setEmail(String mail)
	{
		email.sendKeys(mail);
	}	
	public void setPass(String pwd)
	{
		password.sendKeys(pwd);
	}	
	public void passBtn()
	{
		loginbtn.click();
	}
}