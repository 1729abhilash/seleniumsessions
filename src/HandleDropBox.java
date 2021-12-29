import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://ssc.nic.in/");
    //   Select select=new Select(driver.findElement(By.xpath("/html/body/section[1]/div/div/div/nav/div/nav/ul/li[4]/a")));
      //   select.selectByVisibleText("nameofdropdownfield");
     //  System.out.println(select);
    }
}
