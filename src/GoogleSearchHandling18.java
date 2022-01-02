import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleSearchHandling18 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com/"); // enter URL
   driver.findElement(By.name("q")).sendKeys("hello");
   Thread.sleep(2000);
  //this is working //List<WebElement> elements=driver.findElements(By.xpath("//ul[@class='G43f7e']//li/div[1]/div[2]/div[1]/span"));
      //this is not working // List<WebElement> elements=driver.findElements(By.xpath("//ul[@class='G43f7e']//li/descendant::div[@class='wM6W7d'])"));
  for(WebElement element:elements)
      System.out.println(element.getText());

    }

    }
