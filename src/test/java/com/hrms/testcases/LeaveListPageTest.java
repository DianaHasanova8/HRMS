package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.testbase.DashBoardPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LeaveListPageTest extends CommonMethods {

	@Test(groups = "regression")
	public void leaveLabelValidation() throws InterruptedException {
		LoginPageElements login = new LoginPageElements();
		DashBoardPageElements dashboard = new DashBoardPageElements();
		LeaveListPageElements leaveList = new LeaveListPageElements();

		sendText(login.username,ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));

		click(login.submitBtn);
		jsClick(dashboard.leaveLink);
		jsClick(dashboard.leaveList);
		Assert.assertTrue(leaveList.leaveListLabel.isDisplayed(), "Label is NOT displayed");
	}
}
