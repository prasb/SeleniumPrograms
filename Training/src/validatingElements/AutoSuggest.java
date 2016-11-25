package validatingElements;


import java.util.*;
import java.lang.*;
import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver(); //launch the browser
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		java.lang.String expt = "selenium speakers";
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id = 'lst-ib']")).sendKeys("sele");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//b[contains(text(),'tutorial')]")).click();
		driver.close();
	}

}
