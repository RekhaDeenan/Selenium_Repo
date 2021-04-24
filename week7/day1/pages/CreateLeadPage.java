package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage enterCompanyName(String compName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
return this;
	}
 public CreateLeadPage enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
return this;
}
 public CreateLeadPage enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
return this;
}
 public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
return new ViewLeadPage(driver);
}
}
