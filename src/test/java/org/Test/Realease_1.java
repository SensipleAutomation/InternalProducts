package org.Test;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Realease_1 extends BaseClass {

	@Test (priority = 1)
	private void VisualIVR() throws InterruptedException {

		browser("chrome");
		getUrl("https://tryviumteamsqa.azurewebsites.net/adminconsole/Login");
		Thread.sleep(3000);
		Credentials();
		Thread.sleep(5000);

	}
	@Test  (priority = 2)
	private void BotManagement() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(@class, 'treeview')])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@Class='p-element fa fa-edit cursur-cl fa-edit-icon']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@Class='form-control input-text-13'])[19]")).click();
		Thread.sleep(4000);
		if (driver.findElement(By.xpath("(//*[@value='true'])[8]")).isDisplayed())
			driver.findElement(By.xpath("(//*[@value='false'])[8]")).click();
		Thread.sleep(4000);
		if (driver.findElement(By.xpath("(//*[@value='false'])[8]")).isDisplayed()) {
			driver.findElement(By.xpath("(//*[@value='true'])[8]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@Class='form-control input-text-13'])[20]")).click();
		}
	}
	@Test (priority = 3)
	private void funCheck() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@value='0'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@class='all-btns ng-star-inserted'])[1]")).click();
		Thread.sleep(4000);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@class='side-menu-icon'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@class='treeview ng-star-inserted'])[6]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@class='edit-user'])[5]")).click();
	}
	@Test (priority = 4)
	private void dragDrop() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Search by agents in group']")).sendKeys("AutomationAgent1");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement from = driver.findElement(
				By.xpath("(//*[@class='p-ripple p-element cdk-drag p-picklist-item ng-star-inserted'])[23]"));
		WebElement to = driver.findElement(
				By.xpath("(//*[@class='p-ripple p-element cdk-drag p-picklist-item ng-star-inserted'])[1]"));
		act.clickAndHold(from).moveToElement(to).release(to).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@placeholder='Search by agents in group']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@placeholder='Search by agents']")).sendKeys("AutomationAgent1");
		Thread.sleep(6000);
		WebElement from1 = driver.findElement(
				By.xpath("(//*[@class='p-ripple p-element cdk-drag p-picklist-item ng-star-inserted'])[1]"));
		WebElement to1 = driver
				.findElement(By.xpath("(//*[@class='cdk-drop-list p-picklist-list p-picklist-target'])"));
		act.clickAndHold(from1).moveToElement(to1).release(to1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='p-picklist-filter-input p-inputtext p-component'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@placeholder='Search by agents']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='all-btns mar-right ng-star-inserted'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='side-menu-icon'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='side-menu-icon'])[5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@class='new-queue-heading'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@id='tryvium_automationskillgroupsvisualivr_6941689758529694_anchor'])"))
				.click();
		Thread.sleep(5000);
		if (driver.findElement(By.xpath("(//*[@class='checkmark-radio'])[1]")).isSelected()) {
			System.out.println("Visual IVR Status is  Enabled");
		} else {
			driver.findElement(By.xpath("(//*[@class='checkmark-radio'])[1]")).click();
			driver.findElement(By.xpath("(//*[@class='all-btns btn-disabled mar-right editqueue'])[1]")).click();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='side-menu-icon'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='side-menu-icon'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='box-title'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@placeholder='Search'])")).sendKeys("AutomationAgent1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='edit-user'])")).click();
	}
	@Test (priority = 5)
	private void AgentbotStatusCheck() throws InterruptedException {

		Thread.sleep(3000);
		if (driver
				.findElement(
						By.xpath("(//*[@class='form-control input-text-13 ng-untouched ng-pristine ng-valid'])[1]"))
				.isDisplayed()) {
			System.out.println("Agent Routing bot1 is filled");
			if (driver
					.findElement(
							By.xpath("(//*[@class='form-control input-text-13 ng-untouched ng-pristine ng-valid'])[2]"))
					.isDisplayed()) {
				System.out.println("Agent Routing bot2 is filled");
				if (driver
						.findElement(By.xpath(
								"(//*[@class='form-control input-text-13 ng-untouched ng-pristine ng-valid'])[3]"))
						.isDisplayed()) {
					System.out.println("Agent Routing bot3 is filled");
					if (driver
							.findElement(By.xpath(
									"(//*[@class='form-control input-text-13 ng-untouched ng-pristine ng-valid'])[4]"))
							.isDisplayed()) {
						System.out.println("Agent Routing bot4 is filled");
					} else {
						System.out.println("Agent Routing bot4 is not filled");
					}
				} else {
					System.out.println("Agent Routing bot3 is not filled");
				}
			} else {
				System.out.println("Agent Routing bot2 is not filled");
			}
		} else {
			System.out.println("Agent Routing bot1 is not filled");
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@placeholder='Filter by name, email'])")).sendKeys("AutomationAgent2");
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[@class='smooth-scroll'])")).click();
	}
	@Test (priority = 6)
	private void Agent2botStatusCheck() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Checking for AutomationAgent2");
		if (driver
				.findElement(
						By.xpath("(//*[@class='form-control input-text-13 ng-untouched ng-pristine ng-valid'])[1]"))
				.isDisplayed()) {
			System.out.println("Agent Routing bot1 is filled");
			if (driver
					.findElement(
							By.xpath("(//*[@class='form-control input-text-13 ng-untouched ng-pristine ng-valid'])[2]"))
					.isDisplayed()) {
				System.out.println("Agent Routing bot2 is filled");
				if (driver
						.findElement(By.xpath(
								"(//*[@class='form-control input-text-13 ng-untouched ng-pristine ng-valid'])[3]"))
						.isDisplayed()) {
					System.out.println("Agent Routing bot3 is filled");
					if (driver
							.findElement(By.xpath(
									"(//*[@class='form-control input-text-13 ng-untouched ng-pristine ng-valid'])[4]"))
							.isDisplayed()) {
						System.out.println("Agent Routing bot4 is filled");
					} else {
						System.out.println("Agent Routing bot4 is not filled");
					}
				} else {
					System.out.println("Agent Routing bot3 is not filled");
				}
			} else {
				System.out.println("Agent Routing bot2 is not filled");
			}
		} else {
			System.out.println("Agent Routing bot1 is not filled");
		}
		Thread.sleep(4000);
	}
	@Test (priority = 7)
	private void logout() throws InterruptedException {

		driver.findElement(By.xpath("(//*[@class='ng-star-inserted'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='fa fa-power-off']")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
