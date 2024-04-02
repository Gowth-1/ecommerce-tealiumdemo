package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkout {

	static ChromeDriver ob;
	Checkout(ChromeDriver ob)
	{		
		this.ob= ob;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://ecommerce.tealiumdemo.com/");
		ob.manage().window().maximize();
		//WebDriverWait wait =new WebDriverWait(ob, 20);
		ob.manage().timeouts().implicitlyWait(16,TimeUnit.SECONDS) ;
		loginPage lo = new loginPage(ob);
		orderProduct od = new orderProduct(ob);
		Checkout ch = new Checkout(ob);
		lo.login();
		od.order();
		ch.check();
	}
		
		public void check()
		{
			
		String Checkout = "(//button[@title = 'Proceed to Checkout'])[1]";
		ob.findElementByXPath(Checkout).clear();
		ob.findElementByXPath(Checkout).click();
		
		String address = "(//input[@title = 'Street Address'])[1]";
		ob.findElementByXPath(address).clear();
		ob.findElementByXPath(address).sendKeys("Palayam");
		
		String city = "(//input[@title = 'City'])[1]";
		ob.findElementByXPath(city).clear();
		ob.findElementByXPath(city).sendKeys("Cbe");
		
		
	//WebElement state = ob.findElementByXPath"(//input[@title = 'State/Province'])[1]")(;
	//Select obj = new Select(state);
	//obj.selectByVisibleText("New York");
		String state = ("(//input[@title = 'State/Province'])[1]");
		ob.findElementByXPath(state).clear();
		ob.findElementByXPath(state).sendKeys("TN");
		
	
	
		
		String zip = "(//input[@title = 'Zip/Postal Code'])[1]";
		ob.findElementByXPath(zip).clear();
	ob.findElementByXPath(zip).sendKeys("1040");
	
	WebElement country = ob.findElementByXPath("//select[@name = 'billing[country_id]']");
	Select obj1 = new Select(country);
	obj1.selectByVisibleText("India");
	//ob.findElementByXPath("//select[@name = 'billing[country_id]']";)
	
	String Tele = "//input[@name = 'billing[telephone]']";
	ob.findElementByXPath(Tele).clear();
	ob.findElementByXPath(Tele).sendKeys("9876543210");
	
	String contbt = "(//button[@title =\"Continue\"])[1]";
	ob.findElementByXPath(contbt).clear();
	ob.findElementByXPath(contbt).click();
	
	
	}

}
