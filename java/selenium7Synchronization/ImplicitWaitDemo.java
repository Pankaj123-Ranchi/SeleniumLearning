package selenium7Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

     		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//Depricated
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			//Thread.sleep(3000);//pause the execution
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			driver.quit();
			
			

     		}
}


	


