package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus_website {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen.DESKTOP-QUTBIB3\\eclipse-workspace\\Selenium_Practice\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	WebElement opentab = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]"));
			opentab.findElements(By.tagName("a")).size();
			
	
	
}

}
