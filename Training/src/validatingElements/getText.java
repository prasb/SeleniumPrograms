package validatingElements;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.lang.String headertext = "One account. All of Google.";
		WebDriver driver= new FirefoxDriver(); //launch the browser
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
	
		java.lang.String text = driver.findElement(By.tagName("h1")).getText();
		
		if(headertext.equals(text)){
			System.out.println("'One account. All of Google.' text is present on the page");
			
		}
		else
		{
			System.out.println("'One account. All of Google.' text is not present on the page");
		}
		
		

	}

}
