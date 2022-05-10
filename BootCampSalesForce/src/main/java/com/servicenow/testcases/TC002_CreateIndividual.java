package com.servicenow.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.servicenow.pages.LoginPage;

public class TC002_CreateIndividual extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "CreateIndividuals";
		testDescription ="Verify CreateIndividuals";
		authors="Karthick";
		category ="Smoke";
		excelFileName="CreateIndividuals";
		}

	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password, String search, String lName) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickToggleButton()
		.clickViewAllButton()
		.searchButton(search)
		.clickIndividualsButton()
		.clickNewButton()
		.enterLastName(lName)
		.clickSaveButton()
		.verifyName();

	}


}
