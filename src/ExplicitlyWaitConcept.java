import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class ExplicitlyWaitConcept {


    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
//explicitly waitng for particular element in a page

//clickOn(driver,driver.findElement(By.xpath()),20);//timeout in seconds



    }



    public static void clickOn(WebDriver driver, WebElement locator,int timeout)
    {
        new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.elementToBeClickable(locator));
  locator.click();
    }


}
