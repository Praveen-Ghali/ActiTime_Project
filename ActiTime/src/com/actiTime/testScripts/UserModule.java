package com.actiTime.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.FileLib;
import com.actiTime.pom.UserListPage;

@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class UserModule extends BaseClass{

	@Test
	public void createUser() throws EncryptedDocumentException, IOException {
		//GETTING DATA FROM EXCEL
		FileLib f=new FileLib();
		String fName = f.getCreateUserExceldata("UserDetails", 1, 0);
		String lName = f.getCreateUserExceldata("UserDetails", 1, 1);
		String email = f.getCreateUserExceldata("UserDetails", 1, 2);
		String un = f.getCreateUserExceldata("UserDetails", 1, 3);
		String unPwd = f.getCreateUserExceldata("UserDetails", 1, 4);
		String retypeUnPwd = f.getCreateUserExceldata("UserDetails", 1, 4);
		
		//TO PERFORM ACTIONS ON POM WEBELEMENTS
		UserListPage u=new UserListPage();
		u.getUserTab().click();
		u.getAddUserBtn().click();
		u.getFnameTbx().sendKeys(fName);
		u.getLnameTbx().sendKeys(lName);
		u.geteMailTbx().sendKeys(email);
		u.getUnTbxElement().sendKeys(un);
		u.getPwdTbx().sendKeys(unPwd);
		u.getCopyPwdTbx().sendKeys(retypeUnPwd);
		u.getTimeZoneDD().click();
		u.getTimeZoneDDOpt().click();
		u.getHireDate().click();
		u.getDate().click();
		u.getCreateUserBtn().click();
		
		Reporter.log("user created",true);
		
	}
}
