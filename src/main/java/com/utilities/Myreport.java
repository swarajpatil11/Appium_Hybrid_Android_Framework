package com.utilities;


import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Myreport {

	public static ExtentReports extent;
	public static ExtentSparkReporter spark;

	public static ExtentReports Setup() {
		String path = "test-output/index.html"; 
         	extent = new ExtentReports();
		new File("test-output/extentReport").mkdirs();
                spark = new ExtentSparkReporter(path);
		extent.attachReporter(spark);
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User", "Swaraj Chaudhari");
		spark.config().setTheme(Theme.DARK);
		return extent;
	}

	public static void flushReport() {
		if (extent != null) {
			extent.flush();
		}
	}

}
