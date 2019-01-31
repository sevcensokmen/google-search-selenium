package com.github.sevcensokmen.googlesearch.pageobject;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GooglePage extends BasePage {

	public @FindBy(xpath = "//input[@type='text']") WebElement textfield_searchValue;
	public @FindBy(how = How.NAME, using = "btnK") WebElement search_button;
	public @FindBy(xpath = "//h3[@class='r']/a)[3]") WebElement listValues;

	public GooglePage() throws IOException {
		super();
	}

	public void getGooglePage(String url) throws Exception {
		loadUrl(url);
	}

	public void enterSearchValue(String searchValue) throws Exception {
		sendKeysToWebElement(textfield_searchValue, searchValue);
	}

	public void clickEnterButton() throws Exception {
		waitAndClickElement(search_button);
	}

	public void getResultCategory() throws Exception {
		int size = getDriver().findElements(By.cssSelector("[valign='top'] > td")).size();

		for (int j = 1; j < size; j++) {
			if (j > 1) { // skip first
				getDriver().findElement(By.cssSelector("[aria-label='Page " + j + "']")).click();
			}
		}
	}

	public void getResultAccuracy(String accuracy) throws Exception {
		assertThat(getDriver().findElement(By.tagName("body")).getText(), containsString(accuracy));
	}

}
