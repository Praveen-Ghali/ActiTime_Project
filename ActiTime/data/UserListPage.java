package com.actiTime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.generic.FileLib;

public class UserListPage {
	
	@FindBy(xpath = "//a[@class='content users']")
	private WebElement userTab;
	
	@FindBy(xpath = "//div[@class='buttonText']")
	private WebElement addUserBtn;
	
	@FindBy(id = "userDataLightBox_firstNameField")
	private WebElement fNameTbx;
	
	@FindBy(id="userDataLightBox_lastNameField")
	private WebElement lNameTbx;
	
	@FindBy(id="userDataLightBox_emailField")
	private WebElement eMailTbx;
	
	@FindBy(id = "userDataLightBox_usernameField")
	private WebElement unTbx;
	
	@FindBy(id = "userDataLightBox_passwordField")
	private WebElement pwdTbx;
	
	@FindBy(id = "userDataLightBox_passwordCopyField")
	private WebElement confirmPwdTbx;
	
	@FindBy(id = "userDataLightBox_timeZoneGroupSelectorPlaceholder")
	private WebElement officeDropdown;
	
	@FindBy(xpath = "(//a[@class='x-menu-item'])[4]")
	private WebElement selectSydney;
	
	@FindBy(xpath = "//div[@class='valueCell hireDateValueCell']")
	private WebElement calender;
	
	@FindBy(xpath = "((//table[@class='x-date-inner']//tbody/tr)[5]//span)[1]")
	private WebElement dateBtn;
	
	@FindBy(xpath = "//span[text()='Create User']")
	private WebElement createUserBtn;
	
	public UserListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUserListPage() throws EncryptedDocumentException, IOException {
		FileLib f=new FileLib();
		String fname = f.getCreateUserExceldata("UserDetails", 1, 0);
		String lName = f.getCreateUserExceldata("UserDetails", 1, 1);
		String eMail = f.getCreateUserExceldata("UserDetails", 1, 2);
		String un = f.getCreateUserExceldata("UserDetails", 1, 3);
		String pwd = f.getCreateUserExceldata("UserDetails", 1, 4);
		userTab.click();
		addUserBtn.click();
		fNameTbx.sendKeys(fname);
		lNameTbx.sendKeys(lName);
		eMailTbx.sendKeys(eMail);
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);
		confirmPwdTbx.sendKeys(pwd);
		officeDropdown.click();
		selectSydney.click();
		calender.click();
		dateBtn.click();
		createUserBtn.click();
	
		
	}
}
