package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

	private final Page page;
	private final String usernameTextBox = "input[name='username']";
	private final String passwordTextBox = "input[name='password']";
	private final String loginButton = "button[type='submit']";
	
	public LoginPage(Page page) {
		this.page = page;
	}
	
	public void login(String username, String password) {
		page.fill(usernameTextBox, username);
		page.fill(passwordTextBox, password);
		page.click(loginButton);
	}
}
