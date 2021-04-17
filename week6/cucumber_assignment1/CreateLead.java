package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public ChromeDriver driver;
	List<String> allhandles = new ArrayList<String>();
	List<String> allhandles2 = new ArrayList<String>();
	String leadID;
	String text ;
	String leadIDDelete;
	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Given("Load the application url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Given("Enter the username as {string}")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}

	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click on Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Homepage should be displayed")
	public void homepageVerify() {
		System.out.println("Home Page Displayed");

	}

	@When("Click on crm\\/sfa button")
	public void clickcrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@When("Click on Leads")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();

	}

	@When("Click on Create Lead")
	public void leadClick() {
		driver.findElement(By.linkText("Create Lead")).click();

	}

	@When("Enter the Company Name as {string}")
	public void companyName(String compName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);

	}

	@When("Enter the First Name as {string}")
	public void firstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

	}

	@When("Enter the Last Name as {string}")
	public void lastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

	}

	@Then("Submit button is clicked")
	public void submitButton() {
		driver.findElement(By.name("submitButton")).click();

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

	@When("Click Duplicate Lead button")
	public void duplicateLeadbutton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}

	@When("Click submit button for duplicate lead")
	public void submitDuplicate() {
		driver.findElement(By.name("submitButton")).click();

	}

	@Then("Display Duplicate Lead done")
	public void displayDuplicate() {
		System.out.println("Duplicate Lead Done");
	}

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
	@When("Get Lead Id")
	public void getLeadIdtoDelete() {
		 leadIDDelete = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();

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
