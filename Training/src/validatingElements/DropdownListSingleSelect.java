package validatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new FirefoxDriver();
		driver.get("file:///C:/Users/Sphurthi/Desktop/samlpe.html");
		WebElement ss = driver.findElement(By.name("menu"));
		Select selement = new Select(ss);
		selement.selectByIndex(1);
		Thread.sleep(3000);
		selement.selectByValue("3");
		Thread.sleep(3000);
		selement.selectByVisibleText("Dosa");
		Thread.sleep(3000);
		selement.deselectByIndex(0);
		

	}

}
