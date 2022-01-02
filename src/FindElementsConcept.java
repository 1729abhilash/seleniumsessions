import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsConcept {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com");

        //1.get the total count of links on the page
        //2.get the text of each link on the page

        //alll the linkas are represented by a tag
        List<WebElement> linkList=driver.findElements(By.tagName("a"));

        //size of linklist
       // System.out.println(linkList.size());
        for(int i=0;i<linkList.size();i++)
        {
            System.out.println(linkList.get(i).getText());
        }

    }
}
