import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
     //  driver.get("https://www.google.com/");
     driver.navigate().to("https://www.google.com/");
//backword and forward button these are browser buttons
         //   driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
//back and forward silulation
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();

        //to refresh
      //   driver.navigate().refresh();


        //difference between navigate and get

        //how to take a screenshot

    }
}
