import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
    //if the site is very heavy it took second to load the whole page
        //so we need heree implicit timedeleay


       //wer are telling to selenim give page second to load the whole the we will do acitons
        // driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        //to particular element for wwait to load particular elements//  d
         // river.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//couple of things you need to do after loading the driveror launchin the broweser
        //maximizr window
        //delete cookies
        //pageloadtime
        //implcit time
        //the perform actions



    }
}
