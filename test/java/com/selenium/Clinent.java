package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clinent {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		
		// to launch the browser
				driver.get("https://www.facebook.com/");

				// to maxmize the browser
				driver.manage().window().maximize();

				// to print the page title
				String title = driver.getTitle();
				System.out.println("title -" + title);

				// to print the currentUrl
				String Url = driver.getCurrentUrl();
				System.out.println("Url -" + Url);

				// to send a value to username textbox
				WebElement user = driver.findElement(By.id("email"));

				// to send the value
				user.sendKeys("hello world");

				// to send the value to password box
				WebElement pass = driver.findElement(By.id("pass"));

				// to send the value
				pass.sendKeys("123");

				// to click the login button
				WebElement clickbtn = driver.findElement(By.name("login"));

				// to click the button
				clickbtn.click();

				// to close the entire browser
				driver.quit();
	}

}
