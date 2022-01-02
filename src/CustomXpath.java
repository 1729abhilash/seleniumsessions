import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       //input[@cclass="acyrcynodc"]  thiis custom xpath
        //or  input[@name="query"]
        //or //input[contains(@class,"classname")]
        //input is tag acrdsf is classname

       //dynamic id
        //id is not constant
        //id getting changed every time we load
        //id=test_12
        //id=test_34
      //  driver.findElement(By.xpath("//input[contains(@id,'test_'')]")).sendKeys("java");
//driver.findElement(By.xpath("//input[starts-with(@id,'test_'')]")).sendKeys("java");
//driver.findElement(By.xpath("//input[ends-with(@id,'test_'')]")).sendKeys("java");

        //for links:custom xpath
        //all the links are start by a
        driver.findElement(By.xpath("//a[contains(text(),'myaccount')]")).click();


    }
}
