package com.hrms.testbase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class DashBoardPageElements extends CommonMethods{

	@FindBy(linkText = "Leave")
	public WebElement leaveLink;

	@FindBy(linkText = "Leave List")
	public WebElement leaveList;

	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateToLeaveList() {
		click(leaveLink);
		click(leaveList);
	}
	
}
