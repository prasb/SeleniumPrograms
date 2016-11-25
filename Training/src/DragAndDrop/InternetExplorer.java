package DragAndDrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		//Download the Internet Explorer driver executable file http://docs.seleniumhq.org/download/
		//IE Setting should be done  i.e go to tools->Internet options->make sure that all the security zones should be enable
		System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://google.co.in");

	}

}
