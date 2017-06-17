package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    
    driver.get("http:\\leaftaps.com");
    
    driver.manage().window().maximize();
    driver.findElementById("username").sendKeys("DemoCSR");
    driver.findElementById("password").sendKeys("crmsfa");
    driver.findElementByClassName("decorativeSubmit").click();
    driver.findElementByLinkText("CRM/SFA").click();
    driver.findElementByPartialLinkText("Create Lead").click();
    driver.findElementById("createLeadForm_companyName").sendKeys("UZI");
    driver.findElementById("createLeadForm_parentPartyId").sendKeys("DemoLBAcct");
    driver.findElementById("createLeadForm_firstName").sendKeys("MageshB");
    driver.findElementById("createLeadForm_lastName").sendKeys("Balu");
    driver.findElementById("createLeadForm_dataSourceId").sendKeys("Conference");
    driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Car and Driver");
    driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Magi");
    driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Bala");
    driver.findElementById("createLeadForm_personalTitle").sendKeys("Jegan");
    driver.findElementById("createLeadForm_birthDate").sendKeys("2/3/17");
    driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Manager");
    driver.findElementById("createLeadForm_departmentName").sendKeys("UZNEW");
    driver.findElementById("createLeadForm_annualRevenue").sendKeys("34526");
    driver.findElementById("createLeadForm_currencyUomId").sendKeys("INR - Indian Rupee");
    driver.findElementById("createLeadForm_industryEnumId").sendKeys("Aerospace");
    driver.findElementById("createLeadForm_numberEmployees").sendKeys("240");
    driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("LLC/LLP");
    driver.findElementById("createLeadForm_sicCode").sendKeys("UZI006");
    driver.findElementById("createLeadForm_tickerSymbol").sendKeys("UZZI");
    driver.findElementById("createLeadForm_description").sendKeys("Starting ChromeDriver 2.25.426923 (0390b88869384d6eb0d5d09729679f934aab9eed) on port 41784 Only local connections are allowed.");
    driver.findElementById("createLeadForm_importantNote").sendKeys("Notes will be added here");
    driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
    driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
    driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9090908080");
    driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("234");
    driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Magesh");
    driver.findElementById("createLeadForm_primaryEmail").sendKeys("testleam@testleaf.com");
    driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("https://testleafs.com");
    driver.findElementById("createLeadForm_generalToName").sendKeys("Jegan.R");
    driver.findElementById("createLeadForm_generalAttnName").sendKeys("Jegan Rajamanai");
    driver.findElementById("createLeadForm_generalAddress1").sendKeys("1042, Main street");
    driver.findElementById("createLeadForm_generalAddress2").sendKeys("Elavur, Gummidipoondi");
    driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
    driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("TAMILNADU");
    driver.findElementById("createLeadForm_generalPostalCode").sendKeys("601021");
    driver.findElementById("createLeadForm_generalCountryGeoId").sendKeys("India");
    driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("211");
    driver.findElementByName("submitButton").click();
	}

}
