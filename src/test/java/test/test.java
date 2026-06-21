package test;

import org.testng.annotations.Test;

import base.baseTest;

public class test extends baseTest {

	@Test
	public void verifyTitle() {
		page.navigate("https://www.google.com/ncr");
		page.waitForTimeout(5000);
        System.out.println("The title of the page is "+page.title());
		
	}
	

}
