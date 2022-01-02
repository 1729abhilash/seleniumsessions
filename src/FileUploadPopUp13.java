import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUploadPopUp13

{
//1.alerts---javascriptpopup
    //2.fileUpdloadpopup----browserbutton if type is=file sendkeys
    //3.browser window popup--afvertisment pop up (window handler api getWidnowss)

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    // driver.findElement(By.xpath()).sendKeys("C://Usersfie; path");
//should never click on file there would be defientiy type present should present in html tag

    }


}
