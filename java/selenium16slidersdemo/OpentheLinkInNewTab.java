package selenium16slidersdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTab {

	public static void main(String[] args) {
		
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.nopcommerce.com/");
	 driver.manage().window().maximize();
	 
	 WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	 
	 //regLink.click();//On Same Page Registration Link will open
	 //Open Registration Link in new tab
	 
	 Actions act = new Actions(driver);
	 //Control + RegistrationLink
	 act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();//Two Tab opens but Focus is on 1st Page(Home)
	 
	 //Switching To Registration Page (2nd Page)
	 
	 List<String> ids = new ArrayList(driver.getWindowHandles());
	 //Convert Set to List using ArrayList to use "get" method to switch to 2nd Page
	 
	 //Registration Page
	 driver.switchTo().window(ids.get(1));//Switch to Registration Page
	 //Enter First Name
	 driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John KENDEY");
	 
	 //Home Page
	 driver.switchTo().window(ids.get(0));//Switch to Home Page
	 driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Tshirts");
	 
	}

}
