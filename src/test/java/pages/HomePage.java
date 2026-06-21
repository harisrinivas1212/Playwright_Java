package pages;

import com.microsoft.playwright.Page;

public class HomePage {

	private final Page page;
	private final String recruitmentMenu = "text=Recruitment";
	private final String myInfoMenu = "text=My Info";
	
	public HomePage(Page page) {
		this.page = page;
	}
	
	public void clickRecruitmentandmyInfo() {
		page.click(recruitmentMenu);
		page.click(myInfoMenu);
	}

}
