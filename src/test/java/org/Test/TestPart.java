package org.Test;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestPart extends BaseClass {
	@Test
	private void scrool() throws InterruptedException {
		browser("chrome");
		getUrl("https://jeniepm-staging.ontryvium.com/adminconsole/Login");
		Thread.sleep(2000);
		driver.findElement(By.name("useremail")).sendKeys("admin@sensipleucx.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Jan2023@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Login ']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[contains(@class, 'treeview')])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//i[@class='p-element fa fa-edit cursur-cl fa-edit-icon'])[2]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
	}

}
