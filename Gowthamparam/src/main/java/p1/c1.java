package p1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class c1 {

	@Parameters({"USER","PASS" })//USER - u, PASS - v
	@Test
	public void t1(String u,String v) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//id
		ob.findElementById("user").sendKeys(u);
		
		//name
		ob.findElementByName("pass").sendKeys(v);
		
		//classname
		ob.findElementByClassName("btn_log").click();
	}
}
