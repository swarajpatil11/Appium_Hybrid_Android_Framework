package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class switchpage {
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Views\"]") WebElement ViewsBTN;
	@FindBy(xpath="//android.widget.Switch[@content-desc=\"Standard switch\"]") WebElement StanderdBTN;
	@FindBy(xpath="//android.widget.Switch[@content-desc=\"Monitored switch\"]") WebElement MonitoredSwitchBTN;
	@FindBy(xpath="//android.widget.LinearLayout/android.widget.Switch[9]") WebElement StandAloneSwitch;
	
	
	
	public switchpage(AndroidDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void ViewBTN() {
		ViewsBTN.click();
		
	}
	
	public void standerd() {
		StanderdBTN.click();
		
	}
	public void monitored() {
		MonitoredSwitchBTN.click();
		
	}
	public void standalone() {
		StandAloneSwitch.click();
		
	}

}
