package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.HomePage;
import com.base.BaseClass;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TC_LinkVerification_004 extends BaseClass {
	@Test	
	public void test1() {
		TC_linkTest_001 tc1=new  TC_linkTest_001();//methodc creation for link test
		 tc1.linkTest();//to calln the method that present in link test
		 
	}
	@Test
	public void test2() {
		
		
		HomePage hp=new HomePage(driver);
		hp.verifyLinks();
		
		int expectLinks=96;
		System.out.println("expect links = "+expectLinks);
		int actualLinks=hp.linksCount();
		System.out.println("actual links = "+actualLinks);
		Assert.assertEquals(actualLinks, expectLinks);
		
	}
	@Test
	public void test3() {
		
		HomePage hp=new HomePage(driver);
		int display=hp.displayLinks();
		System.out.println( "the display links count ="+display);
	}
	

}
