package com.service.backend.gluecode;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ServiceGlueCode {

	public static WebDriver driver;

	@Given("^user is on loginpage$")
	public void user_is_on_loginpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8080");
	}

	@When("^user enters name and password$")
	public void user_enters_name_and_password() throws Throwable {
		driver.findElement(By.id("input_name")).sendKeys("Jay");
		driver.findElement(By.id("input_password")).sendKeys("123");
		driver.findElement(By.id("btn_login")).click();
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		String exp_message = "Login Success";
		String actual = driver.findElement(By.id("alert_message")).getText();
		Assert.assertEquals(exp_message, actual);
		driver.quit();
	}
}
