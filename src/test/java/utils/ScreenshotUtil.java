package utils;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.microsoft.playwright.Page;

public class ScreenshotUtil {

	public static String takeScreenshot(Page page, String testname) {
		
		String timestamp = new SimpleDateFormat("yyyMMdd_HHmmss").format(new Date());
		
		String path = "test-output/screenshots/"+testname+"_"+timestamp+".png";
		
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(false));
		
		return path;
		
	}
}
