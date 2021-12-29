import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
    public static void main(String[] args) {
        //launchin fbroweser
        //geckoDriver
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        //for chrome
      //  System.setProperty("webdriver.chrome.driver","C:\\geckodriver.exe");
   //new ChromeDriver();
        //for safari browers we don;t need do get systemproperties
        WebDriver driver=new ChromeDriver();//implementing webDriver interface
//these are automation

        driver.get("http://www.google.com");
        String title=driver.getTitle();

        //validation point this automation testing
        //testing test cases
        if(title.equals("google")){
            System.out.println("correct title");
        }
        else
        {
            System.out.println("incorrect title");
        }
        System.out.println(title);//Google
        System.out.println(driver.getCurrentUrl());//https://www.google.com/?gws_rd=ssl
        System.out.println(driver.getPageSource());//giveing page sourcce
        driver.quit();//automaticallly closing
    }
}
