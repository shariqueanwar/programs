package com.fb.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLogin {

	
	WebDriver driver;
@Given("Launch the Browser")
public void launch_the_browser() {
   WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
}
@Given("Open the Facebook")
public void open_the_facebook() {
  driver.get("https://www.facebook.com/");
  driver.manage().window().maximize();
  
}

@When("enter the {string} and {string}")
public void enter_the_and(String username, String password) {
	 WebElement user = driver.findElement(By.id("email"));
	   user.sendKeys(username);
	   WebElement pas = driver.findElement(By.id("pass"));
	   pas.sendKeys(password);
}

@When("Click the Login button")
public void click_the_login_button() {
    WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
    login.click();
}
@Then("validate the message")
public void validate_the_message() {
   System.out.println("validate the message");
   driver.close();
}
}




