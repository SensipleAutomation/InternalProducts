package org.Test;

import java.awt.AWTException;
import java.util.HashMap;
import java.util.Map;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TeamsWebhookTestNGExample.class)

public class Reease_2 extends BaseClass {

	@Test (priority = 1)
	private void AgentCreation_UserManagement() throws InterruptedException, AWTException {
		browser("firefox");
		getUrl("https://tryviumteamsqa.azurewebsites.net/adminconsole/Login");
		Thread.sleep(3000);
		Credentials();
	}

	@Test (dependsOnMethods = "AgentCreation_UserManagement")
	private void UserManagement() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='side-menu-icon'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='all-btns']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("FirstName")).sendKeys("Testing");
		driver.findElement(By.name("LastName")).sendKeys("Automation");
		driver.findElement(By.name("AgentEmailID")).sendKeys("Test123@gmail.com");
		Thread.sleep(3000);
		Select time = new Select(driver.findElement(By.xpath("//select[@id='top-header-select']")));
		time.selectByVisibleText("India Standard Time ");
		driver.findElement(By.xpath("(//*[@class='other-checkmark'])[1]")).click();
		Select chat = new Select(driver.findElement(By.xpath("//*[@id='Concurrency']")));
		chat.selectByVisibleText("3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='all-btns ng-star-inserted btn-disabled btn-enabled']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("search")).sendKeys("Test123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='ng-star-inserted'])[10]")).click();
		driver.findElement(By.xpath("//*[contains(@class,'p-button p-component ng-star-inserted')][2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(@class,'p-element p-ripple p-button')])[2]")).click();
		driver.findElement(By.xpath("(//*[@class='vipstyle'])[2]")).click();
	}

	@Test (dependsOnMethods = "UserManagement")
	private void userCreated() throws InterruptedException {

		driver.findElement(By.xpath("//*[@class='all-btns btn-disabled agenteditsave ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='treeview ng-star-inserted'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='side-menu-icon'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("search")).sendKeys("Test123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='action-icons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(@class,'p-button p-component ng-star-inserted')])[2]")).click();
		Thread.sleep(2000);
		Select cht = new Select(driver.findElement(By.xpath("//*[@class='userlist-filter']")));
		cht.selectByVisibleText("Inactive");
		Thread.sleep(2000);
		driver.findElement(By.name("search")).sendKeys("Test123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='p-element mar-left-5 cursor-pointer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@class,'delete-danger-btn')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='fa fa-power-off']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
