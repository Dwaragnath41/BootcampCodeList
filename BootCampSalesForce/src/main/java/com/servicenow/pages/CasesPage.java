package com.servicenow.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class CasesPage extends ProjectSpecificMethods {

	public NewCasePage clickNewCase() {
		click(locateElement(Locators.XPATH, "//div[@title='New']"));
		reportStep("New Case button is clicked successfully", "pass");
		return new NewCasePage();
	}

	public CasesPage searchCase(String data) throws InterruptedException {
		clearAndType(locateElement(Locators.XPATH, "//input[contains(@placeholder,'Search this list')]"), data,Keys.ENTER,Keys.ENTER);
		Thread.sleep(5000);
		reportStep("Case is opened successfully", "pass");
		return this;
	}

	public EditCasePage clickEditButton() throws InterruptedException {
		click(locateElement(Locators.XPATH, "//a[contains(@class,'slds-button slds-button--icon-x-small')]"));
		click(locateElement(Locators.XPATH, "//a[@title='Edit']"));
		Thread.sleep(3000);
		return new EditCasePage();
	}

	public CasesPage verifyEditToastMsg() {
		waitForApperance(locateElement(Locators.XPATH, "//span[@data-aura-class='forceActionsText']"));
		String successmessage = getElementText(
				locateElement(Locators.XPATH, "//span[@data-aura-class='forceActionsText']"));
		reportStep("toast Message is displayed as : " + successmessage, "pass");
		return this;
	}
	
	public CasesPage clickDeleteButton() {
		click(locateElement(Locators.XPATH, "//a[contains(@class,'slds-button slds-button--icon-x-small')]"));
		click(locateElement(Locators.XPATH, "//a[@title='Delete']"));
		click(locateElement(Locators.XPATH, "//button//span[text()='Delete']"));
		reportStep("Delete Case is successful", "pass");
		return this;
	}

	public CasesPage verifyDeleteToastMsg() {
		waitForApperance(locateElement(Locators.XPATH, "//span[@data-aura-class='forceActionsText']"));
		String deletesuccessmessage = getElementText(
				locateElement(Locators.XPATH, "//span[@data-aura-class='forceActionsText']"));
		reportStep("Delete toast Message is displayed as : " + deletesuccessmessage, "pass");
		return this;
	}

	
}
