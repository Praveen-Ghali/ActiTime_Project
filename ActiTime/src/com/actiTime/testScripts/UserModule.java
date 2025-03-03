package com.actiTime.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.pom.UserListPage;

@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class UserModule extends BaseClass{

	//@Test
	public void createUser() throws EncryptedDocumentException, IOException {
		UserListPage ulp=new UserListPage()
		
		Reporter.log("User created successfully",true);
	}
}
