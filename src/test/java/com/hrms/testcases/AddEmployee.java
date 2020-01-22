package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.AddEmployeeElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;

public class AddEmployee extends CommonMethods {

	@Test(groups="regression")
	public void addEmp() throws InterruptedException {
		LoginPageElements login = new LoginPageElements();
		AddEmployeeElements addEmp = new AddEmployeeElements();

		sendText(login.username, "Admin");
		sendText(login.password, "Hum@nhrm123");
		click(login.submitBtn);

		Thread.sleep(3000);

		click(addEmp.PIM);
		click(addEmp.addEmp);
		Thread.sleep(2000);

		sendText(addEmp.firstName, "Deanna");
		sendText(addEmp.middleName, "R");
		sendText(addEmp.lastName, "HGasanova");

		click(addEmp.submitBtn);
		Thread.sleep(3000);

		Assert.assertTrue(addEmp.ID.isDisplayed(), "The element is not displayed");
	}
}
