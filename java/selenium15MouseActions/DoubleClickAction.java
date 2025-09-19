package selenium15MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		//Switch to Frame
		driver.switchTo().frame("iframeResult");
		
		WebElement box1 =driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 =driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button =driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();//Clears box1
		box1.sendKeys("WELCOME");
		
		//Double click action on the button
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		
		//validation : box2 should contains "WELCOME"
		//Get the value of the given property of the element. Will return the current value,
		//even if this has been modified after the page has been loaded. 
		//Returns:
		//The property's current value or null if the value is not set.
		String text = box2.getDomProperty("value");
	    System.out.println("captured value is:" + text);
		
		if(text.equals("WELCOME"))
			
		{
		System.out.println("Text Copied...");
		}
		else
		{
		System.out.println("Text NOT Copied Properly...");
		}

 }
	
}
