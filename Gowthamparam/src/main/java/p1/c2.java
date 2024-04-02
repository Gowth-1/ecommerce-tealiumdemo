package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class c2 {
	ChromeDriver driver;
	// Data provider - helps with data driven test cases that cary same method but
    //                  run multiple times with different data sets 

    @DataProvider(name = "dhivya")
    public static Object[][] DataSet(){
        // arrayname[row][col]
        Object[][] obj = {
                {"valid", "Dhivyakarthi123", "12345"},//row   00   01  02
                {"invalid", "DDD", "555"},             //row   10   11  12
                {"in", "DEEPA","3456"}
                };
        return obj;
    }

    @Test(dataProvider = "dhivya")// we made the cnnection     
    //first    type=valid   username=Dhivyakarthi123   password=12345
    //second   type=invalid username=DDD               password=555
    //third    type=in      username=DEEPA             password=3456
    public void DataProvSampleTest(String type, String username, String password) throws InterruptedException {
      
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.get("https://www.mycontactform.com/");

        
        // login (used for both valid and invalid case)
        driver.findElementById("user").sendKeys(username);
        driver.findElementById("pass").sendKeys(password);
       driver.findElementByName("btnSubmit").click();

        if(type.equals("valid")){
            System.out.println("in home");
            driver.findElementByLinkText("Logout").click();
            
        }else
            System.out.println("invaliduser");

        Thread.sleep(2000);
        driver.quit();
    }
}
