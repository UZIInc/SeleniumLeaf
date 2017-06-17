package testcases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class DuplicateLead extends GenericWrappers {

	@ Test 
	public void MergeLead() throws Exception {
		invokeApp("chrome", "http:\\leaftaps.com");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", "11485");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToParentWindow();
		Thread.sleep(3000);
		clickByXpath("(//img[@alt='Lookup'])[2]");
		
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", "16780");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToParentWindow();
		clickByLinkNoSnap("Merge");
		//Thread.sleep(3000);
		acceptAlert();
		clickByLink("Duplicate Lead");
		selectVisibileTextById("createLeadForm_dataSourceId", "Conference");  //DropDown
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Automobile");	//DropDown
		clickByName("submitButton");
		//closeBrowser();
		
		
	}
}
