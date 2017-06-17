package day3;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcNewwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElementByLinkText("Contact Us").click();
	    Assert.assertEquals("IRCTC Next Generation eTicketing System", driver.getTitle());
	    System.out.println(driver.getTitle());
	    Set<String> win = driver.getWindowHandles();
	    
	    for (String eachwin : win) {
	    	
	    	driver.switchTo().window(eachwin);
	    				
		}
	    System.out.println(driver.getTitle());
	    driver.quit();
	}

}
