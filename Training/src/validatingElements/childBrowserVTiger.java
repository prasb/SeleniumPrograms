package validatingElements;

import net.sourceforge.htmlunit.corejs.javascript.ObjToIntMap.Iterator;
import java.lang.*;
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childBrowserVTiger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver(); //launch the browser
		driver.get("http://demo.vTiger.com");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Leer Licencia")).click();
		java.util.Iterator<java.lang.String> allwindowHandles = driver.getWindowHandles().iterator();
		System.out.println("Tilte:"+driver.getTitle());
		java.lang.String parent = allwindowHandles.next(); //getWindow handle of parent and print it  
		System.out.println("Parent :"+parent);
		
		java.lang.String child = allwindowHandles.next(); //getWindow handle of child and print it  
		System.out.println("child :"+child);
		
		driver.switchTo().window(child);// switch to child,close it
		System.out.println("In Child browser with Tilte:"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parent);// switch to parent,close it
		System.out.println("In Parent window with Tilte:"+driver.getTitle());
		System.out.println("num of handles"+driver.getWindowHandles().size());
		driver.close();
		System.out.println("num of handles"+driver.getWindowHandles().size());
	}
	

}
