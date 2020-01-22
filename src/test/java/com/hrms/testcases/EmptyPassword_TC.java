package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;

public class EmptyPassword_TC  extends CommonMethods{

//	@Test
//	public void passwordField() {
//		LoginPage login = new LoginPage();
//		sendText(login.username,"Admin");
//		sendText(login.password, "");
//		click(login.loginButton);
//		
//		String expected ="Password cannot be empty";
//		Assert.assertEquals(login.errMsg.getText(), expected);
//		
//	}
	@Test
	public void negativeLogin() {
		LoginPageElements login = new LoginPageElements();
		sendText(login.username,"admin");
		click(login.submitBtn);
		String expectedError="Password cannot be empty";
		Assert.assertEquals(login.errorMsg.getText(),expectedError);
	}
}
