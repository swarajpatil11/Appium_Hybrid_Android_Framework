package com.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.baseclass;

public class Screenshot extends baseclass {

	public String takescreenshot(String name) {
		
		
		String path = System.getProperty("user.dir") + "/target/Screenshot/"+name+".png";
		TakesScreenshot tks = (TakesScreenshot) driver;
		File source = tks.getScreenshotAs(OutputType.FILE);
		File file = new File(path);
		try {
			FileUtils.copyFile(source, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;

	}
		
		
		
	}

