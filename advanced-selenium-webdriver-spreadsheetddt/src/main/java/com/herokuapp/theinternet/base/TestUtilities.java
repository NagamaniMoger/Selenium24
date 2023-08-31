package com.herokuapp.theinternet.base;

import org.testng.annotations.DataProvider;

public class TestUtilities extends BaseTest {
	
	//Static Sleep
	protected void sleep(long millis) {
		try {
			Thread.sleep(millis);
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	@DataProvider(name="files")//we need to specify name here
	protected static Object[][] files() {
		return new Object[][] {
				{1, "logo.png" }, 
				{2, "logo1.jpg"}
				/*
				 * we have 2 files in files folder of src/main/resources so 2 arrays are
				 * mentioned here and we can specify anything inside arrays such as integer, string etc
				 */
		};
	}
}
