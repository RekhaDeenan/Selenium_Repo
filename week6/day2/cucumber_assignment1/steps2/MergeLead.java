package steps2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLead extends BaseClass {
	List<String> allhandles = new ArrayList<String>();
	List<String> allhandles2 = new ArrayList<String>();
	String text;

	String leadID;

	@When("Click Merge Lead")
	public void mergeLeadClick() {
		driver.findElement(By.linkText("Merge Leads")).click();

	}
	@When("Click From Lead")
	public void fromLeadClick() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

	}
	@When("Get Window Handle for From Lead")
	public void getHandlewWindow() {
	Set<String> allWindows = driver.getWindowHandles();
	allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(1));

	}
		@When("Enter Lead Name as {string}")
		public void enterLead(String fromLeadName) {
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fromLeadName);

		}
		@When("Click find Leads")
		public void findLeadClick() throws InterruptedException {
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(1000);
		}
		@Given("Get LeadID")
		public void getLeadId() {
			leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();

		}
		@When("Click First lead")
		public void firstLead() {
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		}
		@When("Switch back window handle")
		public void switchWindow() {
			driver.switchTo().window(allhandles.get(0));

		}
		 
			@When("Click To lead")
			public void clickToLeadButton() {
				driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

			}
			@When("Get Second Window Handle")
			public void getSecondWindow() {
				Set<String> allWindows2 = driver.getWindowHandles();
				allhandles2 = new ArrayList<String>(allWindows2);
				driver.switchTo().window(allhandles2.get(1));

			}
			@When("Send To Lead Id Name as {string}")
			public void sendToLead(String toLeadName) {
				driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(toLeadName);

			}
			@When("Select First To Lead Id")
			public void selectFirstToLeadId() {
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

			}

			@When("Switch back to Parent Window")
			public void switchParentWindow() {
				driver.switchTo().window(allhandles2.get(0));

			}
			@When("Click Merge button")
			public void clickMerge() {
				driver.findElement(By.xpath("//a[text()='Merge']")).click();

			}

			@When("Alert Accept")
			public void acceptAlert() {
				driver.switchTo().alert().accept();

			}

			@When("Click Search Leads")
			public void searchLead() {
				driver.findElement(By.linkText("Find Leads")).click();

			}

			@When("Send Lead Id")
			public void sendLeadId() {
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);

			}

			@When("Search for entered Lead Id")
			public void searchEnteredId() {
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

			}

			@When("Get the Text Displayed")
			public void getTextDisplayed() {
				text = driver.findElement(By.className("x-paging-info")).getText();

			}

			@Then("Verify text displayed")
			public void verifyTextDisplayed() {
				if (text.equals("No records to display")) {
					System.out.println("Text matched");
				} else {
					System.out.println("Text not matched");
				}

			}


}
