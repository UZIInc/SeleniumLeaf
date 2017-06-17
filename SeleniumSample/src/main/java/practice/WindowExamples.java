package practice;



import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowExamples {
	static WebDriver driver;

	@Test
	public void test_CloseAllWindowsExceptMainWindow() {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();

        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// It will open Naukri website with multiple windows
		driver.get("http://www.naukri.com/");
		
		// To get the main window handle
		String windowTitle= getCurrentWindowTitle();
		String mainWindow = getMainWindowHandle(driver);
		Assert.assertTrue(closeAllOtherWindows(mainWindow));
		//Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"), "Main window title is not matching");
	}
		
	public String getMainWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}

	public String getCurrentWindowTitle() {
		String windowTitle = driver.getTitle();
		return windowTitle;
	}
	
	//To close all the other windows except the main window.
	public static boolean closeAllOtherWindows(String openWindowHandle) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) {
			if (!currentWindowHandle.equals(openWindowHandle)) {
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		}
		
		driver.switchTo().window(openWindowHandle);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}
}