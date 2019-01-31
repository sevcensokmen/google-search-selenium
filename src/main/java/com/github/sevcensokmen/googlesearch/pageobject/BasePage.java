package com.github.sevcensokmen.googlesearch.pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.sevcensokmen.googlesearch.util.DriverFactory;

public class BasePage extends DriverFactory {
	
	private static final int TIMEOUT_IN_SECONDS = 15;
	
	private WebDriverWait wait;

	public BasePage() {
		wait = new WebDriverWait(driver, TIMEOUT_IN_SECONDS);
	}

	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public void loadUrl(String url) {
		driver.get(url);
	}

	public void waitAndClickElement(WebElement element) throws InterruptedException {
		boolean isClicked = false;
		int attempts = 0;
		while (!isClicked && attempts < 10) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(element)).click();

				System.out.println("Successfully clicked on the WebElement: " + "<" + element.toString() + ">");
				isClicked = true;
			} catch (Exception e) {
				System.out.println("Unable to wait and click on WebElement, Exception: " + e.getMessage());
				Assert.fail(
						"Unable to wait and click on the WebElement, using locator: " + "<" + element.toString() + ">");
			}
			attempts++;
		}
	}

	public void sendKeysToWebElement(WebElement element, String textToSend) throws Exception {
		try {
			waitUntilWebElementIsVisible(element);
			element.clear();
			element.sendKeys(textToSend);
			
			System.out.println("Successfully Sent the following keys: '" + textToSend + "' to element: " + "<"+ element.toString() + ">");
		} catch (Exception e) {
			System.out.println("Unable to locate WebElement: " + "<" + element.toString()+ "> and send the following keys: " + textToSend);
			Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
		}
	}

	public boolean waitUntilWebElementIsVisible(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			
			System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
			return true;
		} catch (Exception e) {
			System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
			Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
			return false;
		}
	}

	public String waitForSpecificPage(String urlToWaitFor) {
		try {
			wait.until(ExpectedConditions.urlMatches(urlToWaitFor));

			System.out.println("The current URL was: " + driver.getCurrentUrl() + ", " + "navigated and waited for the following URL: " + urlToWaitFor);
			return urlToWaitFor;
		} catch (Exception e) {
			System.out.println("Exception! waiting for the URL: " + urlToWaitFor + ",  Exception: " + e.getMessage());
			return e.getMessage();
		}
	}

}
