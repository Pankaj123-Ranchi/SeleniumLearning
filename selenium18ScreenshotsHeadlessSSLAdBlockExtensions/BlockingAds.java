package selenium18ScreenshotsHeadlessSSLAdBlockExtensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockingAds {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//File file = new File("C:\\Users\\E026535\\Downloads\\uBlock-Chrome-Web-Store.crx");
		//options.addExtensions(file);
		options.addArguments("--load-extension= C:\\Users\\E026535\\Downloads\\uBlock-Chrome-Web-Store");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://text-compare.com/");

	}

}
