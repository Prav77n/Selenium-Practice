package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_handeing {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen.DESKTOP-QUTBIB3\\eclipse-workspace\\Selenium_Practice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		WebElement window = driver.findElement(By.xpath("//a[text()='click here']"));
		window.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String str : handles)
		{
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
			{
				
				String s = "The Internet";
				for (String str1 : handles)
				{
					if (driver.switchTo().window(str1).getTitle().equals(s)) {
						break;
					}
				}
			}
		
		}
	}
}
