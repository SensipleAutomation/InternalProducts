package org.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdminConsole extends BaseClass {

	@Test
	private void Admin() throws InterruptedException, AWTException {
		browser("chrome");
		getUrl("https://tryviumteamsqa.azurewebsites.net/adminconsole/Login");
		Thread.sleep(3000);
		Map<String, String> loginCredentials = new HashMap<>();
		loginCredentials.put("username", "admin@sensipleucx.com");
		loginCredentials.put("password", "Sensiple*2023");
		Thread.sleep(5000);
		WebElement usernameField = driver.findElement(By.name("useremail"));
		WebElement passwordField = driver.findElement(By.name("password"));
		WebElement submitButton = driver.findElement(By.xpath("//*[text()='Login ']"));
		usernameField.sendKeys(loginCredentials.get("username"));
		passwordField.sendKeys(loginCredentials.get("password"));
		submitButton.click();

//        driver.findElement(By.name("useremail")).sendKeys("admin@sensipleucx.com");
//        driver.findElement(By.name("password")).sendKeys("Sensiple*2023");
//        driver.findElement(By.xpath("//*[text()='Login ']")).click();
		Thread.sleep(5000);
		WebElement Ski = driver.findElement(By.xpath("(//li[@class='treeview ng-star-inserted'])[3]"));
		Ski.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/adminconsole/Home/SkillGroup']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//th[text()='Skills']")).click();
		Thread.sleep(1000);
		WebElement New = driver.findElement(By.xpath("//button[text()='New Skill Group']"));
		New.click();
		Thread.sleep(2000);
		driver.findElement(By.name("groupname")).sendKeys("TestDemo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role='textbox'])[1]")).sendKeys("maheswari");
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//li[@role='option']"));
		WebElement target = driver.findElement(By.xpath("(//ul[@role='listbox'])[2]"));
		actions.dragAndDrop(source, target).build().perform();
		actions.release().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role='textbox'])[1]")).clear();
		Robot robot = new Robot();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		WebElement Check = driver.findElement(By.xpath("//div[@class='p-checkbox-box']"));
		Check.click();
		driver.findElement(By.xpath("(//*[@placeholder='Select language'])[1]")).click();
//        driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("English");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='English']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		// Find the menu element

		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		Thread.sleep(1000);
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
//        driver.findElement(By.xpath("//*[@class='skillGroupCombolist ng-pristine ng-valid ng-touched']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//*[@formcontrolname=\"vipSkillgroup\"]"));
		Select select = new Select(dropdown);
		select.selectByValue("56");
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//*[@formcontrolname=\"skillGroupCombo\"]"));
		Select Pick = new Select(drop);
		Pick.selectByValue("72");
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("30");
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("30");
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("30");
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		WebElement pickup = driver.findElement(By.xpath("//*[@formcontrolname='waitingChatSkillGroup']"));
		Select sel = new Select(pickup);
		sel.selectByValue("49");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("30");
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("30");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("30");
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("30");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("25");
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@formcontrolname='item'])[1]")).sendKeys("Scheduler");
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[15]")).sendKeys("32");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		WebElement Sel = driver.findElement(By.xpath("(//*[contains(@style, 'important')])[3]"));
		Select Dro = new Select(Sel);
		Dro.selectByValue("38");
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		WebElement Chat = driver.findElement(By.name("chatTranscriptInLanguage"));
		Select lang = new Select(Chat);
		lang.selectByValue("agent");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter a new tag']")).sendKeys("Testing");
		driver.findElement(By.xpath("(//div[@class='p-checkbox-box'])[1]")).click();
		WebElement feed = driver.findElement(By.name("questionnaire"));
		Select inp = new Select(feed);
		inp.selectByValue("3");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		WebElement ques = driver.findElement(By.xpath("//select[@formcontrolname='questionnaireId']"));
		Select Que = new Select(ques);
		Que.selectByValue("5");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		WebElement Holi = driver.findElement(By.xpath("(//*[contains(@style, 'important')])[7]"));
		Select day = new Select(Holi);
		day.selectByValue("85");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		WebElement Day = driver.findElement(By.xpath("(//*[contains(@style, 'important')])[8]"));
		Select week = new Select(Day);
		week.selectByValue("0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='form-group'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='09:00']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='form-group'])[3]")).click();
		driver.findElement(By.xpath("//*[text()='21:00']")).click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(1000);
		week.selectByValue("1");
		driver.findElement(By.xpath("(//div[@class='form-group'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='09:00']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='form-group'])[3]")).click();
		driver.findElement(By.xpath("//*[text()='21:00']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(2000);
		week.selectByValue("2");
		driver.findElement(By.xpath("(//div[@class='form-group'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='09:00']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='form-group'])[3]")).click();
		driver.findElement(By.xpath("//*[text()='21:00']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(2000);
		week.selectByValue("3");
		driver.findElement(By.xpath("(//div[@class='form-group'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='09:00']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='form-group'])[3]")).click();
		driver.findElement(By.xpath("//*[text()='21:00']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(2000);
		week.selectByValue("4");
		driver.findElement(By.xpath("(//div[@class='form-group'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='09:00']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='form-group'])[3]")).click();
		driver.findElement(By.xpath("//*[text()='21:00']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(2000);
		week.selectByValue("5");
		driver.findElement(By.xpath("(//div[@class='form-group'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='09:00']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='form-group'])[3]")).click();
		driver.findElement(By.xpath("//*[text()='21:00']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(2000);
		week.selectByValue("6");
		driver.findElement(By.xpath("(//div[@class='form-group'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='09:00']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='form-group'])[3]")).click();
		driver.findElement(By.xpath("//*[text()='21:00']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Cancel']")).click();

	}
}