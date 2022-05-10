package com.servicenow.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;



public class NewCasePage extends ProjectSpecificMethods {

	public NewCasePage selectContactName() {
		click(locateElement(Locators.XPATH, "(//label//span[text()='Contact Name']//following::input)[1]"));
		click(locateElement(Locators.XPATH, "(//div[@class='primaryLabel slds-truncate slds-lookup__result-text'])[1]"));
		reportStep("Contact Name is selected successfully", "pass");
		return this;
	}

	public NewCasePage selectCaseOrigin(String data) {
		click(locateElement(Locators.XPATH, "(//div//span[text()='Case Origin']//following::a[@class='select'])[1]"));
		click(locateElement(Locators.XPATH, "//a[@role='menuitemradio' and @title='"+data+"']"));
		reportStep(data+" case origin is selected successfully", "pass");
		return this;
	}

	public NewCasePage selectStatus(String data) {
		click(locateElement(Locators.XPATH, "(//label[text()='Status']//following::button)[1]"));
		clickUsingJs(locateElement(Locators.XPATH, "//div//lightning-base-combobox-item[@data-value='"+data+"']"));
		reportStep(data+" status is selected successfully", "pass");
		return this;
	}

	public NewCasePage enterSubject(String data) {
		clearAndType(locateElement(Locators.XPATH, "(//label//span[text()='Subject']//following::input)[1]"), data);
		reportStep(data+" as subject entered successfully","pass");
		return this;
	}

	public NewCasePage enterDescription(String data) {
		clearAndType(locateElement(Locators.XPATH, "(//textarea[@class=' textarea'])[1]"), data);
		reportStep(data+" as description entered successfully","pass");
		return this;
	}

	public CreatedCasePage clickSaveButton() {
		click(locateElement(Locators.XPATH, "(//button//span[text()='Save'])[2]"));
		reportStep("Save button clicked successfully","pass");
		return new CreatedCasePage();
	}

}
