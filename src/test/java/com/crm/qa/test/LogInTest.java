package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LogInTest extends TestBase{
	
	LoginPage LoginPage;
	HomePage homePage;
	
	public LogInTest()
	{
		
		/*Calling Constructor of TestBase Class to Initialize the properties file*/
		super();
		System.out.println("I am going to Cons");
	}
	@BeforeMethod
	public void SetUp()
	{
		
		/* Calling Initialization method of TestBase Class to start the driver*/
		initialization();
		
		/* To access the methods and Variable of Login Page, creating the object of Login Page*/
		
		LoginPage = new LoginPage();		
	}
	
	@Test(priority=1)
	public void validateLoginPageTitle()
	{
		String title = LoginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
		System.out.println("Title Matched");
	}
	
	@Test(priority=2)
	public void EnterLoginPage() throws InterruptedException
	{
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		homePage = LoginPage.Login(username, password);
		System.out.println("User Logged in Successfully");		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
				
	}
}
