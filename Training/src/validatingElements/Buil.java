package validatingElements;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.lang.*;
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Buil {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		java.lang.String baseUrl = "https://www.facebook.com/";
		WebDriver driver = new FirefoxDriver();
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2);
		WebElement txtusrnm = driver.findElement(By.id("email"));
		Actions builder = new Actions(driver);
		
		Action seriesOfAction = builder.
				moveToElement(txtusrnm)
				.sendKeys("hello").keyUp(Keys.SHIFT).doubleClick(txtusrnm).contextClick().build();			
		seriesOfAction.perform();
	
	}

}
