package com.base;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.pages.Alertpage;
import com.pages.notificationpage;
import com.pages.reversingpage;
import com.pages.switchpage;
import com.utilities.Myreport;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class baseclass extends Myreport {
	public static AndroidDriver driver;
	public static Alertpage al;
	public static reversingpage rv;
	public static notificationpage np;
	public static switchpage sp;

	@BeforeClass
	public void setup() throws MalformedURLException {
		UiAutomator2Options ui = new UiAutomator2Options();
		ui.setDeviceName("MyVirtualPhone");
		ui.setPlatformName("Android");
		ui.setPlatformVersion("15");
		ui.setAutomationName("UiAutomator2");
		ui.setAppPackage("io.appium.android.apis");
		ui.setAppActivity("io.appium.android.apis.ApiDemos");

		URL url = URI.create("http://192.168.235.5:4723/").toURL();
		driver = new AndroidDriver(url, ui);

		al = new Alertpage(driver);
		rv = new reversingpage(driver);
		np = new notificationpage(driver);
		sp = new switchpage(driver);
	}

	@AfterClass
	public void TearDown() {

		driver.quit();

	}

}
