package propertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyDemo 
{
	@Test
	public void test_property() throws FileNotFoundException, IOException 
	{
		//create an object for property file
		Properties p=new Properties();
		
		//specify the path of the properties file
		p.load(new FileInputStream("./Demo1.properties"));
		
		//specify the Key of the value
		String UNvalue = p.getProperty("un");
		System.out.println(UNvalue);	
		
		String PWDvalue = p.getProperty("pwd");
		System.out.println(PWDvalue);		
	}
}