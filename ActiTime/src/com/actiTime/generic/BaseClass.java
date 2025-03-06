package com.actiTime.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actiTime.pom.HomePage;
import com.actiTime.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	@BeforeMethod
	public void login() throws IOException {
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pwd);
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		HomePage hm=new HomePage(driver);
		Thread.sleep(3000);
		hm.setLogout();
	}

}
