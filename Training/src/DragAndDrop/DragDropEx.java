package DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropEx {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='block-1']/h1"));
		WebElement target = driver.findElement(By.id("column-2"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		act.dragAndDrop(source, target).perform();
		// TODO Auto-generated method stub

	}

}
