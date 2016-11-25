package validatingElements;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validateSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver(); //launch the browser
		driver.get("http://sphurthi-pc/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.cssSelector("a.content.administration > img.sizer")).click();
		java.util.List<WebElement> allSelect = driver.findElements(By.tagName("select"));
		System.out.println("Number of select menu on ActiTime settings Page is : "+allSelect.size());
		for (int i = 0; i < allSelect.size(); i++) {
			if("multiple" == (allSelect.get(i).getAttribute("multiple")))
					{
				System.out.println("Muti select is present " );
					}
					
		}

	}

}
