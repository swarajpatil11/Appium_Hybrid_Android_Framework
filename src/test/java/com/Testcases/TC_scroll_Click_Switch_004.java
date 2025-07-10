package com.Testcases;

import org.testng.annotations.Test;

import com.base.baseclass;

import io.appium.java_client.AppiumBy;


public class TC_scroll_Click_Switch_004 extends baseclass{
	
	@Test
	public void switchScroll() {
	
		sp.ViewBTN();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+ ".scrollIntoView(new UiSelector().text(\"Switches\"));")).click();
        sp.standerd();
        sp.monitored();
        sp.standalone();
	
	
	}

}
