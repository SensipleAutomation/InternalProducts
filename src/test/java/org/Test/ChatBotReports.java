package org.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChatBotReports extends BaseClass {

	@Test
	private void BotReports() throws InterruptedException, AWTException {
		browser("chrome");
		driver.get("https://tryviumteamsqa1.azurewebsites.net/adminconsole/Home/Dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("useremail")).sendKeys("admin@sensipleucx.com");
		driver.findElement(By.name("password")).sendKeys("Sensiple*2023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-star-inserted']")).click();
		Thread.sleep(6000);
		Actions Mousehover = new Actions(driver);
		WebElement menuoption = driver.findElement(By.xpath("(//*[@class='has-submenu'])[3]"));
		Mousehover.moveToElement(menuoption).perform();
		Thread.sleep(5000);
		WebElement Submenu = driver.findElement(By.xpath("(//*[@class='side-menu-icon'])[15]"));
		Submenu.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(@class,'box-title')])[2]")).click();
		driver.findElement(By.xpath("//*[text()='Global Service Desk (QA1)']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Choose Date Range']")).click();
		driver.findElement(By.xpath("//*[text()='Last 7 Days']")).click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=' Generate Report ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@title='Export'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Chat Sessions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose Date Range']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Last Month']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=' Generate Report ']")).click();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@title='Export'])[1]")).click();
		Thread.sleep(3000);
	}
}
