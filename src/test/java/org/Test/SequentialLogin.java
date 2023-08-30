package org.Test;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SequentialLogin extends BaseClass {

	@Test
	private void Email() throws InterruptedException {
		browser("chrome");
		driver.get("https://tryviumteamsqa1.ontryvium.com/webconnect/chat/landing");
		driver.manage().window().maximize();
		driver.findElement(By.id("chat-btn-clk")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("txtName")).sendKeys(new CharSequence[] { "Vicky" });
		driver.findElement(By.id("txtEmail")).sendKeys(new CharSequence[] { "vignesh.devendiran@sensiple.com" });
		driver.findElement(By.id("txtQuery")).sendKeys(new CharSequence[] { "Welcome to chat bot test" });
		driver.findElement(By.id("chat-btn")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("chatIframe");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)", new Object[0]);
		Thread.sleep(3000);
		WebElement sub = driver.findElement(By.xpath("//*[@placeholder='Type your message']"));
		sub.sendKeys(new CharSequence[] { "Yes" });
		sub.submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='QA1_Test Skills']")).click();
		Thread.sleep(5000);
		String[] names = { "Jack", "John", "Jane", "Bob", "Alice", "raja", "Vivek", "Tom", "Rob", "Surya", "Alice",
				"Steve", "Rock", "vicky", "vinu", "Jessy", "Simbu", "Vijay", "Gp muthu", "Sunny", "Rani", "demo",
				"Remo", "Joesph", "babu", "ramu", "somu", "rambo", "stalin", "alagiri" };
		String[] emailIds = { "tryviumtestuser1@lab.ontryvium.com", "tryviumtestuser2@lab.ontryvium.com",
				"tryviumtestuser3@lab.ontryvium.com", "tryviumtestuser4@lab.ontryvium.com",
				"tryviumtestuser5@lab.ontryvium.com", "tryviumtestuser6@lab.ontryvium.com",
				"tryviumtestuser7@lab.ontryvium.com", "tryviumtestuser8@lab.ontryvium.com",
				"tryviumtestuser9@lab.ontryvium.com", "tryviumtestuser10@lab.ontryvium.com",
				"tryviumtestuser11@lab.ontryvium.com", "tryviumtestuser12@lab.ontryvium.com",
				"tryviumtestuser13@lab.ontryvium.com", "tryviumtestuser14@lab.ontryvium.com",
				"tryviumtestuser15@lab.ontryvium.com", "tryviumtestuser16@lab.ontryvium.com",
				"tryviumtestuser17@lab.ontryvium.com", "tryviumtestuser18@lab.ontryvium.com",
				"tryviumtestuser19@lab.ontryvium.com", "tryviumtestuser20@lab.ontryvium.com",
				"tryviumtestuser21@lab.ontryvium.com", "tryviumtestuser22@lab.ontryvium.com",
				"tryviumtestuser23@lab.ontryvium.com", "tryviumtestuser24@lab.ontryvium.com",
				"tryviumtestuser25@lab.ontryvium.com", "tryviumtestuser26@lab.ontryvium.com",
				"tryviumtestuser27@lab.ontryvium.com", "tryviumtestuser28@lab.ontryvium.com",
				"tryviumtestuser29@lab.ontryvium.com", "tryviumtestuser20@lab.ontryvium.com" };
		for (int i = 0; i < 30; i++) {
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://tryviumteamsqa1.ontryvium.com/webconnect/chat/landing");
			driver.manage().window().maximize();
			driver.findElement(By.id("chat-btn-clk")).click();
			Thread.sleep(3000L);
			driver.switchTo().frame(0);
			driver.findElement(By.id("txtName")).sendKeys(new CharSequence[] { names[i] });
			driver.findElement(By.id("txtEmail")).sendKeys(new CharSequence[] { emailIds[i] });
			driver.findElement(By.id("txtQuery")).sendKeys(new CharSequence[] { "Welcome to chat bot test" });
			driver.findElement(By.id("chat-btn")).click();
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("chatIframe");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollTo(0, document.body.scrollHeight)", new Object[0]);
			Thread.sleep(3000);
			WebElement sub1 = driver.findElement(By.xpath("//*[@placeholder='Type your message']"));
			sub1.sendKeys(new CharSequence[] { "Yes" });
			sub1.submit();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@title='QA1_Test Skills']")).click();
			Thread.sleep(5000);
		}
	}
}
