package org.Test;

import org.Base.BaseClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

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
			Pass.sendKeys("Lok64568");

			// Wait for sign-in button and click
			WebElement sign = driver.findElement(By.id("idSIButton9"));
			sign.click();

			// Wait for the input button and click
			WebDriverWait inputButtonWait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement inputButton = inputButtonWait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='button']")));
			inputButton.click();

			// Wait for the first app bar link button and click
			WebDriverWait appLinkWait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement mylink = appLinkWait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//button[@class='app-bar-link app-bar-button '])[2]")));
			mylink.click();

			// Wait for dismiss button and click
			WebDriverWait dismissWait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement dismissButton = dismissWait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Dismiss']")));
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
			newPass.sendKeys("Gos85663");

			// Wait for sign-in button and click for the new driver
			WebElement newSign = newDriver.findElement(By.id("idSIButton9"));
			newSign.click();

			// Wait for the input button and click for the new driver
			WebDriverWait newInputButtonWait = new WebDriverWait(newDriver, Duration.ofSeconds(20));
			WebElement newInputButton = newInputButtonWait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='button']")));
			newInputButton.click();

			// Wait for the second app bar link button and click for the new driver
			WebDriverWait newAppLinkWait = new WebDriverWait(newDriver, Duration.ofSeconds(20));
			WebElement mylink3 = newAppLinkWait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//button[@class='app-bar-link app-bar-button '])[2]")));
			mylink3.click();

			// Wait for dismiss button and click for the new driver
			WebDriverWait newDismissWait = new WebDriverWait(newDriver, Duration.ofSeconds(20));
			WebElement newDismissButton = newDismissWait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Dismiss']")));
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
			Thread.sleep(10000);

			WebElement chatInputFieldAgent = newDriver.findElement(By.cssSelector("div[role='textbox']"));
			chatInputFieldAgent.sendKeys("Accept");

			WebElement sendButtonAgent = newDriver.findElement(By.cssSelector("button[title='Send']"));
			sendButtonAgent.click();

			if (sendButtonAgent.isSelected()) {
				System.out.println("****************Agent Accepted the invite*********************");
			} else {
				System.out.println("****************Agent Unable to Accept the invite*********************");
			}
			Thread.sleep(3000);
			WebDriverWait wait3 = new WebDriverWait(newDriver, Duration.ofSeconds(20));
			WebElement AgentTab = wait3.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(), 'Agent Tab')])[2]")));
			AgentTab.click();
			if (AgentTab.isSelected()) {
				System.out.println("****************Agent Tab Opened*********************");
			} else {
				System.out.println("****************Unable to click Agent Tab*********************");
			}
			Thread.sleep(1000);
			newDriver.switchTo().defaultContent();
			
//			Thread.sleep(5000);

			WebDriverWait fra = new WebDriverWait(newDriver, Duration.ofSeconds(40));

			WebElement chatFra = fra.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//embedded-page-container[@class='extension-tab-container']")));

			newDriver.switchTo().frame(chatFra);

			WebDriverWait tic = new WebDriverWait(newDriver, Duration.ofSeconds(30));
			WebElement tik = tic.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//*[contains(@class, 'ng-star-inserted')])[6]")));
			tik.click();

			Thread.sleep(2000);

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

		} finally {
			System.out.println("***************User and Agent Teams Launched successfully**************");
		}

	}

}
