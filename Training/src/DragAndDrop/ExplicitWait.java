package DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main (String args[]) {
		WebDriver driver = new FirefoxDriver();
	    String baseUrl = "http://www.wikipedia.org/";
	    
	    driver.get(baseUrl);
	   // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    
	   // boolean x = ExpectedConditions.visibilityOfElementLocated(By.id("searchInput"));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchInput")));

	    
	    driver.findElement(By.id("searchInput")).clear();     
	    driver.findElement(By.id("searchInput")).sendKeys("India");

	   // driver.findElement(By.id("searchButton")).click();
	}
}
