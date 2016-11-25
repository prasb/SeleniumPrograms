package validatingElements;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validateLink {

	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://sphurthi-pc/login.do");
		java.lang.String exptHref = "http://www.actimind.com/";
		java.util.List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on ActiTime Page is : "+allLinks.size());
		for (int i = 0; i < allLinks.size(); i++) {
			if(exptHref.equals(allLinks.get(i).getAttribute("href")))
					{
				System.out.println("link to this http://www.actimind.com/ url is present on the page " );
					}
					
		}

	}

}
