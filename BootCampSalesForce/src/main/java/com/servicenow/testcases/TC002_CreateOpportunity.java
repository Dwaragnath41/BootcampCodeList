package com.servicenow.testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.servicenow.pages.LoginPage;


public class TC002_CreateOpportunity extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Create New Opportuity";
		testDescription ="Verify if user is able to create a new opportunity";
		authors="Balaji";
		category ="Regression";
		excelFileName="OpportunityDetails";
	}
	
	@Test(dataProvider = "fetchData")
	public void createOpportunity(String username, String password, String oppName) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickOnMenuButton()
		.clickOnViewAll()
		.clickOnSales()
		.clickOnOpportunity()
		.clickOnNew()
		.enterOppoturnityname(oppName)
		.enterCurrentDate()
		.selectStageDropdown()
		.clickOnSave()
		.verifyNewOpportunityCreated(oppName);
		

	}

}
