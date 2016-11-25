package DragAndDrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Firefoxuntrustconnection {

    public static void main(String[] args) throws InterruptedException {

        // Create Firefox Profile
        FirefoxProfile profile = new FirefoxProfile();
        // Accept Untrusted Certificates
        profile.setAcceptUntrustedCertificates(true);
        //Intialize Forfox driver
        WebDriver driver = new FirefoxDriver(profile);
        //Maximize browser window       
        driver.manage().window().maximize();
        // Go to desired Untrusted website
        driver.get("http://www.google.com");
        Thread.sleep(5000);
        //close Firefox browser
        driver.quit();
    }

}