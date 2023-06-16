package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver();
	
	//To launch the Browser
			driver.get("https://www.facebook.com/");
			
			//To maximise the Browser
			driver.manage().window().maximize();
			
			//To print the page Title
			//ctrl+2(@) press & release and then press '1'
			String title = driver.getTitle();
		    System.out.println("title - "+title);
			
		    //To print current URL  
		    String Url = driver.getCurrentUrl();
		    System.out.println("URl -"+Url);
		
		    //To send value to user name textbox 
		    //findElement()- to locate the webElement in the web page
		    WebElement user = driver.findElement(By.id("email"));
		    
		    //To send to value
		    user.sendKeys("hello world");
		    
		    //To send values to the password textbox
		    WebElement pass = driver.findElement(By.id("pass"));
		    pass.sendKeys("123");
		    
		    //To click the button
		    WebElement loginbtn = driver.findElement(By.name("login"));
		    loginbtn.click();
		    
		    //To close the entire button
		    driver.quit();

}
}