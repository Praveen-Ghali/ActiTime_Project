package com.actiTime.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
	//input[@id='projectPopup_projectNameField']
	
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
	
}
