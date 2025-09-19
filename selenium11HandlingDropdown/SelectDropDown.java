package selenium11HandlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
		
        WebElement drpCountryElement = driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCountry = new Select(drpCountryElement);
        
        //select option from drop down
        //drpCountry.selectByVisibleText("France");
        //drpCountry.selectByValue("japan");
        //drpCountry.selectByIndex(2);
        
        //Capture Options From the Dropdown
        
       List<WebElement>options = drpCountry.getOptions();
       System.out.println("Number of options in a drop down:"+ options.size());
       
       //Printing the Options using for Loop
       
       for (int i=0;i<options.size();i++)
       {
    	   System.out.println(options.get(i).getText());
       }
       
     //Printing the Options using enhanced for Loop
       for(WebElement op:options)
       
       {
    	   System.out.println(op.getText());
       }
       
       
	   }

}
