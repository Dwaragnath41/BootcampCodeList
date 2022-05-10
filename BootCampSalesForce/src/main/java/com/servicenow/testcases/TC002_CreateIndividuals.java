package com.servicenow.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.servicenow.pages.HomePage;
import com.servicenow.pages.LoginPage;

public class TC002_CreateIndividuals extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		
		testcaseName = "CreateIndividuals";
		testDescription ="Verify new Individual got created";
		authors="Dwaragnath";
		category ="Regression";
		excelFileName="Credentials";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage();
		new HomePage()
		.clickToggle()
		.appLauncher("Individuals");
		

	}
	

}
