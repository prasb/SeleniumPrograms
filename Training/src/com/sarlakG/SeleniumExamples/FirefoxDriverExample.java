package com.sarlakG.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverExample {
	
	//WebDriver driver = new FirefoxDriver();
	
	public static void main (String args[]){
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.co.in");
		
		//By Xpath
		WebElement textbox=driver.findElement(By.xpath("//*[@id='lst-ib']"));
	   boolean displayed = textbox.isDisplayed();
	   boolean enabled = textbox.isEnabled();

	   System.out.println("Is Element  Displayed "+ displayed);
	   System.out.println("Is Element Enabled "+enabled );
	   
	   //by name
		WebElement name=driver.findElement(By.name("q"));
		name.clear();
		name.sendKeys("Using Name");
		
		  boolean displayed_name = textbox.isDisplayed();
		   boolean enabled_name = textbox.isEnabled();
		   
		   System.out.println("Is Element  Displayed "+ displayed_name);
		   System.out.println("Is Element Enabled "+enabled_name ); 
		
		
		   //by id 
			WebElement id=driver.findElement(By.id("lst-ib"));
			id.clear();
			id.sendKeys("Using id");
			
			  boolean displayed_id = textbox.isDisplayed();
			   boolean enabled_id = textbox.isEnabled();
			   
			   System.out.println("Is Element  Displayed "+ displayed_id);
			   System.out.println("Is Element Enabled "+enabled_id); 
			
			
			 //by class
				WebElement cls=driver.findElement(By.className("gsfi"));
				cls.clear();
				cls.sendKeys("Using class");
				
				  boolean displayed_cls = cls.isDisplayed();
				   boolean enabled_Cls = cls.isEnabled();
				   
				   System.out.println("Is Element  Displayed "+ displayed_cls);
				   System.out.println("Is Element Enabled "+enabled_Cls); 
		
				   
				   
		//by css
				   
				   WebElement cs=driver.findElement(By.className("gsfi"));
					cls.clear();
					cls.sendKeys("Using class");
		
		//driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).

		
		
	}

}
