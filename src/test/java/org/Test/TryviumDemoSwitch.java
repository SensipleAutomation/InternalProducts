package org.Test;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TryviumDemoSwitch extends BaseClass {

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

			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://teams.microsoft.com/");

			// Wait for email input for the new driver and enter email
			WebDriverWait newMailWait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement mylink2 = newMailWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116")));
			mylink2.sendKeys("AutomationTestAgent1@lab.ontryvium.com");

			// Wait for next button and click for the new driver
			WebElement next1 = driver.findElement(By.id("idSIButton9"));
			next1.click();

			// Wait for password input and enter password for the new driver
			WebDriverWait newPassWait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement newPass = newPassWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0118")));
			newPass.sendKeys("Gos85664");

			// Wait for sign-in button and click for the new driver
			WebElement newSign = driver.findElement(By.id("idSIButton9"));
			newSign.click();

			// Wait for the input button and click for the new driver
			WebDriverWait newInputButtonWait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement newInputButton = newInputButtonWait
					.until(ExpectedConditions.elementToBeClickable(By.id("idBtn_Back")));
			newInputButton.click();

			// Wait for the second app bar link button and click for the new driver
			WebDriverWait newAppLinkWait = new WebDriverWait(driver, Duration.ofSeconds(100));
			WebElement mylink3 = newAppLinkWait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//button[@class='app-bar-link app-bar-button '])[2]")));
			mylink3.click();

			// Wait for dismiss button and click for the new driver
			WebDriverWait newDismissWait = new WebDriverWait(driver, Duration.ofSeconds(100));
			WebElement newDismissButton = newDismissWait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='text'])[2]")));
			newDismissButton.click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		} finally {
			System.out.println("***************User and Agent Teams Launched successfully**************");

		}
	}
}