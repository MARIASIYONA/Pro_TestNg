package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.RegistrationPage;
import com.base.BaseClass;

import io.opentelemetry.semconv.trace.attributes.SemanticAttributes.RpcConnectRpcErrorCodeValues;

public class TC_RegisterPge_002  extends BaseClass{
	@Test(priority=1)
	public void test1() {
		 TC_linkTest_001 tc1=new  TC_linkTest_001();//methodc creation for link test
		 tc1.linkTest();//to calln the method that present in link test
		 
	}
	@Test(priority=2)
	public void test2() {
			 
			RegistrationPage rp=new RegistrationPage(driver);//page regisrtration page	
			
			rp.registerUser("Rima","Rose","mariajustinad10@gmail.com");
			rp.userPassword("za1234","za1234");
			rp.register();
		 }
	@Test(priority=3)
	public void testUserVerify() {
		RegistrationPage rp=new RegistrationPage(driver);
		String actualUser=rp.user();
		System.out.println("actual user name is = " +actualUser);
		String expectUser="mariajustinad10@gmail.com";//TO VALIDte the mAIL ID IS REGISTERD WITH
		
		System.out.println("expected user name is = " +expectUser);
		Assert.assertEquals(actualUser, expectUser);
	}

}
