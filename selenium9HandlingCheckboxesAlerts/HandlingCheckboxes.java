package selenium9HandlingCheckboxesAlerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	//1.Select Specific Checkbox
	//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
	//2.Select all the Checkboxes with common locator
	List<WebElement>checkboxes =driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
	/*for (int i=0; i<checkboxes.size();i++) {
		
		checkboxes.get(i).click();
	}*/
	
	/*for(WebElement checkbox:checkboxes) 
	{
		checkbox.click();
	}*/
	
	//3.Select Last 3 checkboxes
	//total no of checkboxes-how many checkboxes want to select from last = starting index
	//7-3=4 (starting index)
	/*for(int i=4;i<checkboxes.size();i++) {
		
		checkboxes.get(i).click();
	}*/
		
	//4.Select First 3 Checkboxes
	/*for(int i=0;i<3;i++) {
		
		checkboxes.get(i).click();
	}*/
	
	//Unselect checkboxes if they are selected
        for(int i=0;i<3;i++) {
		
		checkboxes.get(i).click();
		}
        Thread.sleep(5000);
        
        for(int i=0;i<checkboxes.size();i++) {
    		
    	if(checkboxes.get(i).isSelected())
    	{
    		checkboxes.get(i).click();
    	}
    	}
	}

}
