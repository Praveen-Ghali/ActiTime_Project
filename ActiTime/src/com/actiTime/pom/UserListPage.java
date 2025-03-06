package com.actiTime.pom;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.generic.BaseClass;
public class UserListPage extends BaseClass{
	
	@FindBy(xpath = "//a[@class='content users']")
	private WebElement userTab;
	
	@FindBy(xpath = "//div[@class='buttonText']")
	private WebElement addUserBtn;
	
	@FindBy(id = "userDataLightBox_firstNameField")
	private WebElement fnameTbx;
	
	@FindBy(id = "userDataLightBox_lastNameField")
	private WebElement lnameTbx;
	
	@FindBy(id = "userDataLightBox_emailField")
	private WebElement eMailTbx;
	
	@FindBy(id = "userDataLightBox_usernameField")
	private WebElement unTbxElement;
	
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement pwdTbx;
	
	@FindBy(id = "userDataLightBox_passwordCopyField")
	private WebElement copyPwdTbx;
	
	@FindBy(id = "userDataLightBox_timeZoneGroupSelectorPlaceholder")
	private WebElement timeZoneDD;
	
	@FindBy(xpath = "(//a[@class='x-menu-item'])[4]")
	private WebElement timeZoneDDOpt;
	
	@FindBy(xpath = "//div[@class='valueCell hireDateValueCell']")
	private WebElement hireDate;
	
	@FindBy(xpath = "((//table[@class='x-date-inner']//tbody/tr)[5]//span)[1]")
	private WebElement date;
	
	@FindBy(xpath = "//span[text()='Create User']")
	private WebElement createUserBtn;
	
	public UserListPage() {
		PageFactory.initElements(driver, this);
	}

	
	//TO CREATE GETTER METHODS
	public WebElement getUserTab() {
		return userTab;
	}

	public WebElement getAddUserBtn() {
		return addUserBtn;
	}

	public WebElement getFnameTbx() {
		return fnameTbx;
	}

	public WebElement getLnameTbx() {
		return lnameTbx;
	}

	public WebElement geteMailTbx() {
		return eMailTbx;
	}

	public WebElement getUnTbxElement() {
		return unTbxElement;
	}

	public WebElement getPwdTbx() {
		return pwdTbx;
	}

	public WebElement getCopyPwdTbx() {
		return copyPwdTbx;
	}

	public WebElement getTimeZoneDD() {
		return timeZoneDD;
	}

	public WebElement getTimeZoneDDOpt() {
		return timeZoneDDOpt;
	}

	public WebElement getHireDate() {
		return hireDate;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getCreateUserBtn() {
		return createUserBtn;
	}
	
}
