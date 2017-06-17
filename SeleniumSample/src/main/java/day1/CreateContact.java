package day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Browser
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Load Application Under Test (AUT)
		driver.get("http:\\leaftaps.com");
		// Maximize the Window
		driver.manage().window().maximize();
		// Synchronisation
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Contact").click();
		
		driver.findElementById("firstNameField").sendKeys("Magesh");
		driver.findElementById("lastNameField").sendKeys("Balu");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Magi");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Bala");
		driver.findElementById("createContactForm_personalTitle").sendKeys("Dev");
		driver.findElementById("createContactForm_birthDate").sendKeys("2/1/17");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("Mr");
		driver.findElementById("createContactForm_departmentName").sendKeys("IT");
		WebElement we = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select dropdown = new Select (we);
		dropdown.selectByValue("INR");
		driver.findElementById("createContactForm_accountPartyId").sendKeys("Magi");
		driver.findElementById("createContactForm_description").sendKeys("Descriptions Area");
		driver.findElementById("createContactForm_importantNote").sendKeys("Important Note Area");
		driver.findElementById("createContactForm_primaryPhoneCountryCode").sendKeys("9");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("44");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("43443919");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("1234");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Magesh");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("magesh@testleaf.com");
		driver.findElementById("generalToNameField").sendKeys("Testleaf");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("Balu");
		driver.findElementById("createContactForm_generalAddress1").sendKeys("Porur");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Lakshmi Nagar");
		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		WebElement we3 = driver.findElementById("createContactForm_generalCountryGeoId");
		Select dp1= new Select(we3);
		dp1.selectByValue("IND");
		WebElement we2 = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select dp= new Select(we2);
		
		dp.selectByVisibleText("TAMILNADU");
		System.out.println(dp);
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600089");
		
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("90");
		driver.findElementByName("submitButton").click();
		
		
		
		
		/*
		 * 
		 * Assert.assertEquals("IRCTC Next Generation eTicketing System", driver.getTitle());
		 * 
		 * 
		 * 
		 * driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		String parentWindow = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		for (String wininp : win) {
	    	
	    	driver.switchTo().window(wininp);
	    				
		}
		
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("13705");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(1500);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.switchTo().window(parentWindow);*/
		
		
		
		
		

	}

}
