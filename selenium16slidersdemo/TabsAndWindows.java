package selenium16slidersdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.opencart.com/");
		 
		 //From Selenium4.x versions
		 //driver.switchTo().newWindow(WindowType.TAB);//opens new tab
		 
		 driver.switchTo().newWindow(WindowType.WINDOW);//opens new window
		 
		 driver.get("https://www.orangehrm.com/");
		 driver.manage().window().maximize();
		 

	}

}
