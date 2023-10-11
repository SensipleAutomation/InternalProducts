package org.Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportTest {

	ExtentReports extent;
	ExtentTest test;

	@BeforeSuite
	public void setUp() {
		// Initialize ExtentReports and create a report
		extent = new ExtentReports();
	}

	@Test
	public void yourTest() {
		// Start a test
		test = extent.createTest("Your Test Name", "Test Description");

		// Your test logic using Selenium WebDriver
		// For example, test.log(Status.INFO, "Navigating to the website");
		// driver.get("https://example.com");

		// Log test status
		test.log(Status.PASS, "Test Passed");
	}

	@AfterSuite
	public void tearDown() {
		// Flush the report and close the ExtentReports instance
		extent.flush();
	}
}
