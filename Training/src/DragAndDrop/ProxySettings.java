package DragAndDrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ProxySettings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.http", "10.20.30.40");
		profile.setPreference("network.proxy.http_port", 1234);
		WebDriver driver = new FirefoxDriver(profile);
	}

}
