package selenium4xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		//Xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");
		//Xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("TShirts");
		//Xpath with 'and' operator
		//driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("TShirts");
		//Xpath with 'or' operator
		//driver.findElement(By.xpath("//input[@placeholder='Search' or @name='search']")).sendKeys("TShirts");
		//Xpath with Text()
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		/*boolean displaystatus = driver.findElement(By.xpath("//h3[text() = 'Featured']")).isDisplayed();
	    System.out.println (displaystatus);
		String value = driver.findElement(By.xpath("//h3[text() = 'Featured']")).getText();
		System.out.println(value);
		*/
		//Xpath with Contains
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
		//Xpath with Starts-With()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirts");
		//Chained Xpath--->Parent to Child 
		//boolean imagestatus = driver.findElement(By.xpath("div[@id='logo']/h1/a")).isDisplayed();
		//System.out.println("imagestatus");
		
		
	}

}
