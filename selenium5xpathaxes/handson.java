package selenium5xpathaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handson {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		
		
		//1) Find the sign-up button from the registration form present in the Facebook application. (child)
		String text = driver.findElement(By.xpath("//div[@id='reg_form_box']//child::div[11]/button")).getText();
		System.out.println(text);
		
		//2) Locate Firstname field from SignUp button in facebook (Parent)
		driver.findElement(By.xpath("//button[@id='u_0_n_0/']/parent::*/parent::*/child::div[1]/div/div[1]")).sendKeys("Pankaj");
		//button[@id='u_0_13']//parent::*/parent::*/child::div[1]/div[1]/div[2]
		//button[@id='u_0_13']//ancestor::div[2]/child::div[1]/div[1]/div[2]

		//3) Identify the Password from Mobile number filed in facebook.(Following)
		
		driver.findElement(By.xpath("//input[@id='u_0_r']/following::input[2]")).sendKeys("Pankaj");
		
		//4) Locate Mobile number from newpassword field in facebook (preceding)
		//input[@id='password_step_input']/preceding::input[2]
		
		//5) Locate surname from female radio button in facebook(Ancestor)
		//input[@id='u_0_6']/ancestor::div[2]/div[1]/div[1]/div[2]
		//input[@id='u_0_6']/ancestor::div[2]//input[@id='u_0_o']
		
		//6) Identify the search text box from the Google search button present in the Google search home page. (Parent)
		//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']/parent::*/parent::*/parent::*/div[1]


		//7) Identify the Today’s Deals link from the amazon search text box present in the amazon home page.(Following)
		//input[@id='twotabsearchtextbox']/following::a[contains(text(),'Best Sellers')]

		//8) Identify the Hello, Signin from the amazon search text box present in the amazon home page. (Following)
		//input[@id='twotabsearchtextbox']/following::span[contains(text(),'Hello, Sign in')]

		//9) Identify Mobiles link which is part of Menu bar - Amazon  (Descendant)
		//div[@id='nav-xshop']/descendant::a[1]
		//div[@id='nav-xshop']/descendant::a[contains(text(),'Mobiles')]

	
	}
	
		

		
		

		

}
