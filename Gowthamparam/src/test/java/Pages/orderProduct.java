package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orderProduct  {

//	orderProduct(ChromeDriver ob) {
//		super(ob);
//		// TODO Auto-generated constructor stub
//	}

	static ChromeDriver ob;

	orderProduct(ChromeDriver ob)
	{		this.ob= ob;
	}
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://ecommerce.tealiumdemo.com/");
		ob.manage().window().maximize();
		//WebDriverWait wait =new WebDriverWait(ob, 20);
		ob.manage().timeouts().implicitlyWait(16,TimeUnit.SECONDS) ;
		loginPage lo = new loginPage(ob);
		orderProduct or = new orderProduct(ob);
		lo.login();
		or.order();
		
	}
		public void order()
		{
		
		//FluentWait wait = new FluentWait(ob);
		//wait.until(ExpectedConditions.titleIs("Hello, Gowtham Balsamy!");
		
		
		//ob.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		String men = "(//a[contains(text(), 'Men')])[1]";
		ob.findElementByXPath(men).click();
		
	
		String shirts = "(//a[contains(text(),' Shirts ')])[1]";
		ob.findElementByXPath(shirts).click();
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	WebElement sort = ob.findElementByXPath("(//select[@title = 'Sort By'])[1]");
	Select obj = new Select(sort);
	obj.selectByIndex(2);
	//ob.findElementByXPath(sort).click();
		
		
		//String select = "(//option[contains (text(), 'Price')])[1]";
		//ob.findElementByXPath(select).click();
		
		JavascriptExecutor js = (JavascriptExecutor) ob;
		js.executeScript("window.scrollBy(0,350)", "");
		
		String details = "(//a[@title = 'View Details'])[1]";
	    ob.findElementByXPath(details).click();
	
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //String color = "//label[@id = 'color_label']";
	    //ob.findElementByXPath(color).click();
	   
		String blue = "//img[@alt = 'Blue']";
	    ob.findElementByXPath(blue).click();
	    
		//String size = "//label[@id = 'size_label']";
	    //ob.findElementByXPath(size).click();
	    
		String medium = "//li//span[contains(text(), 'XS')]";
	    ob.findElementByXPath(medium).click();
	   
		String cartbt = "//form//div//button[@title = 'Add to Cart']";
	   ob.findElementByXPath(cartbt).click();
		
	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    
	
	
	}
	
	
	
	}

