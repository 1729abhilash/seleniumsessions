import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[1]"))).build().perform();
       Thread.sleep(3000);//this is included by hovering it will take time a little
         driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]")).click();
    }
}
