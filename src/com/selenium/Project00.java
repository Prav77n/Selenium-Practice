package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project00 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Praveen.DESKTOP-QUTBIB3\\eclipse-workspace\\Selenium_Practice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();

		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));

		email.sendKeys("gatsby007@gmail.com");

		driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();
		
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("//input[@name = 'customer_firstname']")).sendKeys("Praveen");

		driver.findElement(By.id("customer_lastname")).sendKeys("R");

		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("Praveen07");

	}

}
