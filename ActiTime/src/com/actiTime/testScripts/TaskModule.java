package com.actiTime.testScripts;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.FileLib;
import com.actiTime.pom.TaskListPage;
@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class TaskModule extends BaseClass {

	@Test
	public void createNewCust() throws EncryptedDocumentException, IOException, InterruptedException{
		TaskListPage cnc=new TaskListPage(driver);
		cnc.getTaskTab().click();
		cnc.getAddUserBtn().click();
		cnc.getNewCustOpt().click();
		FileLib f=new FileLib();
		String actualCustName = f.getCreateTaskExceldata("CreateCustomer", 1, 3);
		cnc.getCustNameTbx().sendKeys(actualCustName);
		String description = f.getCreateTaskExceldata("CreateCustomer", 1, 4);
		cnc.getDescriptionTextArea().sendKeys(description);
		cnc.getActiveCustDropdown().click();
		cnc.getOurCompanyOpt().click();
		cnc.getCreateCustBtn().click();
		String expectedCustName=cnc.getValidateCustName().getText();
		Reporter.log(expectedCustName+" customer is created successfully");
		System.out.println(expectedCustName+" customer is created successfully");
		//SoftAssert s=new SoftAssert();
		//s.assertEquals(actualCustName, expectedCustName);
		//s.assertAll();
		
	}
	@Test
	public void createNewProject() throws EncryptedDocumentException, IOException, InterruptedException {
		TaskListPage cnp=new TaskListPage(driver);
		cnp.getTaskTab().click();
		cnp.getAddUserBtn().click();
		cnp.getNewProjectOpt().click();
		FileLib f=new FileLib();
		String actualProjectName = f.getCreateTaskExceldata("CreateProject", 1, 0);
		cnp.getProjectName().sendKeys(actualProjectName);
		cnp.getSelectCustDD().click();
		cnp.getCustName().click();
		String description = f.getCreateTaskExceldata("CreateProject", 1, 1);
		cnp.getTextArea().sendKeys(description);		
		cnp.getCreateProjectBtn().click();
		String expectedProNmae=cnp.getValidateProjectName().getText();
		Reporter.log(expectedProNmae+" project is created successfully");
		System.out.println(actualProjectName+" project is created successfully");
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualProjectName, actualProjectName);
		s.assertAll();
		
	}
	
}
