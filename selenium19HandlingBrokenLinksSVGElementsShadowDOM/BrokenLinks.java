package selenium19HandlingBrokenLinksSVGElementsShadowDOM;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1) Link href="https://xyz.com"

2) https://xyz.com --- > server --- > status code

3) status code>=400   broken link
status code <400      not a broken link
*/
public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//capture all the links from website
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number Of links:" + links.size());
		
		int noOfBrokenLinks = 0;
		
		for(WebElement linkElement:links) 
		{
			String hrefattvalue = linkElement.getAttribute("href");
			
			if(hrefattvalue == null || hrefattvalue.isEmpty())
			{
				System.out.println("href Attribute value is null or empty. So not possible to check");
				continue;
				//The continue statement in Java is a loop control statement used to skip the current iteration of a loop and proceed immediately to the next iteration
			}
			
			//Hit URL to the server
			try 
			   {
			   URL linkURL = new URL(hrefattvalue);//converted href value from string to URL format
			   HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();//open connection to the server
			   conn.connect();//connect to server and sent request to the server
			
			   if(conn.getResponseCode()>= 400)
			{
				System.out.println(hrefattvalue +"=====>   Broken Link");
				noOfBrokenLinks++;
			}
			  else
			{
				System.out.println(hrefattvalue +"=====>  Not a Broken Link");
			}
			
		       }
			catch(Exception e)
			{
				
			}
	
	}//For Loop Complete
     System.out.println("Number of Broken Links:" + noOfBrokenLinks);
   }
}

