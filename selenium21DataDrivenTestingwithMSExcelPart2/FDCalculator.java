package selenium21DataDrivenTestingwithMSExcelPart2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		String filePath = System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
		
		int rows =ExcelUtils.getRowCount(filePath, "Sheet1");
		
		for(int i=1;i<=rows;i++) 
		{
			//Step 1.) Read data from excel
			String pric = ExcelUtils.getCellData(filePath, "Sheet1", i,0);
			String rateofinterest = ExcelUtils.getCellData(filePath, "Sheet1", i,1);
			String per1 = ExcelUtils.getCellData(filePath, "Sheet1", i,2);
			String per2 = ExcelUtils.getCellData(filePath, "Sheet1", i,3);
			String fre = ExcelUtils.getCellData(filePath, "Sheet1", i,4);
			String exp_mavlue = ExcelUtils.getCellData(filePath, "Sheet1", i,5);
			
			//Step 2.)Pass above data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			Select perdrp = new Select (driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fredrp.selectByVisibleText(fre);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();//Clicked on Calculate
			
			//Step 3.)Validation
			String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			//exp_mavlue and act_mvalue are in String format so convert into double format then compare
			if(Double.parseDouble(exp_mavlue) == Double.parseDouble(act_mvalue))  
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
				ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
			}
			else
			{
				System.out.println("Test failed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
				
			}
				
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();//Clicked on Clear Button
			
		}//Ending of for loop
		
		driver.quit();
	}

}
