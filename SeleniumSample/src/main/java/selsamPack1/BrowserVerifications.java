package selsamPack1;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserVerifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Set Property of Browser
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeDriver driver= new ChromeDriver();
	
	// Load the URL
	
	driver.get("http://testleaf.herokuapp.com/");
	
	// Wait for 30 Seconds 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	// Maximize the window 
	
    driver.manage().window().maximize();
    
    //Get the Title of Browser or Window
    
    String title = driver.getTitle();
    
    System.out.println("The title is : "+ title);
    
    //Get the Current URL
    
    String url=driver.getCurrentUrl();
    		System.out.println("The current URL is : "+ url);
    
    //Get the Page Source code
    
    System.out.println("The Soucre code is : "+ driver.getPageSource());
    
    // Get the Attribute Value of "get default text entered."
    driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
    
    System.out.println(driver.findElementByName("username").getAttribute("value"));
    
    // Get the Attribute Value href link."
    driver.get("http://testleaf.herokuapp.com/pages/Link.html");
    
    System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
    
 // Get the CSSValue (Text Color) "
    driver.get("http://testleaf.herokuapp.com/pages/Button.html");
    
    System.out.println(driver.findElementById("color").getCssValue("background-color"));
 
    // Get the getText
    System.out.println(driver.findElementById("color").getText());
    // Get the getLocation
    System.out.println(driver.findElementById("color").getLocation());
    //Get the getLocation X 
    System.out.println(driver.findElementById("color").getLocation().getX());
   //Get the getLocation y
    System.out.println(driver.findElementById("color").getLocation().getY());
    
    // Get the getSize (Dimension) both width and height
    System.out.println(driver.findElementById("color").getSize());
    //Get the getSize Width 
    System.out.println(driver.findElementById("color").getSize().getWidth());
   //Get the getSize height
    System.out.println(driver.findElementById("color").getSize().getHeight());
    //Get the getTagName
    System.out.println(driver.findElementById("color").getTagName());
    
  //Get the element isDisplayed 
   System.out.println(driver.findElementById("color").isDisplayed());
    
   // System.out.println(driver.findElementById("color1").isDisplayed()); //it will throw the error no such element
    
 //Get the element isEnabled 
   driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
   
   System.out.println(driver.findElementByName("username").isEnabled());
   
   System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/div/div/input").isEnabled());
    
   
 //Get the element isSelected 
   driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
   
   System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").isSelected());
   
   System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[1]").isSelected());
   
    driver.close();
    
    
   // System.out.println("The title is : "+ driver.getTitle());
    
   /* if(driver.getTitle().contains("TestLeaf")){
    	System.out.println("I confirm that title has TestLeaf ");
    }else 
    	System.out.println("The title does not contains the word TestLeaf"); */
	

	}

}
