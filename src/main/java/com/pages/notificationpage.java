package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class notificationpage {
@FindBy(xpath="//android.widget.TextView[@content-desc=\"App\"]") WebElement AppBtn;
@FindBy(xpath="//android.widget.TextView[@content-desc=\"Notification\"]") WebElement notificationBtn;
@FindBy(xpath="//android.widget.TextView[@content-desc=\"NotifyWithText\"]") WebElement notifyWithTextBtn;
@FindBy(xpath="//android.widget.Button[@content-desc=\"Show Long Notification\"]") WebElement ShowLongNotBtn;




 public notificationpage(AndroidDriver driver)

 {
	 PageFactory.initElements(driver, this);
	 
	 
 }

 public void notificationData() {
	 AppBtn.click();
	 notificationBtn.click();
	 notifyWithTextBtn.click();
	 ShowLongNotBtn.click();
 }


}
