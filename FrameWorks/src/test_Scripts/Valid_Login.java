package test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM_class.Facebook_Login;
import generic.Base_Test;
import generic.Generic_Read_Excel;

public class Valid_Login extends Base_Test 
{
	@Test
	public void login()
	{
		String username=Generic_Read_Excel.getData("Sheet1",0,0);
		String Pwd= Generic_Read_Excel.getData("Sheet1",0,1);
		Facebook_Login fb = new Facebook_Login(driver);
		fb.setEmail(username);
		fb.setPass(Pwd);
		fb.passBtn();
		Assert.fail();
	}
}