package com.actiTime.pom;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.FileLib;
@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class UserListPage extends BaseClass{
	
	@FindBy(xpath = "//a[@class='content users']")
	private WebElement userTab;
	
	@FindBy(xpath = "//div[@class='buttonText']")
	private WebElement addUserBtn;
	
	@FindBy(id = "userDataLightBox_firstNameField")
	private WebElement fnameTbx;
	
	@FindBy(id = "userDataLightBox_lastNameField")
	private WebElement lnameTbx;
	
	
	
	
	
	
	/*@Test
	public void createUser() throws InterruptedException, EncryptedDocumentException, IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//div[@class='buttonText']")).click();
		//String un="GHALI,PRAVEEN";
		FileLib f=new FileLib();
		
		String fname = f.getCreateUserExceldata("UserDetails", 1, 0);
		String lName = f.getCreateUserExceldata("UserDetails", 1, 1);
		String eMail = f.getCreateUserExceldata("UserDetails", 1, 2);
		String un = f.getCreateUserExceldata("UserDetails", 1, 3);
		String pwd = f.getCreateUserExceldata("UserDetails", 1, 4);
		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(fname);
		driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(lName);
		driver.findElement(By.id("userDataLightBox_emailField")).sendKeys(eMail);
		driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys(un);
		driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys(pwd);
		driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(pwd);
		driver.findElement(By.id("userDataLightBox_timeZoneGroupSelectorPlaceholder")).click();
		driver.findElement(By.xpath("(//a[@class='x-menu-item'])[4]")).click();
		driver.findElement(By.xpath("//div[@class='valueCell hireDateValueCell']")).click();
		driver.findElement(By.xpath("((//table[@class='x-date-inner']//tbody/tr)[5]//span)[1]")).click();
		driver.findElement(By.xpath("//span[text()='Create User']")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		String text = driver.findElement(By.xpath("//tr[@class='userListRow disabled accountPermission settingsPermission customerProjectPermission taskPermission']//span[@class='userNameSpan']")).getText();
		System.out.println(text);
		/*SoftAssert s=new SoftAssert();
		s.assertEquals("GHALI,PRAVEEN", text);
		s.assertAll();*/
		if (text.contains("PRAVEEN")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
		
	}*/
}
