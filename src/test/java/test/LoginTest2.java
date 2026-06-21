package test;

import org.testng.annotations.Test;

import base.baseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends baseTest {

	@Test
	public void logintest() {
		
		test.info("Navigating to Login Page");
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);

		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		loginpage.login("Admin", "admin123");
		test.info("Navigating to Home Page");
		homepage.clickRecruitmentandmyInfo();
	}
}
