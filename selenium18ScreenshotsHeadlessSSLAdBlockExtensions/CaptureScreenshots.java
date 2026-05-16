package selenium18ScreenshotsHeadlessSSLAdBlockExtensions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1.)Full Page Screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		
		//1.)Captured the screenshot using "getScreenshotAs" method and stored in a variable "sourcefile" but we 
		//don't know the location of file.
		//2.)To get file in our location we create our own location (targetfile).
		//3.)Now copy source file into our targetfile location to see the screenshots
		//Why we didn't Create file object while capturing file?, Because "getScreenshotAs" return as File
		//type of variable.But when we create our own location we use new File beacuse File is a predefined 
		//class, need to create object to specify the path to store the file.
		//File targetfile = new File("C:\\Users\\E026535\\eclipse-workspace\\seleniumwebdriver\\screenshots\\fullpage.png");
		
		//To Capture Location Dynamically
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		//System.getProperty("user.dir") will return current user directory i.e. current project location
		//How to copy source file into target file?
		sourcefile.renameTo(targetfile);//Copy sourcefile to targetfile
		
		
		//2.)Capture the Screenshot of the Specific Section
		WebElement featuredProducts =
				driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
		File sourcefile1=featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile1 = new File(System.getProperty("user.dir")+"\\screenshots\\featuredproducts.png");
		sourcefile1.renameTo(targetfile1);
		
		//3.)Capture the screenshot of webelement
		WebElement logo =
		driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile2 = logo.getScreenshotAs(OutputType.FILE);
		File targetfile2 = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourcefile2.renameTo(targetfile2);
		
		driver.quit();
		//NOTE-->Difference between 1st and 2nd is that in 1st we calling "getScreenshotAs method" from "TakesScreenshot Interface"
		//While in 2nd we are calling "getScreenshotAs method" from "WebElement Interface"
		
	}

}
