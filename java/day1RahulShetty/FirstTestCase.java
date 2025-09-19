package day1RahulShetty;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {


	//1.)Launch browser (chrome)
		
		//WebDriver driver = new ChromeDriver();
		
	//2.)Open URL 
		
	//driver.get("https://www.opencart.com/");
		
		
		String a = "hello";
		String b = "hello";
		String s = new String ("hello");
		String s1 = new String ("hello");
		
		System.out.println(a.equals(b));//true
		System.out.println(a==b);//true
		System.out.println(a.equalsIgnoreCase(s));//true
		System.out.println(a==s);//false
		System.out.println(s==s1);//false
		
	}

}
