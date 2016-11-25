package DragAndDrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeSSLcertificateerrorhandling {

    public static void main(String[] args) throws InterruptedException {
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        // Accept SSL certificate 
      capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        //set the system property for Chrome 
      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //create Google Chrome instance
        WebDriver driver = new ChromeDriver(capability);
         //Maximize browser window       
        driver.manage().window().maximize();  
       // Go to desired Untrusted website  
        driver.get("http://www.google.com");        
        Thread.sleep(5000);
        //close Chrome browser 
        driver.quit();
    }

}