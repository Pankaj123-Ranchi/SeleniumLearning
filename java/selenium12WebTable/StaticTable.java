package selenium12WebTable;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        //1.)Find Total Number of Rows in a Table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//Use when there is multiple webtables in webpage
        //int rows =driver.findElements(By.tagName("tr")).size();//Use when there is one single webtable in webpage
        System.out.println("Number of rows:"+ rows);//Output-->7
        
        //2.)Find Total Number of Columns in a Table
        int colms= driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();//multiple tables
        //int colms = driver.findElements(By.tagName("th")).size();
        System.out.println("Number of columns:"+colms);//Output--> 4//single table
        
        //3.)Read data from specific row and column (ex: 5th row and 1st Column)
        String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println(bookName);//Master In Selenium
        
        String bookSubject = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
        System.out.println(bookSubject );//Javascript
        
        //4.)Read Data from all rows and columns, use nested for loop
        
        System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
        for(int r=2;r<=rows;r++) {  //Loop for rows;Since Actual data starts from row no 2 so r=2, 1st row is header having <th> tag
        	
        	for(int c=1;c<=colms;c++) //Loop for column
        	{
        	//driver.findElement(By.xpath("//table[@name='BookTable']//tr[r]//td[c]")).getText();
        	//We cannot pass variable/String inside x path only index no we can pass
        	//To pass variable use syntax "+variable+",i.e. keep variable in double quote and add + before and after variable
        		String value=
        		driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
        		
        		System.out.print(value+"\t");
        	}
        	
        	    System.out.println();
        }
        
        //5.)Print book names whose author is Mukesh
        
        for(int r=2;r<=rows;r++) 
        {
          String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
          //System.out.println(autherName);
          
          if(authorName.equals("Mukesh"))
          {
        	 String booksName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
        	 System.out.println(booksName+"\t"+authorName);
          }
          
        }
        
        //6.)Find total price of all the books
        
        int total=0;
        for(int r=2;r<=rows;r++) 
        {
          String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
          //getText() method returns string as a result so convert price into integer format for sum calculation
          
          total = total+Integer.parseInt(price);
          System.out.println(price);
          
         }
        System.out.println("Total Price of the Books:"+ total);
        
        
        
	}
     
}
