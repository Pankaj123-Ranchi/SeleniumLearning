package selenium18ScreenshotsHeadlessSSLAdBlockExtensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		
		
		    //# Initialize ChromeOptions
		    ChromeOptions options = new ChromeOptions();
		    //# Add custom options
		    options.addArguments("--headless=new");//Setting for headless mode of execution
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
			
		    driver.quit();
		}

	}


