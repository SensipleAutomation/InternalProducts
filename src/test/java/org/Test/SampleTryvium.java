package org.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SampleTryvium extends BaseClass {

	@Test
	private void TestAuto() throws AWTException, InterruptedException {
		browser("firefox");
		driver.get("https://teams.microsoft.com/");
		Thread.sleep(7000);
		WebElement mail = driver.findElement(By.id("i0116"));
		mail.sendKeys("AutomationTestUser@lab.ontryvium.com");
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
			Thread.sleep(2000);
			WebDriverWait wait3 = new WebDriverWait(newDriver, Duration.ofSeconds(35));
			WebElement mylink3 = wait3.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//button[@class='app-bar-link app-bar-button '])[2]")));
			mylink3.click();
			Thread.sleep(2000);
			newDriver.findElement(By.xpath("//button[@title='Dismiss']")).click();
			Thread.sleep(10000);
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

			Thread.sleep(6000);

			WebElement accept = driver.findElement(By.xpath("(//*[contains(@class, 'fui-StyledText')])[2]"));
			accept.click();

			if (accept.isEnabled()) {
				System.out.println("***********Record Chat Transcript was successfully clicked.**********");
			} else {
				System.out.println("****************Record Chat Transcript could not be clicked.***********");
			}
			Thread.sleep(5000);

			WebElement qa = driver.findElement(By.xpath("(//button[contains(@class, 'carousel__paddle ')])[2]"));
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
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_ALT);

			Thread.sleep(2000);
			
			WebDriverWait bot = new WebDriverWait(newDriver, Duration.ofSeconds(90));
			WebElement botsel = bot.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//span[contains(text(),'tryviumteamsqa- Agent App')]")));

			WebDriverWait framesAgent = new WebDriverWait(newDriver, Duration.ofSeconds(90));

			WebElement chatFrameAgent = framesAgent.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("(//*[contains(@id, 'experience-container')])[2]")));

			newDriver.switchTo().frame(chatFrameAgent);
			Thread.sleep(5000);		
			
			WebElement chatInputFieldAgent = newDriver.findElement(By.cssSelector("div[role='textbox']"));
			chatInputFieldAgent.sendKeys("Accept");

			WebElement sendButtonAgent = newDriver.findElement(By.cssSelector("button[title='Send']"));
			sendButtonAgent.click();
			
			if (sendButtonAgent.isSelected()) {
				System.out.println("****************Agent Accepted the invite*********************");
			}
			else {
				System.out.println("****************Agent Unable to Accept the invite*********************");
			}
			

			Thread.sleep(5000);

			WebElement at = newDriver.findElement(By.xpath("(//*[contains(@class, 'fui-StyledText')])[2]"));
			at.click();
			if (at.isSelected()) {
				System.out.println("****************Agent Tab Opened*********************");
			}
			else {
				System.out.println("****************Unable to click Agent Tab*********************");
			}
			
			Thread.sleep(2000);
			newDriver.switchTo().defaultContent();
			Thread.sleep(10000);

			WebDriverWait fra = new WebDriverWait(newDriver, Duration.ofSeconds(90));

			WebElement chatFra = fra.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//iframe[@title='tryviumteamsqa- Agent App Tab View']")));

			newDriver.switchTo().frame(chatFra);
			Thread.sleep(5000);
			WebElement xxx = newDriver.findElement(By.xpath(
					"(//*[local-name()='svg' and @xmlns='http://www.w3.org/2000/svg']/*[local-name()='path'])[6]"));
			xxx.click();
			Thread.sleep(4000);

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

			driver.switchTo().defaultContent();

			Thread.sleep(25000);

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
			Thread.sleep(30000);

			WebElement state = newDriver.findElement(By.xpath("//select[@id='incident.state']"));
			Select dropdown = new Select(state);
			dropdown.selectByValue("2");
			Thread.sleep(2000);
			Actions actions = new Actions(newDriver);
			WebElement sourceElement = newDriver.findElement(By.xpath("//input[@id='incident.number']"));
			actions.moveToElement(sourceElement).click().sendKeys(Keys.CONTROL, "a").sendKeys(Keys.CONTROL, "c").build()
					.perform();
			newDriver.switchTo().window(list.get(0));
			Thread.sleep(1000);
			WebElement destinationElement = newDriver
					.findElement(By.xpath("(//*[contains(@class, 'form-control')])[3]"));
			actions.moveToElement(destinationElement).click().sendKeys(Keys.CONTROL, "v").build().perform();

		}

	}
}
