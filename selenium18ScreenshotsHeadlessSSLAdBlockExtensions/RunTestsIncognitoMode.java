package selenium18ScreenshotsHeadlessSSLAdBlockExtensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestsIncognitoMode {

	public static void main(String[] args) {
		
		
		    //# Initialize ChromeOptions
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--incognito");
		    
		    
		    //# Pass options to ChromeDriver
			WebDriver driver = new ChromeDriver(options);
			
            driver.get("https://www.opencart.com/index.php?route=cms/demo");
			
			String act_title = driver.getTitle();
			
			if (act_title.equals("OpenCart - Demo"))
			{
				System.out.println("Test Passed");
			}
			else {
				System.out.println("Test Failed");
			}
			
		    //driver.quit();
		}

	}


