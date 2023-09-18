package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.HomePage;
import com.base.BaseClass;

public class TC_ValidateMainElements_005 extends BaseClass {
	@Test	
	public void test1() {
		TC_linkTest_001 tc1=new  TC_linkTest_001();//methodc creation for link test
		 tc1.linkTest();//to calln the method that present in link test{
	}
	@Test
public void test2() {
	
	HomePage hp=new HomePage(driver);
	hp.validateTexts();
}
@Test
public void test3() {
	HomePage hp=new HomePage(driver);
	int expect=7;
	int actual=hp.elementsCount();
	Assert.assertEquals(actual, expect);
	
}



}
