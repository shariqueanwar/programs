package com.fb.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.fb.pages.OrangeHomepage;
import com.fb.pages.OrangeLoginPage;

import comfb.utilits.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginOrange extends Base {
	
}
//     WebDriver driver;
//     OrangeLoginPage lp;
//     OrangeHomepage hp;
//	@Given("Launch the Browser")
//	public void launch_the_browser() {
//		driver =launchBrowser();
//		lp=new OrangeLoginPage(driver);
//		hp=new OrangeHomepage(driver);
//	}
//	
//	@Given("open the Orange HRM")
//	public void open_the_orange_hrm() {
//	   maxi();
//	   iwait(10);
//	   openUrl("https://opensource-demo.orangehrmlive.com/");
//	}
//
//	
//
//	@When("enter the username and password")
//	public void enter_the_username_and_password() {
//	 type(lp.getUser(), "Admin");
//	 type(lp.getPass(), "admin123");
//	}
//
//	
//
//	@When("clicl the login Button")
//	public void clicl_the_login_button() {
//		tap(lp.getLogin());
//	}
//	
//	@Then("I validate the outcomes")
//	public void i_validate_the_outcomes() {
//	  String text = elementText(hp.getWel());
//	  Assert.assertTrue(text.contains("welcome"));
//	 
//	}
//
//	
//	@Then("close the browser")
//	public void close_the_browser() {
//	   
//	}
//
//	
//}
