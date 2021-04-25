package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginAndLogout extends ProjectSpecificMethods {

	@Test
	public void verifyLogin() {
		new LoginPage(driver).enterUserName(prop.getProperty("username")).enterPassword(prop.getProperty("password")).clickLoginButton();
	}

	/*
	 * @BeforeTest public void setFileName() { excelFileName = "Login";
	 * 
	 * }
	 */
}
