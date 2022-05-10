package com.servicenow.pages;

import java.io.IOException;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class HomePage extends ProjectSpecificMethods{
	
	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.XPATH, "//span[text()='Home']"));

		reportStep("Homepage is loaded", "pass");
		return this;
	}
	
	public HomePage clickAppLauncher() {		
		click(locateElement(Locators.XPATH, "//*[@class='slds-icon-waffle']"));	
		reportStep("Click App Launcher", "Pass");
		return this;		
	}

	public HomePage clickToggleButton() {
		click(locateElement(Locators.XPATH, "//div[@class='slds-icon-waffle']"));
		reportStep("ToggleButton is clicked", "pass");
		return this;
	}

	public AppLauncherPage clickViewAllButton() {
		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		reportStep("ViewAll button has been clicked", "pass");
		return new AppLauncherPage();
	}

	public AppLauncherPage clickViewAll() {		
		click(locateElement(Locators.XPATH, "//div[@class='slds-icon-waffle']"));
		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		reportStep("View All link clicked successfully", "pass");
		return new AppLauncherPage();
	}
	

	
	
	public HomePage clickViewAllLink() {
		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		reportStep("ViewAll button clicked successfully", "pass");
		return this;
	}
	
	
	public CreateAccountsPage clickOnSalesButton() {
		click(locateElement(Locators.XPATH, "//p[text()='Sales']"));
		reportStep("Sales button clicked successfully", "pass");
		return new CreateAccountsPage();
	}
	
	
	public HomePage clickOnMenuButton() {
		click(locateElement(Locators.XPATH,"//div[@class='slds-icon-waffle']"));
		reportStep("Menu button is clicked", "pass");
		return this;
		
	}
	
	public HomePage clickOnViewAll() {
		click(locateElement(Locators.XPATH,"//button[text()='View All']"));
		reportStep("View All button is clicked", "pass");
		return this;
	}
	
	public SalesHomePage clickOnSales() {
		click(locateElement(Locators.XPATH,"//p[text()='Sales']"));
		reportStep("Sales button is clicked", "pass");
		return new SalesHomePage();
		
	}
	
	public HomePage clickToggle() {
		
		click(Locators.XPATH, "//div[@class='slds-icon-waffle']");
		reportStep("Toggle menu got clicked", "pass");
	    click(Locators.XPATH, "//button[text()='View All']");
	    reportStep("ViewAll got clicked", "pass");
	    return this;
	}
	
	
	public HomePage appLauncher(String data) {
		   
		typeAndEnter(locateElement(Locators.XPATH, "//input[@placeholder='Search apps or items...']"), data);
		reportStep("Search field data got entered", "pass");
		click(locateElement(Locators.XPATH, "//mark[text()='Individuals']"));
		reportStep("Individual text got clicked", "pass");	
		click(locateElement(Locators.XPATH, "(//a[contains(@title,'Individuals')]//following::a)[1]"));
	    reportStep("Click on Individuals link", "pass");
	    pause(5000);
	    clickUsingJs(locateElement(Locators.XPATH,"//span[text()='New Individual']"));
	    pause(5000);
		return this;
	    }

	
	public LegalEntity selectlegal()
	{
		clearAndType(locateElement(Locators.XPATH, "(//input[@type='search'])[3]"), "Legal Entities"); 
		reportStep("Search successfully", "pass");
		click(Locators.XPATH,"//p[@class='slds-truncate']");
		reportStep("Legal Entity is clicked successfully", "pass");		
		return new LegalEntity();
	}

	public HomePage ClickToggleIcon()
	{
		click(Locators.XPATH, "//div[@class='slds-icon-waffle']");
		reportStep("Toggle button is clicked", "pass");
		return this;
	}
	
	public HomePage ClickViewAll()
	{
		click(Locators.XPATH, "//button[text()='View All']");
		reportStep("App is clicked", "pass");
		return this;
	}
	
	public HomePage EnterAppLauncherName(String Appname)
	{
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Search apps or items...']"), Appname);
		reportStep("App is available", "pass");
		return this;
	}
	
	public LegalEnitityPage ClickAppLauncher(String Appname)
	{
		click(Locators.XPATH, "//mark[text()='"+Appname+"']");
		reportStep("App is clicked", "pass");
		return new LegalEnitityPage();
	}
	
	public HomePage clickViewAllOnHome() {		
		click(locateElement(Locators.XPATH, "//button[text()='View All']"));		
		reportStep("Click View All", "Pass");
		return this;		
	}
	
	public WorkTypesGroupPage selectWorkTypeApp() throws IOException {				
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Search apps or items...']"), "Work Type");
		click(locateElement(Locators.XPATH, "//p[text()=' Groups']"));
		reportStep("Select Work Type App", "Pass");
        return new WorkTypesGroupPage();
	}
}

