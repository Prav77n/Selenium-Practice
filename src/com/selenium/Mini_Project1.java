package com.selenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Praveen.DESKTOP-QUTBIB3\\eclipse-workspace\\Selenium_Practice\\Driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("JasonBourne@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("jbwebb11");
		driver.findElement(By.id("SubmitLogin")).click();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));

		js.executeScript("arguments[0].click();", dresses);

		WebElement ED = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));

		js.executeScript("arguments[0].click();", ED);

		WebElement quickview = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		js.executeScript("arguments[0].click();", quickview);

		WebElement quantity = driver.findElement(By.xpath("(//a[@href='#'])[3]"));

		for (int i = 0; i < 9; i++) {
			quantity.click();
		}

		WebElement size = driver.findElement(By.xpath("(//select[@name='group_1'])"));
		Select s = new Select(size);
		s.selectByVisibleText("M");

		driver.findElement(By.xpath("//a[@name='Pink']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File(
				"C:\\Users\\Praveen.DESKTOP-QUTBIB3\\eclipse-workspace\\Selenium_Practice\\Screenshots\\cart.png"));

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file1, new File(
				"C:\\Users\\Praveen.DESKTOP-QUTBIB3\\eclipse-workspace\\Selenium_Practice\\Screenshots\\order.png"));
	}

}
