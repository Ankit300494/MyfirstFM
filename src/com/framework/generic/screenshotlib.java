package com.framework.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class screenshotlib {

	public void takeScreenshot(WebDriver driver, String filename) {
		
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		File srcfile =efw.getScreenshotAs(OutputType.FILE);
		File destfile= new File(".\\screenshots\\"+filename+".png");
		try {
			FileUtils.copyFile(srcfile, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
