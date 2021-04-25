package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUserName(String username) {
		driver.findElement(By.id(prop.getProperty("LoginPage.username.id"))).sendKeys(username);
		return this;

	}

	public LoginPage enterPassword(String password) {
		driver.findElement(By.id(prop.getProperty("LoginPage.password.id"))).sendKeys(password);
		return this;
	}

	public HomePage clickLoginButton() {
		driver.findElement(By.className(prop.getProperty("LoginPage.login.className"))).click();
		return new HomePage(driver);

	}
}
