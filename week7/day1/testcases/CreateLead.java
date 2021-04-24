package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setFileName() {
		excelFileName = "createLead";
	}

	@Test(dataProvider = "fetchdata")
	public void runCreateLead(String userName, String password, String company, String fName, String lName) {
		new LoginPage(driver).enterUserName(userName).enterPassword(password).clickLoginButton().clickCRMSFAButton()
				.clickLeadsButton().clickCreateLead().enterCompanyName(company).enterFirstName(fName)
				.enterLastName(lName).clickSubmitButton().verifyFirstName();
		System.out.println("Create Lead Done");
	}
}
