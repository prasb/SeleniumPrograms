package validatingElements;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.actimind.com");
		driver.manage().window().maximize();
		
		java.lang.String xp ="//span[text()='About Company']";
		WebElement menu=driver.findElement(By.xpath(xp));
		Actions act = new Actions(driver);
		
		act.moveToElement(menu).perform();
		driver.findElement(By.linkText("Basic Facts")).sendKeys(Keys.ENTER);
		//act.doubleClick(menu).perform();
	}

}
