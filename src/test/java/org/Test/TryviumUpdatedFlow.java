package org.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.netty.handler.timeout.TimeoutException;

public class TryviumUpdatedFlow extends BaseClass {

	@Test
	private void Dummy() throws InterruptedException, AWTException, IOException {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--private"); // Enable incognito mode

		// Create the first WebDriver instance
		WebDriver driver1 = new FirefoxDriver(options);
		// Create the second WebDriver instance

		try {
			// Login to the first URL
			driver1.get("https://teams.microsoft.com/");
			WebDriverWait mailWait = new WebDriverWait(driver1, Duration.ofSeconds(20));
			WebElement mail = mailWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116")));
			mail.sendKeys("AutomationTestUser@lab.ontryvium.com");

			// Wait for next button and click
			WebElement next = driver1.findElement(By.id("idSIButton9"));
			next.click();

			// Wait for password input and enter password
			WebDriverWait passWait = new WebDriverWait(driver1, Duration.ofSeconds(20));
			WebElement Pass = passWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0118")));
			Pass.sendKeys("Lok64569");

			// Wait for sign-in button and click
			WebElement sign = driver1.findElement(By.id("idSIButton9"));
			sign.click();

			// Wait for the input button and click
			WebDriverWait inputButtonWait = new WebDriverWait(driver1, Duration.ofSeconds(100));
			WebElement inputButton = inputButtonWait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='button']")));
			inputButton.click();

			// Wait for the first app bar link button and click
			WebDriverWait appLinkWait = new WebDriverWait(driver1, Duration.ofSeconds(100));
			WebElement mylink = appLinkWait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//button[@class='app-bar-link app-bar-button '])[2]")));
			mylink.click();

			// Wait for dismiss button and click
			WebDriverWait dismissWait = new WebDriverWait(driver1, Duration.ofSeconds(100));
			WebElement dismissButton = dismissWait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='text'])[2]")));
			dismissButton.click();
			WebDriver driver2 = new FirefoxDriver(options);
			driver2.get("https://teams.microsoft.com/");
			WebDriverWait newMailWait = new WebDriverWait(driver2, Duration.ofSeconds(20));
			WebElement mylink2 = newMailWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116")));
			mylink2.sendKeys("AutomationTestAgent1@lab.ontryvium.com");

			// Wait for next button and click for the new driver
			WebElement next1 = driver2.findElement(By.id("idSIButton9"));
			next1.click();

			// Wait for password input and enter password for the new driver
			WebDriverWait newPassWait = new WebDriverWait(driver2, Duration.ofSeconds(20));
			WebElement newPass = newPassWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0118")));
			newPass.sendKeys("Gos85664");

			// Wait for sign-in button and click for the new driver
			WebElement newSign = driver2.findElement(By.id("idSIButton9"));
			newSign.click();

			// Wait for the input button and click for the new driver
			WebDriverWait newInputButtonWait = new WebDriverWait(driver2, Duration.ofSeconds(20));
			WebElement newInputButton = newInputButtonWait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='button']")));
			newInputButton.click();

			// Wait for the second app bar link button and click for the new driver
			WebDriverWait newAppLinkWait = new WebDriverWait(driver2, Duration.ofSeconds(100));
			WebElement mylink3 = newAppLinkWait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//button[@class='app-bar-link app-bar-button '])[2]")));
			mylink3.click();

			// Wait for dismiss button and click for the new driver
			WebDriverWait newDismissWait = new WebDriverWait(driver2, Duration.ofSeconds(100));
			WebElement newDismissButton = newDismissWait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='text'])[2]")));
			newDismissButton.click();
			driver1.switchTo().defaultContent();
			robotClass();
			WebDriverWait frames = new WebDriverWait(driver1, Duration.ofSeconds(90));

			WebElement chatFrame = frames.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("(//*[contains(@id, 'experience-container')])[2]")));

			driver1.switchTo().frame(chatFrame);
			Thread.sleep(1000);

			WebElement chatInputField = driver1.findElement(By.cssSelector("div[role='textbox']"));
			chatInputField.sendKeys("Hello");

			WebElement sendButton = driver1.findElement(By.cssSelector("button[title='Send']"));
			sendButton.click();
			WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(30));
			WebElement accept = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//*[contains(@class, 'fui-StyledText')])[2]")));
			accept.click();
			if (accept.isEnabled()) {
				System.out.println("***********Record Chat Transcript was successfully clicked.**********");
			} else {
				System.out.println("****************Record Chat Transcript could not be clicked.***********");
			}

			WebDriverWait wait2 = new WebDriverWait(driver1, Duration.ofSeconds(30));
			WebElement qa = wait2.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//button[contains(@class, 'carousel__paddle ')])[2]")));
			qa.click();
			Thread.sleep(1000);
			qa.click();
			Thread.sleep(2000);

			WebElement element = driver1.findElement(By.xpath("(//*[contains(@class, 'fui-StyledText')])[5]"));
			if (element.isDisplayed() && element.isEnabled()) {
				element.click();
				System.out.println("**************AutomationSkillgroup Selected***************************");
			} else {
				System.out.println("*************************AutomationSkillgroup Not Selected*********************");
			}
			robotClass();

			driver2.switchTo().defaultContent();

			WebDriverWait bot = new WebDriverWait(driver2, Duration.ofSeconds(90));
			WebElement botsel = bot.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[contains(text(),'tryviumteamsqa- Agent App')]")));

			WebDriverWait framesAgent = new WebDriverWait(driver2, Duration.ofSeconds(90));

			WebElement chatFrameAgent = framesAgent.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("(//*[contains(@id, 'experience-container')])[2]")));

			driver2.switchTo().frame(chatFrameAgent);

			WebDriverWait acp = new WebDriverWait(driver2, Duration.ofSeconds(30));
			WebElement but = acp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//span[starts-with(text(),'Hello,you have a service request from')]/following::button[1]")));
			but.click();

			if (but.isDisplayed()) {
				System.out.println("****************Agent Accepted the invite*********************");
			} else {
				System.out.println("****************Agent Unable to Accept the invite*********************");
			}
			Thread.sleep(3000);
			WebDriverWait wait3 = new WebDriverWait(driver2, Duration.ofSeconds(20));
			try {
				WebElement AgentTab = wait3.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("(//span[starts-with(text(),'Show Customer Profile')]/following::button[1])[2]")));
				AgentTab.click();
				System.out.println("****************Agent Tab Opened*********************");
			} catch (TimeoutException e) {
				System.out.println("****************Unable to find or click Agent Tab*********************");
			}
			Thread.sleep(1000);
			driver2.switchTo().defaultContent();

			WebDriverWait fra = new WebDriverWait(driver2, Duration.ofSeconds(90));

			WebElement chatFra = fra.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//iframe[contains(@src, 'tryviumteamsqa.azurewebsites.net/agentconsole/login')]")));

			driver2.switchTo().frame(chatFra);

			WebDriverWait tic = new WebDriverWait(driver2, Duration.ofSeconds(90));
			try {
				WebElement tik = tic.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("(//*[contains(@class, 'ng-star-inserted')])[6]")));
				tik.click();
			} catch (Exception e) {

				e.printStackTrace();
			}

			WebDriverWait Ticket = new WebDriverWait(driver2, Duration.ofSeconds(60));
			WebElement Type = Ticket.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//*[contains(@class, 'ticketTypeDetails')])[1]")));
			Type.click();

//			Thread.sleep(9000);
//
//			WebElement drop = driver2
//					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown ui-widget ui-state-default')])[3]"));
//			drop.click();

			Thread.sleep(2000);

			WebElement inci = driver2
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown-item ui-corner-all')])[1]"));
			inci.click();

			Thread.sleep(2000);

			WebElement urgency = driver2
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown ui-widget ui-state-default')])[4]"));
			urgency.click();

			Thread.sleep(2000);

			WebElement high = driver2
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown-item ui-corner-all')])[1]"));
			high.click();

			Thread.sleep(2000);

			WebElement impact = driver2
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown ui-widget ui-state-default')])[5]"));
			impact.click();

			Thread.sleep(2000);

			WebElement hi = driver2
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown-item ui-corner-all')])[1]"));
			hi.click();

			Thread.sleep(2000);

			WebElement ass = driver2
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown ui-widget ui-state-default')])[6]"));
			ass.click();

			Thread.sleep(2000);

			WebElement incident = driver2
					.findElement(By.xpath("(//*[contains(@class, 'ui-dropdown-item ui-corner-all')])[6]"));
			incident.click();

			Thread.sleep(2000);

			WebElement text1 = driver2.findElement(
					By.xpath("(//*[contains(@class, 'form-control ng-untouched ng-pristine ng-invalid')])[1]"));
			text1.sendKeys("Hello Automation");

			Thread.sleep(2000);

			WebElement text2 = driver2.findElement(
					By.xpath("(//*[contains(@class, 'form-control ng-untouched ng-pristine ng-invalid')])[1]"));
			text2.sendKeys("Automation");

			Thread.sleep(2000);

			WebElement submit = driver2
					.findElement(By.xpath("//*[contains(@class, 'btn create-ticket-btn dropdown-toggle')]"));
			submit.click();

			Thread.sleep(2000);
			String windowHandle = driver2.getWindowHandle();

			WebElement create = driver2.findElement(By.xpath("(//*[contains(@class, 'dropdown-item')])[1]"));
			create.click();

			Thread.sleep(30000);

			Set<String> windowHandles = driver2.getWindowHandles();

			List<String> list = new ArrayList<String>(windowHandles);

			driver2.switchTo().window(list.get(1));

			// Perform actions in the new tab using explicit waits
			WebDriverWait waiting = new WebDriverWait(driver2, Duration.ofSeconds(60));
			WebElement usernameField = waiting
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user_name']")));
			WebElement passwordField = waiting
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user_password']")));
			WebElement submitButton = waiting
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sysverb_login']")));

			// Enter login credentials and click submit
			usernameField.sendKeys("ApiUser");
			passwordField.sendKeys("ApiUser");
			submitButton.click();

			Thread.sleep(25000);
			Robot r = new Robot();
			try {

				for (int i = 0; i < 13; i++) {

					r.keyPress(KeyEvent.VK_TAB);
					r.keyRelease(KeyEvent.VK_TAB);
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(2000);
			try {

				for (int i = 0; i < 18; i++) {
					r.keyPress(KeyEvent.VK_SHIFT);
					r.keyPress(KeyEvent.VK_TAB);
					r.keyRelease(KeyEvent.VK_TAB);
					r.keyRelease(KeyEvent.VK_SHIFT);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			driver2.switchTo().window(list.get(0));
			driver2.switchTo().frame(chatFra);
			Thread.sleep(2000);
			WebElement ticketNumberTextBox = driver2.findElement(By.xpath("//input[@role='searchbox']"));

			WebElement destinationTextBox = driver2.findElement(By.xpath("//input[@placeholder='Search Ticket']"));

			String ticketNumber = ticketNumberTextBox.getAttribute("value");

			destinationTextBox.sendKeys(ticketNumber);

			driver2.switchTo().defaultContent();

			Thread.sleep(2000);

			WebElement logoff = driver2.findElement(By.xpath("//*[@source='power-bar']"));
			logoff.click();
			Thread.sleep(1000);
			WebElement logoutButton = driver2.findElement(By.id("logout-button"));
			logoutButton.click();
			Thread.sleep(2000);
			WebElement confirm = driver2.findElement(By.id("confirmButton"));
			confirm.click();
			Thread.sleep(1000);
			driver2.quit();
			Thread.sleep(2000);
			driver1.switchTo().defaultContent();
			Thread.sleep(1000);
			driver1.switchTo().frame(chatFrame);
			Thread.sleep(1000);

			WebElement chatInputField1 = driver1.findElement(By.cssSelector("div[role='textbox']"));
			chatInputField1.sendKeys("/endchat");

			WebElement sendButton1 = driver1.findElement(By.cssSelector("button[title='Send']"));
			sendButton1.click();
			driver1.switchTo().defaultContent();
			Thread.sleep(1000);
			WebElement logoff1 = driver1.findElement(By.xpath("//*[@source='power-bar']"));
			logoff1.click();
			Thread.sleep(1000);
			WebElement logoutButton1 = driver1.findElement(By.id("logout-button"));
			logoutButton1.click();
			Thread.sleep(2000);
			WebElement confirm1 = driver1.findElement(By.id("confirmButton"));
			confirm1.click();
			Thread.sleep(1000);
			driver1.quit();

		} finally

		{
			// Close both WebDriver instances
			System.out.println("****Launched****");
		}

	}
}