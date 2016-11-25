package validatingElements;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import java.util.Iterator;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validateCalender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver(); //launch the browser
		driver.get("http://sphurthi-pc/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		java.lang.String parent =driver.getWindowHandle();
		System.out.println("Parent:"+driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Create new tasks')]")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Set<java.lang.String> handles = driver.getWindowHandles();
		java.util.Iterator<java.lang.String> itr = handles.iterator();
		System.out.println("Number of child Browsers"+handles.size());
		while(itr.hasNext())
		{
			java.lang.String w = itr.next();
			driver.switchTo().window(w);
			java.lang.String title =driver.getTitle();
			System.out.println(title);
				if(title.contains("actiTIME - Create New Tasks"))
				{
					
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
					driver.findElement(By.xpath(".//*[@id='ext-gen7']")).click();
					driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
					driver.findElement(By.xpath("//table[@id='ext-gen86']/tbody/tr[2]/td/table/tbody/tr[1]/td[6]/a")).click();
					driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
					java.lang.String dateSelected = driver.findElement(By.xpath("//input[@id='taskDeadline0']")).getAttribute("value");
					System.out.println("Date selected is :"+dateSelected);
					java.lang.String mainBrowser = driver.switchTo().window(parent).getTitle();
					//String mainBrowser = driver.switchTo().defaultContent().getTitle();
					System.out.println(mainBrowser);
					break;
			}
				
		}
		
	}

}
