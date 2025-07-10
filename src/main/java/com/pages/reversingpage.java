package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class reversingpage {
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Animation\"]")
	WebElement AnimationBTn;
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Reversing\"]")
	WebElement reversingBtn;
	@FindBy(id = "io.appium.android.apis:id/startButton")
	WebElement PlayBtn;
	@FindBy(id = "io.appium.android.apis:id/reverseButton")
	WebElement reverseBtn;

	public reversingpage(AndroidDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void Reverse() throws InterruptedException {
		AnimationBTn.click();
		reversingBtn.click();
		PlayBtn.click();
		Thread.sleep(2000);
		reverseBtn.click();
	}

}
