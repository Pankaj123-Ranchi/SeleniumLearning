package selenium18ScreenshotsHeadlessSSLAdBlockExtensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {
	
	public static void main(String[] args) {
		
		
		
		ChromeOptions handlingSSL = new ChromeOptions();
		handlingSSL.setAcceptInsecureCerts(true);//Accept SSL Certificates from WebPage
		
		WebDriver driver = new ChromeDriver(handlingSSL);
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println("Title of the page:" +driver.getTitle()); //Privacy Error
		                                                             //expired.badssl.com
		
		driver.quit();
		
		
		
	}

}
