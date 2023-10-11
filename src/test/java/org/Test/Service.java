package org.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Service extends BaseClass {
	@Test
	private void poiut() throws InterruptedException, AWTException {
		browser("chrome");
		getUrl("https://ven01536.service-now.com/now/nav/ui/classic/params/target/incident.do%3Fsys_id%3D9c3f003c1b0df5507518c91e1e4bcb20");
		Thread.sleep(10000);
		Map<String, String> loginCredentials = new HashMap<>();
		loginCredentials.put("username", "ApiUser");
		loginCredentials.put("password", "ApiUser");
		WebElement usernameField = driver.findElement(By.xpath("//*[@id='user_name']"));
		WebElement passwordField = driver.findElement(By.xpath("//*[@id='user_password']"));
		WebElement submitButton = driver.findElement(By.xpath("//*[@id='sysverb_login']"));
		usernameField.sendKeys(loginCredentials.get("username"));
		passwordField.sendKeys(loginCredentials.get("password"));
		submitButton.click();
		Thread.sleep(20000);

		try {
			Robot robot = new Robot();

			for (int i = 0; i < 13; i++) {
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
