package com.servicenow.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

//import Base.BaseClass;

public class CreatedCasePage extends ProjectSpecificMethods {

	// public String toast_msg;
	//public String successmessage;
	//public String newcasenum;

	public CreatedCasePage verifyToastMessage() {
		waitForApperance(locateElement(Locators.XPATH, "//span[@data-aura-class='forceActionsText']"));
		String successmessage = getElementText(
				locateElement(Locators.XPATH, "//span[@data-aura-class='forceActionsText']"));
		reportStep("toast Message is displayed as : " + successmessage, "pass");
		return this;
	}

	public CreatedCasePage verifyNewCase() {
		String newcasenum = getElementText(
				locateElement(Locators.XPATH, "(//p[text()='Case Number']//following::lightning-formatted-text)[1]"));
		reportStep("New case Number is : " + newcasenum, "pass");
		return this;
	}

}
