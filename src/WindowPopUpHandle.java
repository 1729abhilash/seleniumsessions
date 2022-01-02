import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class WindowPopUpHandle {


    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
      //driver.findElement(By.xpath()).clik();
        //now another window gets opened
        ///handling popup
        //which mean anothoer window get opened
        //with a different url

        //we need to use window api
        //we shoudl get first window
        Set<String> handler=driver.getWindowHandles();
        Iterator<String> it=handler.iterator();

        String parentWindowId=it.next();
        String childWindowId=it.next();
        //we get both window ids
        driver.switchTo().window(childWindowId);

        driver.close();
        driver.switchTo().window(parentWindowId);


    }
}
