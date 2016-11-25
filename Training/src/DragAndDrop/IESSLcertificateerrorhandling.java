package DragAndDrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IESSLcertificateerrorhandling {

    public static void main(String[] args) throws InterruptedException {

        //set the system property for IE 
      System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
        //create IE instance
        WebDriver driver = new InternetExplorerDriver();
        // Go to desired Untrusted website
        driver.get("http://www.google.com");
        //Maximize browser window       
        driver.manage().window().maximize();
        driver.navigate().to("javascript:document.getElementById('overridelink').click()");

        Thread.sleep(5000);
        //close IE browser
        driver.quit();

    }
}