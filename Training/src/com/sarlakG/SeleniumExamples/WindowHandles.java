package com.sarlakG.SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class WindowHandles {

	public static void main (String args[]){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		
		String windowTitle= driver.getTitle();
		System.out.println(windowTitle);
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) {
			if (!currentWindowHandle.equals(mainWindow)) {
				driver.switchTo().window(currentWindowHandle);
				String windowTitle1= driver.getTitle();
				System.out.println(windowTitle1);
				driver.close();
			}
		}
		
	}
	
}
