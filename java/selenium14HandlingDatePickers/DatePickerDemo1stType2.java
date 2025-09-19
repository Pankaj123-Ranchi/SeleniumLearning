package selenium14HandlingDatePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1stType2 {
	
	
	static void selectMonthAndYear(WebDriver driver,String month,String year)
	{
		//Select Month & Year
        while(true) 
        {
        	
        String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//Actual Month from Application 
        String currentYear =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//Actual Year from Application 
         
        if(currentMonth.equals(month) && currentYear.equals(year) )
          {
          break;//Exit from While Loop
          }
        
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next >> button click
        //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//Prevoius << button click
        
        }
        
     }
	
	static void selectDate(WebDriver driver,String date)
	{
       //Select the Date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        
        for(WebElement dt:allDates) 
        {
        	if(dt.getText().equals(date)) 
        	{
        	    dt.click();
        		break;
        	}
		
	    }
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        
        //Switch to frame
        driver.switchTo().frame(0);
        
        //Method1: Using sendkeys()
        //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/11/2025");//mm/dd/yyyy
        
        //Method2:Using date picker element
        //Expected Data
        String year = "2026";//Any type of application input boxes or any data into application 
                            //everything in string format so taking string here 
        String month = "April";
        String date = "20";
        
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        
        selectMonthAndYear(driver,month,year);
        selectDate(driver,date);
        
        }

     }
	
