package day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			
		System.setProperty("webdriver.chrome.driver", "C:/Testleaf/Selenium_Workspace/SeleniumSample/drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElementById("userRegistrationForm:userName").sendKeys("testleaf12");
	    driver.findElementById("userRegistrationForm:password").sendKeys("password");
	    driver.findElementById("userRegistrationForm:confpasword").sendKeys("password");
	    WebElement dd = driver.findElementById("userRegistrationForm:securityQ");
	    
	    Select dropdown = new Select (dd);
	    
	    //dropdown.selectByIndex(8);
	    //dropdown.selectByValue("2");
	    dropdown.selectByVisibleText("What is your all time favorite sports team?");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    
	    driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("ambuj");
	    WebElement dd1 = driver.findElementById("userRegistrationForm:prelan");
	    Select dropdown1 = new Select (dd1);
	    dropdown1.selectByValue("en");
	    driver.findElementById("userRegistrationForm:firstName").sendKeys("Magesh");
	    driver.findElementById("userRegistrationForm:middleName").sendKeys("Ma");
	    driver.findElementById("userRegistrationForm:lastName").sendKeys("balu");
	    driver.findElementById("userRegistrationForm:gender:0").sendKeys("Male");
	    driver.findElementById("userRegistrationForm:maritalStatus:1").sendKeys(" Unmarried");
	    driver.findElementById("userRegistrationForm:dobDay").sendKeys("10");
	    driver.findElementById("userRegistrationForm:dobMonth").sendKeys("JUN");
	    driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1986");
	    driver.findElementByName("userRegistrationForm:occupation").sendKeys("SelfEmployed");
	    driver.findElementById("userRegistrationForm:uidno").sendKeys("123456789123456");
	    driver.findElementById("userRegistrationForm:idno").sendKeys("BA67aAgj");
	    driver.findElementById("userRegistrationForm:email").sendKeys("irctc@ictcr.co.in");
	    driver.findElementById("userRegistrationForm:mobile").sendKeys("9999999999");
	    driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
	    driver.findElementById("userRegistrationForm:address").sendKeys("1042");
	    driver.findElementById("userRegistrationForm:street").sendKeys("MM street");
	    driver.findElementById("userRegistrationForm:area").sendKeys("Elavur");
	    WebElement dd3 = driver.findElementByName("userRegistrationForm:countries");
	    Select dropdown3 = new Select(dd3);
	    dropdown3.selectByValue("94");
	    driver.findElementById("userRegistrationForm:pincode").sendKeys("600089",Keys.TAB);
	    //driver.findElementById("userRegistrationForm:statesName").click();
	    Thread.sleep(3000);
	    WebElement dd4 = driver.findElementById("userRegistrationForm:cityName");
	    Select dropdown4 = new Select (dd4);
	    dropdown4.selectByValue("Kanchipuram");
	    Thread.sleep(3000);
	    WebElement dd5 = driver.findElementById("userRegistrationForm:postofficeName");
	    Select dropdown5 = new Select (dd5);
	    dropdown5.selectByValue("Ramapuram S.O (Kanchipuram)");
	    driver.findElementById("userRegistrationForm:landline").sendKeys("0444567890");
	    driver.findElementById("userRegistrationForm:resAndOff:0").sendKeys("Yes");
	    

	}

}
