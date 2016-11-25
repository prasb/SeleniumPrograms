package validatingElements;

import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validateTextbox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver(); //launch the browser
		driver.get("http://sphurthi-pc/login.do");
		java.lang.String userName = "admin";
		java.lang.String custDesc = "New Customer for actiTime application";
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		java.lang.String text = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		if(text.equals(userName))
		{
			System.out.println("Entered username 'admin' is present in the text box");
		}
		else 
		{
			System.out.println("Entered username 'admin' is not present in the text box");
		}
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("img.sizer")).click();
		driver.findElement(By.xpath("//img[@src ='/img/default/pixel.gif?hash=797058701']")).click();
		driver.findElement(By.xpath("//div[text() ='Tasks']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Projects & Customers")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("Sphurthi");
	    
	    driver.findElement(By.name("description")).sendKeys(custDesc);
	    
	    
		/*driver.findElement(By.xpath("//img[@src ='/img/default/pixel.gif?hash=797058701']")).click();
		driver.findElement(By.xpath("//div[text() ='Tasks']")).click();
		driver.findElement(By.xpath("//a[text() ='Projects & Customers']")).click();
		
		driver.findElement(By.xpath("//input[@value ='Create New Customer']")).click();
		driver.findElement(By.xpath("//textarea[@name ='description']")).sendKeys(custDesc); */
	    
		java.lang.String textArea = driver.findElement(By.xpath("//textarea[@name ='description']")).getAttribute("value");
		if(text.equals(userName))
		{
			System.out.println("Entered text in the text area is present" );
		}
		else 
		{
			System.out.println("Entered text in the text area is present");
		}
		
	}

}
