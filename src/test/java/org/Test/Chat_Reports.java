package org.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.Base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chat_Reports extends BaseClass {

	@BeforeTest
	public static void Launcher() {
		browser("chrome");
	}

	@Test
	public static void LoginPage() throws InterruptedException {
		driver.get("https://tryviumteamsqa.azurewebsites.net/adminconsole/Home/Dashboard");
		Thread.sleep(4000);
		driver.findElement(By.name("useremail")).sendKeys("admin@sensipleucx.com");
		driver.findElement(By.name("password")).sendKeys("Sensiple*2023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-star-inserted']")).click();
		Thread.sleep(6000);
	}

	@Test
	public static void AvailableAgents() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("(//div[contains(@class,'row nopadding')])[1]"));
		String text = ele.getText();
		System.out.println("***********Avaiable Agents******************");
		System.out.println(text);
		Thread.sleep(4000);
	}

	@Test
	public static void AdminConsolePageSnap() throws IOException {
		Date date = new Date();
		System.out.println(date);
		String str = date.toString().replace(" ", "-").replace(":", "-");
		System.out.println(str);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File des = new File("C:\\Users\\rajasekar.p\\eclipse-workspace\\Tryvium\\Snaps\\" + str + "image.png");
		FileUtils.copyFile(src, des);
	}

	@Test
	public static void ReportGenerationfor7days() throws InterruptedException {
		Thread.sleep(2000);
		Actions Mousehover = new Actions(driver);
		WebElement menuoption = driver.findElement(By.xpath("(//a[@class='has-submenu'])[3]"));
		Mousehover.moveToElement(menuoption).perform();
		Thread.sleep(5000);
		WebElement Submenu = driver.findElement(By.xpath("//span[text()='Chat Reports']"));
		Submenu.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(@class,'box-title')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'date-picker-calender')]")).click();
		driver.findElement(By.xpath("//button[text()='Last 7 Days']")).click();
		driver.findElement(By.xpath("//button[text()=' Generate Report ']")).click();
		Thread.sleep(5000);
		List<WebElement> elements = driver.findElements(
				By.xpath("(//div[@class='p-datatable-header ng-star-inserted']/following-sibling::div)[1]"));
		for (WebElement data : elements) {

			String text = data.getText();
			System.out.println("*************Reports for 7 days********************");
			System.out.println(text);
		}

	}

	@AfterTest
	public static void DownloadReports() throws InterruptedException {
		driver.findElement(By.xpath("(//button[contains(@class,'all-btns download-btn')])[1]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
