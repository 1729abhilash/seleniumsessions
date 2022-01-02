import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

          Actions action=new Actions(driver);
          //if there is frame element you should do switch to frame first
        //  action.clickAndHold(driver.findElement(By.xpath())).moveToElement(driver.findElement(By.xpath())).release().build().perform();


    }
}
