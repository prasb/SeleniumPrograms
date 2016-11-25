package validatingElements;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver(); //launch the browser
		driver.get("http://sphurthi-pc/login.do"); //launch the url
		
		System.out.println(driver.getTitle()); // get the title of page in run time
		
		System.out.println(driver.getCurrentUrl()); // get the current active url
		
		System.out.println(driver.getClass());  // get the current object classname
		
		
		System.out.println(driver.getPageSource()); // get the current active page source
		

	}

}
