package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Praveen.DESKTOP-QUTBIB3\\eclipse-workspace\\Selenium_Practice\\Driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("JasonBourne@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();

		Thread.sleep(3000);

		WebElement radio1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radio1.click();
		System.out.println(radio1.isSelected());
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Jason");
		driver.findElement(By.id("customer_lastname")).sendKeys("Bourne");
		driver.findElement(By.id("passwd")).sendKeys("jbwebb11");

		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		Select s = new Select(days);
		s.selectByValue("13");

		WebElement months = driver.findElement(By.id("months"));
		Select s1 = new Select(months);
		s1.selectByValue("9");

		WebElement years = driver.findElement(By.xpath("//select[@name='years']"));
		Select s2 = new Select(years);
		s2.selectByValue("1970");

		driver.findElement(By.id("company")).sendKeys("Blackbriar");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("11/2 hawk street");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("nixa");
		driver.findElement(By.id("city")).sendKeys("chennai");

		WebElement state = driver.findElement(By.id("id_state"));
		Select s3 = new Select(state);
		s3.selectByVisibleText("Missouri");

		driver.findElement(By.id("postcode")).sendKeys("63108");

		WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
		Select s4 = new Select(country);
		s4.selectByVisibleText("United States");

		driver.findElement(By.id("phone_mobile")).sendKeys("4746846147");
		driver.findElement(By.id("alias")).sendKeys("David Webb");

		driver.findElement(By.id("submitAccount")).click();
	}

}
