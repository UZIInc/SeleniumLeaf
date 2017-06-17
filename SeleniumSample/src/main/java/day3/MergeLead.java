package day3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
		
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				// Load Application Under Test (AUT)
				driver.get("http:\\leaftaps.com");
				// Maximize the Window
				driver.manage().window().maximize();
				// Synchronisation
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.findElementById("username").sendKeys("DemoSalesManager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByPartialLinkText("Leads").click();
				driver.findElementByPartialLinkText("Merge Leads").click();
				driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
				String parentWindow = driver.getWindowHandle();
				Set<String> win = driver.getWindowHandles();
				for (String wininp : win) {
			    	
			    	driver.switchTo().window(wininp);
			    				
				}
				
				driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("13705");
				driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
				Thread.sleep(1500);
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
				driver.switchTo().window(parentWindow);
				driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
				Set<String> win1 = driver.getWindowHandles();
				for (String wininp1 : win1) {
			    	
			    	driver.switchTo().window(wininp1);
			    				
				}
				driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("14783");
				driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
				//Thread.sleep(1500);
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
				driver.switchTo().window(parentWindow);
				driver.findElementByLinkText("Merge").click();
				//Thread.sleep(1000);
				driver.switchTo().alert().accept();
				driver.findElementByLinkText("Find Leads").click();
				driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("UZIMNN123");
				driver.switchTo().window(parentWindow);
				driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
				WebElement errmsg = driver.findElementByXPath("//div[contains(text(),'No records to display')]");
				System.out.println("Error Msg" +errmsg);
				driver.close();
				
	}

}
