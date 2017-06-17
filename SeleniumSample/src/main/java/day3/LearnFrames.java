package day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	    
	    driver.manage().window().maximize();
	    
	   // driver.switchTo(iframeResult);
	    driver.switchTo().frame("iframeResult");
	    driver.findElementByXPath("/html/body/button").click();
	    Alert alt = driver.switchTo().alert();
	    Thread.sleep(1500);
	    alt.sendKeys("Hi Magesh");
	    alt.accept();
	   String txt = driver.findElementById("demo").getText();
	    try {
			if (txt.contains("123"))
			{
				System.out.println("I confirm that the text contains" + txt);
			}
			else 
				System.out.println("I Confirm that the text not present Here as Mag  contains");
		} catch (WebDriverException e) {
			
			System.out.println("The Error Msg is" +e);
			System.err.println(e);
		}
	    	
	    }
	    
	    
	    
	    
	    

	}


