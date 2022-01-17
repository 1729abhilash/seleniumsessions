package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTitleTest {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void googleTitleTest(){
        String title=driver.getTitle();
        System.out.println(title);
   //we are not validating the title whether we aare getting google title or not
        Assert.assertEquals(title,"Google","titile is not matched");

    }

    @Test(priority = 1,groups="Title" )
    public void googleLogoTest(){//for two test cases two times browser will be lauched //two times test caess
        // we dcan define the priority in test cases also
        //test cases are i
        //reort will bbe geenerted by gorups
  //   A  ssert.assertTrue(//we are expecting true);
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
//we can run alll testng clases within an xml file by defining class name in the xml file

}
