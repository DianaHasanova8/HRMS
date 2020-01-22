package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class LoginPageElements extends BaseClass  {

	@FindBy(xpath = "//div[@id='divLogo']")
	public WebElement logo;

	@FindBy(id = "logInPanelHeading")
	public WebElement loginBtn;

	@FindBy(name = "txtUsername")
	public WebElement username;

	@FindBy(css = "input#txtPassword")
	public WebElement password;

	@FindBy(css = "input[name='Submit']")
	public WebElement submitBtn;

	@FindBy(id = "spanMessage")
	public WebElement errorMsg;

	public LoginPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void loginToPage() {
		
	}
}
