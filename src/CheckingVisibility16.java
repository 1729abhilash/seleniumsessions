import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckingVisibility16 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
     //   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://ssc.nic.in/");
   //1.isDisplayed() method applicable for all the lelements
        boolean b1=driver.findElement(By.id("btnSubmit")).isDisplayed();
        System.out.println(b1);

        boolean b2=driver.findElement(By.id("btnSubmit")).isEnabled();
        System.out.println(b2);

        //selecttextcaptcht checkboc\

        driver.findElement(By.id("txtCaptcha")).sendKeys("12312");
   //now check whether submit button is enbled or not
        driver.findElement(By.id("txtUsername")).sendKeys("95000582460");
        Thread.sleep(2000);
        driver.findElement(By.id("txtPassword")).sendKeys("33435888");


        boolean b3=driver.findElement(By.id("btnSubmit")).isEnabled();
        System.out.println(b3);

        //3. isSelected() method;; only for applicable for checkbox,dropbox,radiobutton
        boolean b4=driver.findElement(By.name("agreeterms")).isSelected();
        System.out.println(b4);

        //de-sleect the dcheckbox;
        driver.findElement(By.id("btnSubmit")).click();


    }
}
