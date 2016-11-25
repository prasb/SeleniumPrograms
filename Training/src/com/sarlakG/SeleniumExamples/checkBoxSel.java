package com.sarlakG.SeleniumExamples;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class checkBoxSel {

    public static void main(String[] args) {

         WebDriver driver = new FirefoxDriver();
         driver.manage().window().maximize();
         driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
         driver.findElement(By.id("text1")).sendKeys("My First Name");

         //Selecting value from drop down using visible text
         Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
         
         mydrpdwn.selectByVisibleText("Renault");

    }

}