package selenium14HandlingDatePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2ndType {
	
	
	static void selectDate(WebDriver driver,String requiredYear, String requiredMonth, String requiredDate) 
	{
		//select year
        WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByVisibleText(requiredYear);
        
        //driver.findElement(By.xpath("//input[@id='txtDate']")).click();
        //select month
        WebElement monthDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select selectMonth = new Select(monthDropDown);
        selectMonth.selectByVisibleText(requiredMonth);
        
        //date selection 
        
        List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        
        for(WebElement dt:allDates) 
        {
        	if(dt.getText().equals(requiredDate))
        	{
        		dt.click();
        		break;
        	}
        }
        
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        
        //input DOB
        String requiredYear = "2021";
        String requiredMonth ="Nov";
        String requiredDate ="25";
        
        driver.findElement(By.xpath("//input[@id='txtDate']")).click();
        
        selectDate(driver,requiredYear,requiredMonth,requiredDate);
        
  }
}