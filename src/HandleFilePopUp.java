import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFilePopUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.convertfiles.com");


        //https://smallpdf.com/pdf-converter
    //   handlinf file popup
     driver.findElement(By.name("uploadedfile")).sendKeys("C:\\Users\\ABHILASH JADON\\Downloads\\hgfhgfhg.pdf"); // do not click

    }
}
