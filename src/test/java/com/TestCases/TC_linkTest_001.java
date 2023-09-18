	package com.TestCases;

	import com.base.BaseClass;

	public class  TC_linkTest_001 extends BaseClass//it can access properties from base class 
	{
		@org.testng.annotations.Test
		public void linkTest() {
			
			driver.get("http://demowebshop.tricentis.com");  
			
	}
	}


