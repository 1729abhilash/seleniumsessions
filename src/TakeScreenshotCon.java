import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TakeScreenshotCon {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
//take a screenshot and store as a file format

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //now copy the screenchot to desired location using copy file
        FileUtils.copyFile(src,new File("C:\\Users\\Public\\file.png"));



    }
    }
