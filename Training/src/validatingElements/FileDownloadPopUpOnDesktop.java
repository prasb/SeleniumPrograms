package validatingElements;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import java.lang.*;
import java.util.concurrent.TimeUnit;
public class FileDownloadPopUpOnDesktop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxProfile profile =new FirefoxProfile();
		
		java.lang.String Key ="browser.helperApps.neverAsk.saveToDisk";
		java.lang.String Value = "application/zip";
		
		//Disk location on Desktop[0]
		profile.setPreference("browser.download.folderList", "C://Users/Sphurthi/Downloads");
		
		//open Firefox with above profile setting
		WebDriver driver = new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://docs.seleniumhq.org/download/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		java.lang.String xp ="//td[text()='Java']/../td[4]/a";
		driver.findElement(By.xpath(xp)).click();
	}

}
