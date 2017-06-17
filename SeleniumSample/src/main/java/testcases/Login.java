package testcases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class Login extends GenericWrappers {

	@Test
	public void login() throws Exception {

		invokeApp("chrome", "http://leaftaps.com");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "TestLeaf");
		enterById("createLeadForm_firstName", "Magesh");
		enterById("createLeadForm_lastName", "Balu");
		selectVisibileTextById("createLeadForm_dataSourceId", "Conference");  //DropDown
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Automobile");	//DropDown
		enterById("createLeadForm_firstNameLocal", "Magi");
		enterById("createLeadForm_lastNameLocal", "TRK");
		enterById("createLeadForm_personalTitle", "Dev");
		enterById("createLeadForm_birthDate", "02/16/17");
		enterById("createLeadForm_generalProfTitle", "Soft");
		enterById("createLeadForm_departmentName", "IT");
		enterById("createLeadForm_annualRevenue", "2000");
		selectVisibileTextById("createLeadForm_currencyUomId", "INR - Indian Rupee"); //DropDown
		selectVisibileTextById("createLeadForm_industryEnumId", "Computer Software"); //DropDown
	    enterById("createLeadForm_numberEmployees", "250");
        selectVisibileTextById("createLeadForm_ownershipEnumId", "Corporation"); //DropDown
	    enterById("createLeadForm_sicCode", "UZI001");
	    enterById("createLeadForm_tickerSymbol", "UZISYM");
	    enterById("createLeadForm_description", "Description area");
	    enterById("createLeadForm_importantNote", "importantNote Area");
	    enterById("createLeadForm_primaryPhoneCountryCode", "91");
	    enterById("createLeadForm_primaryPhoneAreaCode", "044");
	    enterById("createLeadForm_primaryPhoneNumber", "43420500");
	    enterById("createLeadForm_primaryPhoneExtension", "0500");
	    enterById("createLeadForm_primaryPhoneAskForName", "Magesh");
	    enterById("createLeadForm_primaryEmail", "testleaf@.com");
	    enterById("createLeadForm_primaryWebUrl", "https://testleafs.com");
	    
	    
	    enterById("createLeadForm_generalToName","Jegan.R");
	    enterById("createLeadForm_generalAttnName","Jegan Rajamanai");
	    enterById("createLeadForm_generalAddress1","1042, Main street");
	    enterById("createLeadForm_generalAddress2","Elavur, Gummidipoondi");
	    enterById("createLeadForm_generalCity","Chennai");
	    selectVisibileTextById("createLeadForm_generalCountryGeoId","India");
	    
	    selectVisibileTextById("createLeadForm_generalStateProvinceGeoId","TAMILNADU");
	    enterById("createLeadForm_generalPostalCode","601021");
	  //  selectVisibileTextById("createLeadForm_generalCountryGeoId","India");
	   
        enterById("createLeadForm_generalPostalCodeExt","211");
        
	    clickByClassName("smallSubmit");
		//closeBrowser();




	}

}
