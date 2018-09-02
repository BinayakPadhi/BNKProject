package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.SignUpPage;

public class SignUpTest extends TestBase {

		SignUpPage signuppage;
		
		public SignUpTest()		
		{
			super();
		}
		
		@BeforeMethod
		public void SetUp()
		{
			
			/* Calling Initialization method of TestBase Class to start the driver*/
			initialization();
			
			/* To access the methods and Variable of Login Page, creating the object of Login Page*/
			
			signuppage = new SignUpPage();		
		}
		
		@Test
		public void SignUpPageValidation() throws Exception
		{
			String title = signuppage.ValidateSignUpPage();
			System.out.println("Actual Title is "+title);
			Assert.assertEquals(title, "CRMPRO - CRM Pro for customer relationship management, sales, and support");
			System.out.println("Title Matched");
			signuppage.UserDetails();
			System.out.println("User Details Entered Successfully");
			System.out.println("Thank you!");
			Thread.sleep(2000);
		}
		

		
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
					
		}
		
		
		
}
