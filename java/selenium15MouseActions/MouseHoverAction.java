package selenium15MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement desktops= driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		//To achieve this we use Actions class in Selenium WebDriver.
		//Create object of an Actions Class by passing the WebDriver instance.
		//With the object of the Actions class, driver moves to the main menu and then to the sub menu and click on it.
		Actions act = new Actions(driver);
		//Mouse hover action
		//act.moveToElement(desktops).moveToElement(mac).click().build().perform();
		act.moveToElement(desktops).moveToElement(mac).click().perform();
		

	}

}
