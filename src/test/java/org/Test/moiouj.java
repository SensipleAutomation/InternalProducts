package org.Test;

import java.time.Duration;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class moiouj extends BaseClass {
	@Test
	private void runink() throws InterruptedException {
		browser("chrome");
		getUrl("https://jeniepm-staging.ontryvium.com/webconnect/chat/landing");
		Thread.sleep(3000);
		driver.switchTo().frame(0);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement txtNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtName")));
		txtNameElement.sendKeys("Andrew");

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement txtNameElement1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtEmail")));
		txtNameElement1.sendKeys("TestUser2@lab.ontryvium.com");

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement txtNameElement2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtQuery")));
		txtNameElement2.sendKeys("Hi");

		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement txtNameElement3 = wait3
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='chat-btn']")));
		txtNameElement3.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		WebDriverWait q = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement popupMessage = q.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[contains(text(),'How can I help you today?')]")));

		// Send the next message
		WebElement responseInput = driver.findElement(By.xpath("//input[@placeholder='Type your message']"));
		responseInput.sendKeys("Outlook Issue");
		responseInput.submit();

		WebDriverWait oa = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement ee = oa.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Outlook Archive')]")));
		ee.click();

		WebDriverWait nex = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement archive = nex.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//p[contains(text(),'Okay, I will archive all of your email')]")));

		Thread.sleep(3000);
		WebElement response = driver.findElement(By.xpath("//input[@placeholder='Type your message']"));
		response.sendKeys("Yes");
		response.submit();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement sss = w.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//p[contains(text(),'Is there anything else I could help you with?')]")));

		Thread.sleep(3000);
		WebElement eee = driver.findElement(By.xpath("//input[@placeholder='Type your message']"));
		eee.sendKeys("Yes");
		eee.submit();

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		WebDriverWait wqq = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement qqqqqq = wqq.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//p[contains(text(),'Sure, What can I do for you?')]")));

		Thread.sleep(3000);
		WebElement rrr = driver.findElement(By.xpath("//input[@placeholder='Type your message']"));
		rrr.sendKeys("Outlook");
		rrr.submit();

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);

		eee.sendKeys("Rebuild Outlook profile");
		eee.submit();

		Thread.sleep(4000);
		eee.sendKeys("Yes");
		eee.submit();
		Thread.sleep(4000);
		eee.sendKeys("Yes");
		eee.submit();
		Thread.sleep(4000);
		eee.sendKeys("Yes");
		eee.submit();
		Thread.sleep(4000);
		eee.sendKeys("Yes");
		eee.submit();
		Thread.sleep(4000);
		eee.sendKeys("Yes");
		eee.submit();
		Thread.sleep(4000);
		eee.sendKeys("Yes");
		eee.submit();
		Thread.sleep(4000);
		eee.sendKeys("Yes");
		eee.submit();
		Thread.sleep(4000);
		eee.sendKeys("Yes");
		eee.submit();
		Thread.sleep(4000);
		eee.sendKeys("Yes");
		eee.submit();

//		WebDriverWait qwer = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement sdf = qwer.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Yes'])[3]")));
//		sdf.click();
//		Thread.sleep(2000);
//		WebDriverWait qwerr = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement bgfd = qwerr
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Yes'])[5]")));
//		bgfd.click();
//		Thread.sleep(2000);
//		WebDriverWait one = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement se = one.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Yes'])[7]")));
//		se.click();
//		Thread.sleep(2000);
//		WebDriverWait two = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement vfr = two.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Yes'])[9]")));
//		vfr.click();
//		Thread.sleep(2000);
//		WebDriverWait three = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement cde = three
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Yes'])[11]")));
//		cde.click();
//		Thread.sleep(2000);
//		WebDriverWait four = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement xde = four.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Yes'])[13]")));
//		xde.click();
//		Thread.sleep(2000);
//		WebDriverWait fiv = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement bfr = fiv.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Yes'])[15]")));
//		bfr.click();
//		Thread.sleep(2000);
//		WebDriverWait six = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement bfcr = six.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Yes'])[17]")));
//		bfcr.click();
//		Thread.sleep(2000);
//		WebDriverWait seve = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement bfcrd = seve
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Yes'])[19]")));
//		bfcrd.click();
		Thread.sleep(3000);
		WebDriverWait tre = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement ssswww = tre.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//p[contains(text(),'Is there anything else I could help you with?')]")));

		Thread.sleep(3000);
		WebElement vfe = driver.findElement(By.xpath("//input[@placeholder='Type your message']"));
		vfe.sendKeys("NO");
		vfe.submit();

	}

}
