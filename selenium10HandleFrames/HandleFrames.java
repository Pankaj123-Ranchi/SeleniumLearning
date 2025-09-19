package selenium10HandleFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        
        //Frame1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);//passed frame as Webelement, switched to frame 1
        //driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_1.html']")));//passed frame as Webelement, switched to frame 1
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
        
        driver.switchTo().defaultContent();//go back to main page
        
        //Frame2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);//passed frame as Webelement, switched to frame 2
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
        
        driver.switchTo().defaultContent();//go back to main page
        
        //Frame3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);//passed frame as Webelement, switched to frame 3
        
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
        
        //Interacting with inner iframe--which is part of frame3
        
        driver.switchTo().frame(0); //switching to frame using index
        
        //driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
        //If Not able to interact with element Use JavascriptExecutor
        WebElement rdbutton = driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
        JavascriptExecutor js =  (JavascriptExecutor)driver;//TypeCasting
        js.executeScript("arguments[0].click();",rdbutton);
        
        driver.switchTo().defaultContent();//go back to main page
        
	}

} 
