package validatingElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTip {
	
	public static void main (String[] args){
		
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.fipkart.com/mobiles/pr?p[]=facets.price_range%");
		
		
	}

}
