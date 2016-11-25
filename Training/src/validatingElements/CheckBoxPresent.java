package validatingElements;

import org.apache.xpath.operations.String;
//import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxPresent {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://sphurthi-pc/login.do");
		
		java.util.List<WebElement> allchkbox = driver.findElements(By.xpath("//input[@type='checkbox'];"));
		
		if (allchkbox.size() > 0) {
			
			System.out.println("Checkbox is present");
		}
		else
		{
			System.out.println("checkbox is not present");
		}
	}

}
