package org.Test;

import org.Base.BaseClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestPart.class)

public class moiouj extends BaseClass {
	@Test
	private void runink() throws InterruptedException {
		browser("chrome");
		getUrl("https://tryviumteamsqa.azurewebsites.net/adminconsole/Login");
		Thread.sleep(3000);
		driver.quit();
	}

}
