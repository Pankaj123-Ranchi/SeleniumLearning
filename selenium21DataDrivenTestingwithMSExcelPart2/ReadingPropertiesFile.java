package selenium21DataDrivenTestingwithMSExcelPart2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {

		// Location of Properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\config.properties");

		// Create Object of Properties class
		Properties propertiesobj = new Properties();

		// Load the properties file,Loads all key-value pairs into memory.
		propertiesobj.load(file);
		
		//Reading data from properties file
        String url =propertiesobj.getProperty("appur1");
        String email =propertiesobj.getProperty("email");
        String pwd =propertiesobj.getProperty("password");
        String orid =propertiesobj.getProperty("orderid");
        String custid =propertiesobj.getProperty("customerid");
        
        System.out.println(url+" "+email+" "+pwd+" "+orid+" "+custid);
        
        //Reading all the keys from properties file
        //Set<String> Keys = propertiesobj.stringPropertyNames();//[password, orderid, appur1, customerid, email]
        
        //System.out.println(Keys);
        
        Set<Object>keys = propertiesobj.keySet();
        System.out.println(keys); //[password, orderid, appur1, customerid, email]
        
        //Reading all the values from properties file
        Collection<Object> values = propertiesobj.values();
        System.out.println(values);//[abcxyz, 123, https://demo.opencart.com/, 234, abc@gmail.com]
        
        file.close();
        
	}

}
