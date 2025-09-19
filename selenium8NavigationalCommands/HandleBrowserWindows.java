package selenium8NavigationalCommands;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String> windowIDs = driver.getWindowHandles();
        //Approach 1 for 2 0r 3 browser windows
        //Convert Set to List as Set cannot extract individual as Set Collection don't have get method as it donn't follow index
        /*List<String> windowList = new ArrayList<String>(windowIDs);
        String parentID = windowList.get(0);
        String childID=windowList.get(1);
        //switch to child window
        driver.switchTo().window(childID);
        System.out.println(driver.getTitle());
        //switch to parent window
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());*/
        //Approach 2 for multiple browser windows
        for (String winId:windowIDs) {//For Each Loop
        	
        String title = driver.switchTo().window(winId).getTitle();
        
        if(title.equals("OrangeHRM"))
        {
        	System.out.println(driver.getCurrentUrl());
        	//some validation on the parent window
        }
        
        }
	}

}
