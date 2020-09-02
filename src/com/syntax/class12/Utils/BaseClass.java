package com.syntax.class12.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	/**
	 * this method navigates to hrms website
	 * 
	 * @return <-- driver
	 * @author <-- Hunter
	 */
	public static WebDriver setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		// Creating driver object
		driver = new ChromeDriver();

		// Maximizing the Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Navigating to Web-address
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");

		return driver;
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
