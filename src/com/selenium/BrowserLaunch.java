package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen.DESKTOP-QUTBIB3\\eclipse-workspace\\Selenium_Practice\\Driver\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=hoJ4qxcXz5w&list=RDhoJ4qxcXz5w&start_radio=1");
	}

}
