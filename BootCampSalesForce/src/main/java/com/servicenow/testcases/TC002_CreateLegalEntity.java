package com.servicenow.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.servicenow.pages.LoginPage;

public class TC002_CreateLegalEntity extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "CreateNewLegal";
		testDescription ="Verify user able to create a new legal entity";
		authors="Tester 1";
		category ="Smoke";
		excelFileName="testdata_create";
	}
	
	@Test(dataProvider = "fetchData")
	public void runcreateLegal(String username, String password, String app, String name) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.ClickToggleIcon()
		.ClickViewAll()
		.EnterAppLauncherName(app)
		.ClickAppLauncher(app)
		.clickLegalEntityMenu()
		.clicknewLegalEntity()
		.enternewname(name)
		.clickSave()
		.verifyCreateLegal();
	}
}
