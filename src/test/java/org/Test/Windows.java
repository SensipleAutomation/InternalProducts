package org.Test;

import java.util.Iterator;

import org.Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Windows extends BaseClass {

	@Test
	private void ioub() throws InterruptedException {
		browser("chrome");
		getUrl("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("window.open()");
		getUrl("https://en.wikipedia.org/wiki/Vijay_Antony");
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			driver.getCurrentUrl();

		}
		((JavascriptExecutor) driver).executeScript("window.open()");
		getUrl("https://en.wikipedia.org/wiki/Vijay");
		String secondWindow = null;
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(driver.getWindowHandle())) {
				secondWindow = handle;

			}
		}
		driver.switchTo().window(secondWindow);

		getUrl("https://en.wikipedia.org/wiki/Vijay");

		// Print the URL of the third tab
		System.out.println("URL of the third tab: " + driver.getCurrentUrl());
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
		Thread.sleep(2000);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);
		Thread.sleep(2000);
		driver.switchTo().window((String) driver.getWindowHandles().toArray()[2]);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.open()");
		String thirdWindow = null;
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(driver.getWindowHandle())) {
				thirdWindow = handle;
			}
		}
		getUrl("https://en.wikipedia.org/wiki/AjithKumar");
	}
}
