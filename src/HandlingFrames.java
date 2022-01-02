import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandlingFrames {
    public static void main(String[] args) {
        //broweser--page--frame

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.convertfiles.com");
   // driver.manage().window().maximize();//maximize browser
     //dirver.manage().deleteAllCookies();//delete all the cookies


        //dynamic time
       // driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
       //   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    //driver.switchTo().frame("framename");
    //dfriver.find
    }
}
