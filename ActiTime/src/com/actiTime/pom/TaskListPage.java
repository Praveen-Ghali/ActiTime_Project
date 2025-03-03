package com.actiTime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.actiTime.generic.FileLib;

public class TaskListPage {
	//CREATE NEW CUSTOMER:
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement taskTab;
	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addUserBtn;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustOpt;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement custNameTbx;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement descriptionTextArea;
	
	@FindBy(className = "x-btn-text")
	private WebElement activeCustDropdown;
	
	@FindBy(xpath = "//a[@class='x-menu-item' and contains(text(),'Our Company')]")
	private WebElement ourCompanyOpt;
	
	@FindBy(xpath = "//span[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath = "//a[text()='All Customers']/../../div[@class='title ellipsis']")
	private WebElement validateCustName;
	
	
	//CREATE NEW PROJECT:
	@FindBy(xpath = "//div[@class='item createNewProject ellipsis']")
	private WebElement newProjectOpt;
	
	@FindBy(xpath = "//input[@id='projectPopup_projectNameField']")
	private WebElement projectName;
	
	@FindBy(xpath = "//button[contains(text(),'Please Select Customer')]/../../../..")
	private WebElement selectCustDD;
	
	@FindBy(xpath ="//a[contains(text(),'Please Select Customer')]/../../..//a[text()='KARNATAKA BANK']")
	private WebElement custName;
	
	@FindBy(id = "projectPopup_projectDescriptionField")
	private WebElement textArea;
	
	@FindBy(xpath = "//span[text()='Create Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath = "//a[@class='allCustomers']/../../div[@class='title ellipsis']")
	private WebElement validateProjectName;
	
	//CREATING CONSTRUCTOR:
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
			
	}

	//CREATING GETTER METHOD:
	
	public WebElement getTaskTab() {
		return taskTab;
	}

	public WebElement getAddUserBtn() {
		return addUserBtn;
	}

	public WebElement getNewCustOpt() {
		return newCustOpt;
	}

	public WebElement getCustNameTbx() {
		return custNameTbx;
	}

	public WebElement getDescriptionTextArea() {
		return descriptionTextArea;
	}

	public WebElement getActiveCustDropdown() {
		return activeCustDropdown;
	}

	public WebElement getOurCompanyOpt() {
		return ourCompanyOpt;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}

	public WebElement getValidateCustName() {
		return validateCustName;
	}

	public WebElement getNewProjectOpt() {
		return newProjectOpt;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getCustName() {
		return custName;
	}

	public WebElement getTextArea() {
		return textArea;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getValidateProjectName() {
		return validateProjectName;
	}
	
	
	
	/*public void getNewCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		FileLib f=new FileLib();
		taskTab.click();
		addUserBtn.click();
		newCustOpt.click();
		String actualCustName = f.getCreateTaskExceldata("CreateCustomer", 1, 3);
		custNameTbx.sendKeys(actualCustName);
		String description = f.getCreateTaskExceldata("CreateCustomer", 1, 4);
		descriptionTextArea.sendKeys(description);
		activeCustDropdown.click();
		ourCompanyOpt.click();
		createCustBtn.click();
		Thread.sleep(2000);
		String expectedCustName = validateCustName.getText();
		Reporter.log(expectedCustName+" customer is created successfully");
		System.out.println(expectedCustName+" customer is created successfully");
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualCustName, expectedCustName);
		s.assertAll();
		
		
	}
	public void getNewProject() throws EncryptedDocumentException, IOException, InterruptedException {
		FileLib f=new FileLib();
		taskTab.click();
		addUserBtn.click();
		newProjectOpt.click();
		String actualProjectName = f.getCreateTaskExceldata("CreateProject", 1, 0);
		projectName.sendKeys(actualProjectName);
		selectCustDD.click();
		custName.click();
		String description = f.getCreateTaskExceldata("CreateProject", 1, 1);
		textArea.sendKeys(description);
		createProjectBtn.click();
		Thread.sleep(3000);
		String expectedProNmae = validateProjectName.getText();
		Reporter.log(expectedProNmae+" project is created successfully");
		System.out.println(actualProjectName+" project is created successfully");
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualProjectName, actualProjectName);
		s.assertAll();
	}*/
}
