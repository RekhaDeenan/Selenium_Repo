package steps2;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{
	
	@When("Click on Leads")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();

	}
	@When("Click on Find Leads")
	public void clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();

	}
	@When("Click on Phone")
	public void clickPhoneNum() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}

	@When("Enter phone number as {string}")
	public void enterPhNum(String phnum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnum);

	}
	@When("Click find Leads button")
	public void clickSearch() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

	}
	@When("Select Lead")
	public void selectLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	@When("Click Edit button")
	public void clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@Given("Enter Company Name as {string}")
	public void enterCompName(String compName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compName);

	}
	@When("Click Submit")
	public void finalEditSubmit() {
		driver.findElement(By.name("submitButton")).click();

	}
	@Then("Display Edit done")
	public void displayEditDone() {
		System.out.println("Edit Done");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
