package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IESSLcertificateerrorhandling {

	 static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        //set the system property for IE 
      System.setProperty("webdriver.ie.driver", "D://IEDriverServer.exe");
       
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for them both to finish
        thread1.join();
        thread2.join();
      
        //close IE browser
        driver.quit();

    }
    
    
   public static void callIEBrowser() {
	   
	  // 	  driver.manage().window().maximize();  
	   WebDriver driver = new InternetExplorerDriver();
       // Go to desired Untrusted website
       driver.get("http://www.facebook.com");
	    /*  driver.findElement(By.xpath("//*[@name='email']")).sendKeys("balan.prasanna22.adfasdf");
	      driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("asdfasdf");*/
	   
	   
    	
    }
   
   
   
   static Thread thread1 = new Thread() {
	    public void run() {
	      //  driver.get("http://www.facebook.com");
	        callIEBrowser();
	    }
	};

	static Thread thread2 = new Thread() {
	    public void run() {
	      //  driver.get("http://www.facebook.com");
	        callIEBrowser();

	    }
	};
	
	
	 static Thread thread3 = new Thread() {
		    public void run() {
		      //  driver.get("http://www.facebook.com");
		        callIEBrowser();
		    }
		};

 }