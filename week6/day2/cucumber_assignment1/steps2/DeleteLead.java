package steps2;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass{
	String leadIDDelete;

	@When("Get Lead Id")
	public void getLeadIdtoDelete() {
		leadIDDelete = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();

	}

	@When("Click on Lead to Delete")
	public void clickToDelete() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}

	@When("Click Delete Button")
	public void ClickDelete() {
		driver.findElement(By.linkText("Delete")).click();

	}

	@When("Click Find Lead to check")
	public void findLeadToCheck() {
		driver.findElement(By.linkText("Find Leads")).click();

	}

	@When("Send lead Id deleted")
	public void sendleadIdToDelete() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadIDDelete);

	}

	@When("Click Find Leads Deleted")
	public void findLeadsDeleted() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}

	@Then("Get Error Message")

	public void deleteErrorMessage() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

}
