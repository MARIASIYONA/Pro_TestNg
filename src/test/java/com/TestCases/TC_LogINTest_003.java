package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.LoginPage;
import com.base.BaseClass;

public class TC_LogINTest_003  extends BaseClass{
	
	
	public LoginPage lp ;
	 
	
	@Test(priority=1)
	public void test1() {
		TC_linkTest_001 tc1=new  TC_linkTest_001();//methodc creation for link test
		 tc1.linkTest();//to calln the method that present in link test
		 
		
		
	}
	 @Test(priority=2)
	public void test2() {
		 lp=new  LoginPage(driver);
		 lp.loginCredentials("mariajustinad10@gmail.com","za1234");
		 lp.logIn();
	 }
	 @Test(priority=3)
	 public void test3() {
		 lp =new LoginPage(driver);
		 
		 String actualUserID= lp.accountVerify();
		 System.out.println("actual user id="+actualUserID);
	    
		 String expectUserID= "mariajustinad10@gmail.com";
		 System.out.println("expect user id="+expectUserID);
		 
		 Assert.assertEquals(actualUserID, expectUserID);
	 
		}
	 
		 
		
		
	}
	
	


