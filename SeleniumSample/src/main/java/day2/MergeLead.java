package day2;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com");
		driver.manage().window().maximize(); // Mimimize() is Added , it will maximize the browser window after url is loaded
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> allwin=driver.getWindowHandles();
		
		System.out.println(driver.getTitle());
		
		for (String each : allwin) {
			
			driver.switchTo().window(each);
		
		}
		
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("11364");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(1500);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		driver.switchTo().window(parent);
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		Set<String> allwin1=driver.getWindowHandles();
		//String parent1=driver.getWindowHandle();
		//System.out.println(driver.getTitle());
		for (String each1 : allwin1) {
			
		driver.switchTo().window(each1);
		
		}
		
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("11371");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a)").click();
		Thread.sleep(1500);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.switchTo().window(parent);
		driver.findElementByLinkText("Merge").click();
		Alert alr=driver.switchTo().alert();
		Thread.sleep(1500);
		alr.accept();
		

	}

}
