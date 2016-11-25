package validatingElements;

import org.apache.xpath.operations.String;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver(); //launch the browser
		driver.get("http://sphurthi-pc/login.do");
		
		java.util.List<WebElement> allinputTag = driver.findElements(By.tagName("input"));
		System.out.println("Number of input tag elements are :"+allinputTag.size());
		
		for (int i = 0; i < allinputTag.size(); i++) {
			
			System.out.println(allinputTag.get(i).getAttribute("name"));
		}
		
		
	}

}
