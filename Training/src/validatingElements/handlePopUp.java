package validatingElements;

import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlePopUp {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver(); //launch the browser
		driver.get("http://sphurthi-pc/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/a/img[contains(@src,'pixel.gif?hash=797058701')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Projects & Customers')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    //driver.findElement(By.linkText("Projects & Customers")).click();
	    //driver.findElement(By.xpath("//input[@name='customers[2]']"));
	    driver.findElement(By.xpath("//input[@name='customers[2]']")).click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    //Delete Selected
	    driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
	    //driver.findElement(By.xpath(".//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[2]/td[6]/input")).click();
	    driver.findElement(By.xpath(".//*[@id='deleteButton']")).click();
	    
	}

}
