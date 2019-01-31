package com.github.sevcensokmen.googlesearch.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.github.sevcensokmen.googlesearch.pageobject.GooglePage;

public class DriverFactory {

	private static final String BROWSER_FIREFOX = "firefox";
	private static final String BROWSER_CHROME = "chrome";

	public static WebDriver driver;
	public static GooglePage googlePage;

	public WebDriver getDriver() {
		if (driver == null) {
			try {
				String browser = new ReadConfigFile().getBrowser();

				switch (browser) {
				case BROWSER_FIREFOX:
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					driver = new FirefoxDriver();
					break;
				case BROWSER_CHROME:
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					break;
				}
			} catch (Exception e) {
				System.out.println("Unable to load browser: " + e.getMessage());
			} finally {
				driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
				googlePage = PageFactory.initElements(driver, GooglePage.class);
			}
		}

		return driver;
	}
}
