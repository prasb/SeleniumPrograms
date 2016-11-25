package validatingElements;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxSelected {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver(); //launch the browser
		driver.get("http://sphurthi-pc/login.do");
		
		driver.findElement(By.id("keepLoggedInLabel")).click();
		
		boolean selected = driver.findElement(By.id("keepLoggedInLabel")).isSelected();
		
		if(selected)
		{
			System.out.println("check box is selected");
		}
		else 
		{
			System.out.println("check box is not selected");
		}
	}

}
