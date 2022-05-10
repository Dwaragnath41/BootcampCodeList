package com.servicenow.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.servicenow.pages.LoginPage;




public class TC002_VerifyAccountsCreation extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyAccountsCreation";
		testDescription ="Verify Accounts Creation functionality with positive data";
		authors="Riyas";
		category ="Smoke";
		excelFileName="CreateAccounts";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String userName, String password, String AccountName) {
		new LoginPage()
		.enterUsername(userName)
		.enterPassword(password)
		.clickLogin()
		.clickAppLauncher()
		.clickViewAllLink()
		.clickOnSalesButton()
		.clickOnAccountsTab()
		.clickOnNewAccounts()
		.enterAccountName(AccountName)
		.clickOnOwnership()
		.clickOnSave()
		.VerifyAccountName();
	}

}
