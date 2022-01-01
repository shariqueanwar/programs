package com.fb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHomepage {

	public OrangeHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="welcome")
	private WebElement wel;
	
	public WebElement getWel() {
		return wel;
	}
	
	
}
