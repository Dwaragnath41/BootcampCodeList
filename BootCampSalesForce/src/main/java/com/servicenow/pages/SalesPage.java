package com.servicenow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;



public class SalesPage extends ProjectSpecificMethods {

	public CasesPage selectCasesFromMore() {		
		click(locateElement(Locators.XPATH, "//span[@class='slds-p-right_small' and contains(text(),'More')]"));
		reportStep("More Menu is clicked successfully", "pass");
		clickUsingJs(locateElement(Locators.XPATH, "//span[@class='slds-truncate']//span[text()='Cases']"));
		reportStep("Cases Menu is clicked successfully", "pass");
		return new CasesPage();
	}

}
