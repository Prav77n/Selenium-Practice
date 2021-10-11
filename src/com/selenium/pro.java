package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Praveen.DESKTOP-QUTBIB3\\eclipse-workspace\\Selenium_Practice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("RockyBalbo@gmail.com");
		driver.findElement(By.xpath("(//button[@type= 'submit'])[2]")).click();
		Thread.sleep(3000);
		// driver.findElement(By.id("id_gender1")).click();

		driver.findElement(By.id("customer_firstname")).sendKeys("Rocky");

	}

}
