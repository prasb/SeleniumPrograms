package DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestGneric {
	
	public void dragAndDrop(String source_xpath, String destination_id) {
	
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
			driver.manage().window().maximize();
			Actions act = new Actions(driver);
			WebElement source1 = driver.findElement(By.xpath(source_xpath));
			WebElement target = driver.findElement(By.id(destination_id));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			act.dragAndDrop(source1, target).perform();
			// TODO Auto-generated method stub

		}
	
	public void callDragAndDrop() {
		
		dragAndDrop("//div[@id='block-1']/h1", "id");
		dragAndDrop("soruce2", "dest2");
		dragAndDrop("soruce3", "3");

	}

	}


