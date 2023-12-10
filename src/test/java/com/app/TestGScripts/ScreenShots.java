package com.app.TestGScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.app.TestGScripts.TestNGScript;

public class ScreenShots extends TestNGScript {
	
	public static  String takeScreenshot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = "D:\\Screenshots\\myScreenshot_"+System.currentTimeMillis()+".png";
		File target = new File(path);

		FileUtils.copyFile(source, target);
		
		String targetpath = target.getAbsolutePath();
		return targetpath;

}
}
