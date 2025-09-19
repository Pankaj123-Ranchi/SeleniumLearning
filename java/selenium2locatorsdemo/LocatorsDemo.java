package selenium2locatorsdemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//boolean logoDisplayedstatus = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayedstatus);
		
		//linktext and partialLinkText
		
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Tab")).click();
		
		//Classname
		//List<WebElement> tabLinks = driver.findElements(By.className("dropdown"));
		//System.out.println("total no of tab links:" + tabLinks.size());
		
		//tagname
		//List<WebElement>links = driver.findElements(By.tagName("a"));
		//System.out.println("Total No of Links:"+ links.size());
		
		List<WebElement>images = driver.findElements(By.tagName("img"));
		System.out.println("Total no of images:"+ images.size());
	}

}
