import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
     //driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("realme");
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("realme");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
         //driver.findElement(Bt.id("only string"))
        //or by name driver.findElemnt()By.name("").sendKeys()
         //orBy.linkText("simply text of link").click();
      //or partial linkedtext
        //By.partiallinktext("give partial name if link name has a long name")
// or by css selector
        //or
      //  driver.findElement(By.cssSelector("#address")),sendkeys()
    //or by classname
        //driver.findElemtn(By.className(.classname)).sendKeys
        //but it is not recomeemended
        //so priority
        //for x path path could be changed div to div 10
        //id is best
        //for link is linktext
        //in the xpath the absolute path be sued




    }
}
