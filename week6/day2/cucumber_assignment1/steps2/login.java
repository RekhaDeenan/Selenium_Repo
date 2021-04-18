
package steps2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends BaseClass
{
	/*
	 * public ChromeDriver driver;
	 * 
	 * @Given("Open the chromebrowser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver(); }
	 * 
	 * @And("Load the Application Url") public void loadAppUrl() {
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * driver.manage().window().maximize(); }
	 */
//@And("Enter the username as DemoSalesManager")
@Given("Enter the username as {string}")
public void enterusername(String uname)
 {
	//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	 driver.findElement(By.id("username")).sendKeys(uname);
 }
//@And Enter the password as crmsfa
@And("Enter the password as {string}")
 public void enterpassword(String pwd)
 {
	//driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.id("password")).sendKeys(pwd);
 }
@When("click on login button")
 public void Loginbutton()
 {
	 driver.findElement(By.className("decorativeSubmit")).click();
 }
@Then("HomePage Should be displayed")
 public void verifyHomePage()
 {
	 String title=driver.getTitle();
	 if(title.equals("Leaf-taps-TestLeaf Automation Platforms"))
	   System.out.println("homePage displayed");
	 
 }
@But("Errormesage Should be displayed")
public void errorHomePage()
{
	 String title=driver.getTitle();
	 if(title.equals("Leaf-taps-TestLeaf Automation Platforms"))
	   System.out.println("homePage displayed");
	 else
		 System.out.println("homePage title not displayed");
	 
}
}