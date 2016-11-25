package com.sarlakG.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Xpath_Types {
	public static void main (String args[]){
WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.co.in");
		
		//By Xpath- Starts-with
		WebElement textbox=driver.findElement(By.xpath("//*[starts-with(@id,'lst')]"));
		
	   boolean displayed = textbox.isDisplayed();
	   boolean enabled = textbox.isEnabled();
	  

	   System.out.println("Is Element  Displayed "+ displayed);
	   System.out.println("Is Element Enabled "+enabled );
	 
	   
	   //By X-path contains
	   
	   WebElement contains=driver.findElement(By.xpath("//*[contains(@id,'st-ib')]"));
	   boolean contains_displayed = contains.isDisplayed();
	   boolean contains_enabled = contains.isEnabled();

	   System.out.println("Is Element  Displayed "+ contains_displayed);
	   System.out.println("Is Element Enabled "+contains_enabled );
	   
	 
	   //By Absolute Xpath
	   
	  // html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input[3]
			   
			  
	        driver.findElement(By.xpath("//input[@id ='lst-ib']")).sendKeys("SarlakG Technologies");
	        driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div/button")).click();
	        System.out.println("Finished clicking keys");

	   
	}

}
