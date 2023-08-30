package org.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Tryvium extends BaseClass {

	@Test
	private void Customer_Agent_Login() throws InterruptedException, AWTException, IOException {
		browser("firefox");
		getUrl("https://tryviumteamsqa.azurewebsites.net/adminconsole/Login");
		Thread.sleep(3000);
		Map<String, String> loginCredentials = new HashMap<>();
		loginCredentials.put("username", "admin@sensipleucx.com");
		loginCredentials.put("password", "Sensiple*2023");
		Thread.sleep(5000);
		WebElement usernameField = driver.findElement(By.name("useremail"));
		WebElement passwordField = driver.findElement(By.name("password"));
		WebElement submitButton = driver.findElement(By.xpath("//*[text()='Login ']"));
		usernameField.sendKeys(loginCredentials.get("username"));
		passwordField.sendKeys(loginCredentials.get("password"));
		submitButton.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@Class='side-menu-icon'])[2]")).click();
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
		}
		driver.findElement(By.xpath("(//*[@Class='form-control input-text-13'])[20]")).click();
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
		driver.findElement(By.xpath("//img[@alt='dashboard']")).click();
		Thread.sleep(4000);
		WebDriver driver1 = driver.switchTo().newWindow(WindowType.TAB);
		String Teams1 = driver.getWindowHandle();
		driver.get("https://teams.microsoft.com/");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement mylink1 = wait1.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));
		mylink1.sendKeys("AutomationTestUser@lab.ontryvium.com");
		WebElement next = driver.findElement(By.id("idSIButton9"));
		next.click();
		Thread.sleep(2000);
		WebElement Pass = driver.findElement(By.id("i0118"));
		Pass.sendKeys("Lok64568");
		WebElement sign = driver.findElement(By.id("idSIButton9"));
		sign.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement mylink = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//button[@class='app-bar-link app-bar-button '])[2]")));
		mylink.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Dismiss']")).click();
		Thread.sleep(3000);

		Robot robot = new Robot();
		WebDriver newDriver = new FirefoxDriver();
		for (String winHandle : newDriver.getWindowHandles()) {
			newDriver.switchTo().window(winHandle);
			newDriver.get("https://teams.microsoft.com/");
			WebDriverWait wait2 = new WebDriverWait(newDriver, Duration.ofSeconds(40));
			WebElement mylink2 = wait2.until(ExpectedConditions.elementToBeClickable(By.id("i0116")));
			mylink2.sendKeys("AutomationTestAgent1@lab.ontryvium.com");
			WebElement next1 = newDriver.findElement(By.id("idSIButton9"));
			next1.click();
			Thread.sleep(2000);
			newDriver.findElement(By.id("i0118")).sendKeys("Gos85663");
			Thread.sleep(2000);
			newDriver.findElement(By.id("idSIButton9")).click();
			Thread.sleep(2000);
			newDriver.findElement(By.xpath("//input[@type='button']")).click();
			WebDriverWait wait3 = new WebDriverWait(newDriver, Duration.ofSeconds(35));
			WebElement mylink3 = wait3.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//button[@class='app-bar-link app-bar-button '])[2]")));
			mylink3.click();
			Thread.sleep(3000);
			newDriver.findElement(By.xpath("//button[@title='Dismiss']")).click();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ALT);
			Thread.sleep(3000);
			WebDriverWait frames = new WebDriverWait(driver, Duration.ofSeconds(90));

			WebElement chatFrame = frames.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("(//*[contains(@id, 'experience-container')])[2]")));

			driver.switchTo().frame(chatFrame);
			Thread.sleep(1000);

			WebElement chatInputField = driver.findElement(By.cssSelector("div[role='textbox']"));
			chatInputField.sendKeys("Hello");

			WebElement sendButton = driver.findElement(By.cssSelector("button[title='Send']"));
			sendButton.click();

			Thread.sleep(8000);

			WebElement accept = driver.findElement(By.xpath("(//*[contains(@class, 'fui-StyledText')])[2]"));
			accept.click();

			Thread.sleep(5000);

			WebElement qa = driver.findElement(By.xpath("(//button[contains(@class, 'carousel__paddle ')])[2]"));
			qa.click();
			Thread.sleep(1000);
			qa.click();
			Thread.sleep(1000);

			WebElement clicks = driver.findElement(By.xpath("(//*[contains(@class, 'fui-StyledText')])[5]"));
			clicks.click();

			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ALT);
			Thread.sleep(3000);
			WebDriverWait bot = new WebDriverWait(newDriver, Duration.ofSeconds(90));
			WebElement botsel = bot.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[contains(text(),'tryviumteamsqa- Agent App')]")));

			WebDriverWait framesAgent = new WebDriverWait(newDriver, Duration.ofSeconds(90));

			// Use the WebDriverWait to wait until the iframe is located using the provided
			// XPath
			WebElement chatFrameAgent = framesAgent.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("(//*[contains(@id, 'experience-container')])[2]")));

			// Now switch to the iframe
			newDriver.switchTo().frame(chatFrameAgent);

			WebDriverWait Acc = new WebDriverWait(newDriver, Duration.ofSeconds(90));

			// Wait for the first element to be visible
			WebElement firstElement = Acc.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Accept']")));

			// Check if the first element is visible
			if (firstElement.isDisplayed()) {
				// Click on the first element
				firstElement.click();
				Thread.sleep(3000);
				// Wait for the second element to be clickable
				WebElement secondElement = wait.until(ExpectedConditions
						.elementToBeClickable(By.xpath("(//*[contains(@class, 'fui-StyledText')])[1]")));

				// Click on the second element
				secondElement.click();
			} else {
				System.out.println("First element is not visible, cannot proceed.");
			}

		}
	}

}
