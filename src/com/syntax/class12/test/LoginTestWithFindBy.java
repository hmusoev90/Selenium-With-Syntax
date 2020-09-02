package com.syntax.class12.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.class12.Utils.BaseClass;
import com.syntax.class12.pages.LoginPageWithFindBy;

public class LoginTestWithFindBy {

	public static void main(String[] args) {
		BaseClass.setUp();
		
		LoginPageWithFindBy login= new LoginPageWithFindBy();
		login.userNameTextBox.sendKeys("Admin");
		login.passwrodTextBox.sendKeys("Hum@nhrm123");
		login.loginBtn.click();
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(file, new File("ScreenShots/HRMS/dashboard.jpg"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		BaseClass.tearDown();
	}
}
