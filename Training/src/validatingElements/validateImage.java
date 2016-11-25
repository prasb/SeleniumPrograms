package validatingElements;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validateImage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver(); //launch the browser
		driver.get("http://sphurthi-pc/login.do");
		java.lang.String expt ="/img/default/logo.gif?hash=797058701";
		
		java.lang.String actualSrc = driver.findElement(By.xpath("//img[@src ='/img/default/logo.gif?hash=797058701']")).getAttribute("src");
		
		if(expt.equals(actualSrc))
		{
			System.out.println("Image is present"); 
		}
		System.out.println(actualSrc);
	}

}
