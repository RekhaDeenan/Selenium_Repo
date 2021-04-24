package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginAndLogout extends ProjectSpecificMethods {

	@Test(dataProvider = "fetchdata")
	public void verifyLogin(String userName, String password) {
		new LoginPage(driver).enterUserName(userName).enterPassword(password).clickLoginButton();
	}

	@BeforeTest
	public void setFileName() {
		excelFileName = "Login";

	}
}
