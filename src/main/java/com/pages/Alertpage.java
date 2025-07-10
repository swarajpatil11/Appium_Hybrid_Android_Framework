package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Alertpage {
	public AndroidDriver driver;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"App\"]")
	WebElement AppBTN;
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Alert Dialogs\"]")
	WebElement AlertDialogBTN;
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"OK Cancel dialog with a long message\"]")
	WebElement WithLongMSGBTN;
	@FindBy(id = "android:id/button1")
	WebElement AlertOkBTN;

	public Alertpage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
        this.driver = driver;
	}

	public void Alert() throws InterruptedException {
		AppBTN.click();
		AlertDialogBTN.click();
		WithLongMSGBTN.click();
		Thread.sleep(1000);
		AlertOkBTN.click();

	}

	public WebElement Heading() {
		WebElement heading = driver.findElement(By.xpath("//android.widget.TextView[@text=\"App/Alert Dialogs\"]"));
		return heading;

	}

}
