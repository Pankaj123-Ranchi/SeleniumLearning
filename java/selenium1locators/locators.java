package selenium1locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class locators {

	public static void main(String[] args) {
		//System.setProperty("Webdriver.chrome.driver",
				//"C:\\Users\\E026535\\Desktop\\SFA,TOS,JS,JV,BA\\Selenium WebDriver\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		String act_title = driver.getTitle();
		
		if (act_title.equals("OpenCart - Demo"))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		//driver.close();
		driver.quit();
	}

}