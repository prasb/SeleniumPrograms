package validatingElements;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import net.sourceforge.htmlunit.corejs.javascript.ObjToIntMap.Iterator;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childBrowser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.naukri.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='AMDOCS']")).click();
		java.lang.String exp = "Amdocs Jobs - Jobs in Amdocs - Career in Amdocs - Job Openings in Amdocs";
		Set<java.lang.String> s = driver.getWindowHandles();
		System.out.println("Number of child browsers:"+s.size());
		java.util.Iterator<java.lang.String> i = s.iterator();
		
		while(i.hasNext()){
			
			java.lang.String w=i.next();
			driver.switchTo().window(w);
			java.lang.String Title = driver.getTitle();
			System.out.println("Title :"+Title);
			if(Title.equals(exp))
			{
				System.out.println(Title);
				//driver.quit();
				java.lang.String mainBrowser = driver.switchTo().defaultContent().getTitle();
				//driver.switchTo().defaultContent() to get back to the parent window 
				System.out.println(mainBrowser);
				break;
			}
		}

	}

}
