package org.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.netty.handler.timeout.TimeoutException;

public class TryviumDemo extends BaseClass {

	@Test
	private void Dummy() throws InterruptedException, AWTException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://teams.microsoft.com/");

		try {
			// Wait for email input to be visible
			WebDriverWait mailWait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement mail = mailWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116")));
			mail.sendKeys("AutomationTestUser@lab.ontryvium.com");

			// Wait for next button and click
			WebElement next = driver.findElement(By.id("idSIButton9"));
			next.click();

			// Wait for password input and enter password
			WebDriverWait passWait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement Pass = passWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0118")));
			Pass.sendKeys("Lok64569");

			// Wait for sign-in button and click
			WebElement sign = driver.findElement(By.id("idSIButton9"));
			sign.click();

			// Wait for the input button and click
			WebDriverWait inputButtonWait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement inputButton = inputButtonWait
					.until(ExpectedConditions.elementToBeClickable(By.id("idBtn_Back")));
			inputButton.click();

			// Wait for the first app bar link button and click
			WebDriverWait appLinkWait = new WebDriverWait(driver, Duration.ofSeconds(100));
			WebElement mylink = appLinkWait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//button[@class='app-bar-link app-bar-button '])[2]")));
			mylink.click();

			// Wait for dismiss button and click
			WebDriverWait dismissWait = new WebDriverWait(driver, Duration.ofSeconds(100));
			WebElement dismissButton = dismissWait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='text'])[2]")));
			dismissButton.click();

			WebDriver newDriver = new FirefoxDriver();
			newDriver.get("https://teams.microsoft.com/");

			// Wait for email input for the new driver and enter email
			WebDriverWait newMailWait = new WebDriverWait(newDriver, Duration.ofSeconds(20));
			WebElement mylink2 = newMailWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116")));
			mylink2.sendKeys("AutomationTestAgent1@lab.ontryvium.com");

			// Wait for next button and click for the new driver
			WebElement next1 = newDriver.findElement(By.id("idSIButton9"));
			next1.click();

			// Wait for password input and enter password for the new driver
			WebDriverWait newPassWait = new WebDriverWait(newDriver, Duration.ofSeconds(20));
			WebElement newPass = newPassWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0118")));
			newPass.sendKeys("Gos85664");

			// Wait for sign-in button and click for the new driver
			WebElement newSign = newDriver.findElement(By.id("idSIButton9"));
			newSign.click();

			// Wait for the input button and click for the new driver
			WebDriverWait newInputButtonWait = new WebDriverWait(newDriver, Duration.ofSeconds(20));
			WebElement newInputButton = newInputButtonWait
					.until(ExpectedConditions.elementToBeClickable(By.id("idBtn_Back")));
			newInputButton.click();

			// Wait for the second app bar link button and click for the new driver
			WebDriverWait newAppLinkWait = new WebDriverWait(newDriver, Duration.ofSeconds(100));
			WebElement mylink3 = newAppLinkWait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//button[@class='app-bar-link app-bar-button '])[2]")));
			mylink3.click();

			// Wait for dismiss button and click for the new driver
			WebDriverWait newDismissWait = new WebDriverWait(newDriver, Duration.ofSeconds(100));
			WebElement newDismissButton = newDismissWait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='text'])[2]")));
			newDismissButton.click();
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ALT);
			WebDriverWait frames = new WebDriverWait(driver, Duration.ofSeconds(90));

			WebElement chatFrame = frames.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("(//*[contains(@id, 'experience-container')])[2]")));

			driver.switchTo().frame(chatFrame);
			Thread.sleep(1000);

			WebElement chatInputField = driver.findElement(By.cssSelector("div[role='textbox']"));
			chatInputField.sendKeys("Hello");

			WebElement sendButton = driver.findElement(By.cssSelector("button[title='Send']"));
			sendButton.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement accept = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//*[contains(@class, 'fui-StyledText')])[2]")));
			accept.click();
			if (accept.isEnabled()) {
				System.out.println("***********Record Chat Transcript was successfully clicked.**********");
			} else {
				System.out.println("****************Record Chat Transcript could not be clicked.***********");
			}

			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement qa = wait2.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//button[contains(@class, 'carousel__paddle ')])[2]")));
			qa.click();
			Thread.sleep(1000);
			qa.click();
			Thread.sleep(2000);

			WebElement element = driver.findElement(By.xpath("(//*[contains(@class, 'fui-StyledText')])[5]"));
			if (element.isDisplayed() && element.isEnabled()) {
				element.click();
				System.out.println("**************AutomationSkillgroup Selected***************************");
			} else {
				System.out.println("*************************AutomationSkillgroup Not Selected*********************");
			}
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ALT);
			WebDriverWait bot = new WebDriverWait(newDriver, Duration.ofSeconds(90));
			WebElement botsel = bot.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[contains(text(),'tryviumteamsqa- Agent App')]")));

			WebDriverWait framesAgent = new WebDriverWait(newDriver, Duration.ofSeconds(90));

			WebElement chatFrameAgent = framesAgent.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("(//*[contains(@id, 'experience-container')])[2]")));

			newDriver.switchTo().frame(chatFrameAgent);

			WebDriverWait acp = new WebDriverWait(newDriver, Duration.ofSeconds(30));
			WebElement but = acp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//span[starts-with(text(),'Hello,you have a service request from')]/following::button[1]")));
			but.click();

			if (but.isDisplayed()) {
				System.out.println("****************Agent Accepted the invite*********************");
			} else {
				System.out.println("****************Agent Unable to Accept the invite*********************");
			}
			Thread.sleep(3000);
			WebDriverWait wait3 = new WebDriverWait(newDriver, Duration.ofSeconds(20));
			try {
				WebElement AgentTab = wait3.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("(//span[starts-with(text(),'Show Customer Profile')]/following::button[1])[2]")));
				AgentTab.click();
				System.out.println("****************Agent Tab Opened*********************");
			} catch (TimeoutException e) {
				System.out.println("****************Unable to find or click Agent Tab*********************");
			}
			Thread.sleep(1000);
			newDriver.switchTo().defaultContent();

			WebDriverWait fra = new WebDriverWait(newDriver, Duration.ofSeconds(90));

			WebElement chatFra = fra.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//iframe[contains(@src, 'tryviumteamsqa.azurewebsites.net/agentconsole/login')]")));

			newDriver.switchTo().frame(chatFra);

			WebDriverWait tic = new WebDriverWait(newDriver, Duration.ofSeconds(90));
			try {
				WebElement tik = tic.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("(//*[contains(@class, 'ng-star-inserted')])[6]")));
				tik.click();
			} catch (Exception e) {

				e.printStackTrace();
			}

			Thread.sleep(9000);

			WebElement drop = newDriver
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown ui-widget ui-state-default')])[3]"));
			drop.click();

			Thread.sleep(2000);

			WebElement inci = newDriver
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown-item ui-corner-all')])[1]"));
			inci.click();

			Thread.sleep(2000);

			WebElement urgency = newDriver
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown ui-widget ui-state-default')])[4]"));
			urgency.click();

			Thread.sleep(2000);

			WebElement high = newDriver
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown-item ui-corner-all')])[1]"));
			high.click();

			Thread.sleep(2000);

			WebElement impact = newDriver
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown ui-widget ui-state-default')])[5]"));
			impact.click();

			Thread.sleep(2000);

			WebElement hi = newDriver
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown-item ui-corner-all')])[1]"));
			hi.click();

			Thread.sleep(2000);

			WebElement ass = newDriver
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown ui-widget ui-state-default')])[6]"));
			ass.click();

			Thread.sleep(2000);

			WebElement incident = newDriver
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown-item ui-corner-all')])[6]"));
			incident.click();

			Thread.sleep(2000);

			WebElement text1 = newDriver.findElement(
					By.xpath("(//*[contains(@class, 'form-control ng-untouched ng-pristine ng-invalid')])[1]"));
			text1.sendKeys("Hello Automation");

			Thread.sleep(2000);

			WebElement text2 = newDriver.findElement(
					By.xpath("(//*[contains(@class, 'form-control ng-untouched ng-pristine ng-invalid')])[1]"));
			text2.sendKeys("Automation");

			Thread.sleep(2000);

			WebElement submit = newDriver
					.findElement(By.xpath("//*[contains(@class, 'btn create-ticket-btn dropdown-toggle')]"));
			submit.click();

			Thread.sleep(2000);

			String windowHandle = newDriver.getWindowHandle();

			WebElement create = newDriver.findElement(By.xpath("(//*[contains(@class, 'dropdown-item')])[1]"));
			create.click();

			newDriver.switchTo().defaultContent();

			Thread.sleep(30000);

			Set<String> windowHandles = newDriver.getWindowHandles();

			List<String> list = new ArrayList<String>(windowHandles);

			newDriver.switchTo().window(list.get(1));
			Thread.sleep(2000);
			Map<String, String> loginCredentials = new HashMap<>();
			loginCredentials.put("username", "ApiUser");
			loginCredentials.put("password", "ApiUser");
			WebElement usernameField = newDriver.findElement(By.xpath("//*[@id='user_name']"));
			WebElement passwordField = newDriver.findElement(By.xpath("//*[@id='user_password']"));
			WebElement submitButton = newDriver.findElement(By.xpath("//*[@id='sysverb_login']"));
			usernameField.sendKeys(loginCredentials.get("username"));
			passwordField.sendKeys(loginCredentials.get("password"));
			submitButton.click();
			Thread.sleep(25000);
			try {

				for (int i = 0; i < 13; i++) {
					robot.keyPress(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_TAB);
					robot.keyPress(KeyEvent.VK_DOWN);
					robot.keyRelease(KeyEvent.VK_DOWN);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(2000);
			try {

				for (int i = 0; i < 18; i++) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_TAB);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			newDriver.switchTo().window(list.get(0));
			newDriver.switchTo().frame(chatFra);
			Thread.sleep(2000);
			WebElement ticketNumberTextBox = newDriver.findElement(By.xpath("//input[@role='searchbox']"));

			WebElement destinationTextBox = newDriver.findElement(By.xpath("//input[@placeholder='Search Ticket']"));

			String ticketNumber = ticketNumberTextBox.getAttribute("value");

			destinationTextBox.sendKeys(ticketNumber);

			Thread.sleep(3000);

			newDriver.switchTo().defaultContent();

			Thread.sleep(2000);

			WebElement logoff = newDriver.findElement(By.xpath("//*[@source='power-bar']"));
			logoff.click();
			Thread.sleep(1000);
			WebElement logoutButton = newDriver.findElement(By.id("logout-button"));
			logoutButton.click();
			Thread.sleep(2000);
			WebElement confirm = newDriver.findElement(By.id("confirmButton"));
			confirm.click();

			Thread.sleep(1000);
			try {

				for (int i = 0; i < 2; i++) {
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_W);
					robot.keyRelease(KeyEvent.VK_W);
					robot.keyRelease(KeyEvent.VK_CONTROL);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			newDriver.quit();
			Thread.sleep(1000);

			WebElement end = driver.findElement(By.cssSelector("div[role='textbox']"));
			end.sendKeys("/endchat");

			WebElement fins = driver.findElement(By.cssSelector("button[title='Send']"));
			fins.click();
			driver.switchTo().defaultContent();
			Thread.sleep(2000);

			WebElement logoff1 = driver.findElement(By.xpath("//*[@source='power-bar']"));
			logoff1.click();
			Thread.sleep(1000);
			WebElement logoutButton1 = driver.findElement(By.id("logout-button"));
			logoutButton1.click();
			Thread.sleep(2000);
			WebElement confirm1 = driver.findElement(By.id("confirmButton"));
			confirm1.click();
			Thread.sleep(1000);
			driver.quit();

		} finally {
			System.out.println("***************User and Agent Teams Launched successfully**************");

		}

	}

}
