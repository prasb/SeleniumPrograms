package validatingElements;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginNeg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.lang.String expctErrorMessage = "Username or Password is invalid. Please try again.";
		WebDriver driver= new FirefoxDriver(); //launch the browser
		driver.get("http://sphurthi-pc/login.do");
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		java.lang.String actualErrorMsg = driver.findElement(By.xpath(".//span[contains (text() , 'Username or Password is invalid.')]")).getText();
		
		if(expctErrorMessage.equals(actualErrorMsg)){
			System.out.println("Username or Password is invalid. Please try again.");
		}
		else
		{
			System.out.println(actualErrorMsg);
		}
	}

}
