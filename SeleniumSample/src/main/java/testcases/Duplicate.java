package testcases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class Duplicate extends GenericWrappers {

	@ Test 
	public void MergeLead() throws Exception {
		invokeApp("chrome", "http:\\leaftaps.com");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[contains(text(),'Email')]");
		enterByName("emailAddress", "testleaf@testleaf.com");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByLink("Duplicate Lead");
		verifyTextByXpath("//div[contains(text(),'Duplicate Lead')]", "Duplicate Lead");
		selectVisibileTextById("createLeadForm_dataSourceId", "Conference");  //DropDown
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Automobile");	//DropDown
		//clickByName("submitButton");
		
		//closeBrowser();
		
		
	}
}
