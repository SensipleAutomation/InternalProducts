package org.Test;

import org.Base.BaseClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportTest extends BaseClass {

	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;

	@BeforeSuite
	public void setUp() {
		// Initialize ExtentReports and create a report
		extent = new ExtentReports();

		// Specify the file path for the Extent report using ExtentSparkReporter
		spark = new ExtentSparkReporter("ExtentReport.html");

		// Attach the Spark reporter to ExtentReports
		extent.attachReporter(spark);
	}

	@BeforeTest
	private void websiteBrowser() {
		browser("chrome");
	}

	@Test
	public void yourTest() {
		// Start a test
		extent.createTest("Your Test Name", "Test Description");

		getUrl("https://jeniepm-staging.ontryvium.com/webconnect/chat/landing");

		// Log test status
		test.log(Status.PASS, "Test Passed");
	}

	@AfterTest
	private void amoian() {
		System.out.println("!@#$%^&*()");
	}

	@AfterSuite
	public void tearDown() {
		// Flush the report and close the ExtentReports instance
		extent.flush();
	}
}
