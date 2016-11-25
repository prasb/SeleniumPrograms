package validatingElements;

import org.apache.xpath.operations.String;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class ScreenShot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		try{
			
			//step 1: take screenshot and save it in a file and
			//get screenshot using getScreenShotAs,which returns FILE TYPE image
			
			EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
			java.io.File srcImg = edriver.getScreenshotAs(OutputType.FILE);
			System.out.println(srcImg);
			
			//step-2 : Now you can do whatever you need to do with it , for example
			java.io.File dstImg = new java.io.File("D:\\selenium_screenshots\\Screenshot.png");
			//File dstImg = new File("D:\\selenium_screenshots\\Screenshot.png");
			org.apache.commons.io.FileUtils.copyFile(srcImg, dstImg);
			
		}catch(Exception e){
			//step 3:if it fails to take screenshot then this block will execute
			System.out.println("Failure to take screenshot"+e);
		}
		finally{
			//whatever happens with the screenshot, driver will quit
			
			driver.quit();
		}
	}

}
