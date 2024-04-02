package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterPage {
	@Parameters//({"USER","PASS" })//USER - u, PASS - v
	@Test
	//public void t1() {
		public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://ecommerce.tealiumdemo.com/");
		ob.manage().window().maximize();
		ob.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//id
		String Account = "//a//span[contains(text(),'Account')]";
	
			
		ob.findElementByXPath(Account).click();
//		ob.findElementByLinkText("https://ecommerce.tealiumdemo.com/customer/account/").click();
		//*[@id="nav-link-accountList"]
		//name
		
		String register = "//a[@title = 'Register']";
		ob.findElementByXPath(register).click();
		String firstname = "//input[@id = \"firstname\"]";
		ob.findElementByXPath(firstname).sendKeys("Gowtham");
		
		String lastname = "//input[@id = \"lastname\"]";
		ob.findElementByXPath(lastname).sendKeys("Balsamy");
		
		String email ="//input[@id = \"email_address\"]";
		ob.findElementByXPath(email).sendKeys("agot@gmail.com");
		
		String password ="//input[@id = \"password\"]";
		ob.findElementByXPath(password).sendKeys("abcde123");
		
		String confirmation = "//input[@id = \"confirmation\"]";
		ob.findElementByXPath(confirmation).sendKeys("abcde123");
		
		JavascriptExecutor js = (JavascriptExecutor) ob;
		js.executeScript("window.scrollBy(0,350)", "");
		
		String button ="//button[@title = \"Register\"]";
		ob.findElementByXPath(button).click();
		
		String Expected_title = "Thank you for registering with Tealium Ecommerce.";
		
		
		Assert.assertEquals(ob.getTitle(), Expected_title);	
				
		
		//<a href="https://ecommerce.tealiumdemo.com/customer/account/create/" title="Register">Register</a>
		//input[text()= Email or mobile phone number]
		
		//ob.findElementByLinkText("https://ecommerce.tealiumdemo.com/customer/account/create/").click();

		//ob.findElementById("continue").click();
		//*[@id="continue"]
		//ob.findElementByName("password").sendKeys("");
		
		//classname
		//ob.findElementByClassName("btn_log").click();
		//ob.close();
	}
}

