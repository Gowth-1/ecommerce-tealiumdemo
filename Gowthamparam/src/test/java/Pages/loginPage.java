package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginPage {
	static ChromeDriver ob;
	
	loginPage(ChromeDriver ob)
	{		this.ob= ob;
	}
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ob= new ChromeDriver();
		ob.get("https://ecommerce.tealiumdemo.com/");
		ob.manage().window().maximize();
		ob.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;	
//	loginPage lg = new loginPage(ob);
//	lg.login();
	
		
		}
	public void login() {


		
		String Account = "//a//span[contains(text(),'Account')]";
		ob.findElementByXPath(Account).click();
		
		String login = "//a[@title = 'Log In']";
		ob.findElementByXPath(login).click();
		
		
		
		String email = "//input[@title = \"Email Address\"]";
		ob.findElementByXPath(email).sendKeys("agot@gmail.com");
		
		JavascriptExecutor js = (JavascriptExecutor) ob;
		js.executeScript("window.scrollBy(0,350)", "");
		
		String password = "//input[@name = 'login[password]']";
		ob.findElementByXPath(password).sendKeys("abcde123");
		
	String loginbt = "//button[@name = 'send']";
		ob.findElementByXPath(loginbt).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//String Expected_title = "Customer Login";
		
		
		//Assert.assertEquals(ob.getTitle(), Expected_title);	
	}
}