package com.servicenow.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.servicenow.pages.LoginPage;

public class TC003_DeleteLegalEntity extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "DeleteLegal";
		testDescription ="Verify user able to delete the existing legal entity";
		authors="Tester 1";
		category ="Smoke";
		excelFileName="testdata_delete";
	}
	
	@Test(dataProvider = "fetchData")
	public void rundeleteLegal(String username, String password, String app, String name) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.ClickToggleIcon()
		.ClickViewAll()
		.EnterAppLauncherName(app)
		.ClickAppLauncher(app)
		.searchLegalEntity(name)
		.clickDelete()
		.verifyDeleteLegal();
	}
}
