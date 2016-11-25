package validatingElements;

import org.apache.xpath.operations.String;
//import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.*;
import java.lang.*;

public class CheckBoxCheck {

	// code to select all checkbox present on the webpage
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gsmarena.com/nokia-phones-1.php");
		Thread.sleep(10000); //Dead wait
		

		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		java.util.List<WebElement> allchkBox = driver.findElements(By.xpath("//input[@type='checkBox'];"));
		 
				
		for (int i = 0; i < allchkBox.size(); i++) {
			allchkBox.get(i).click();
		}
		
	}
	
}
