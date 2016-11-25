package validatingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListMultiSelect {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new FirefoxDriver();
		driver.get("file:///C:/Users/Sphurthi/Desktop/multiSelect.html");
		WebElement ss = driver.findElement(By.name("menu"));
		Select mlistelement = new Select(ss);
		List<WebElement> options = mlistelement.getOptions();
		int count = options.size();
		Thread.sleep(3000);
		for(int i=0;i<options.size();i++)
		{
			//mlistelement.selectByIndex(i);
			options.get(i).click();
			System.out.println(options.get(i).getText());
			
		}
		System.out.println("==================================");
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(options.get(i).getText());
		}
		Thread.sleep(3000);
		mlistelement.deselectAll();
		

	}

}
