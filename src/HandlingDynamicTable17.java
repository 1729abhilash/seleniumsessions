import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandlingDynamicTable17 {
   //when handling dynamic table
    //the path could be change when we add another row
    //there are two ways to handle do this
    //1//is

//    Method – 1:
//            • Iterate row and column and get the cell value.
//• Using for loop
//• Get total rows and iterate table
//• Put if(string matches) then select the respective checkbox
//• Lengthy method
//




    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
           driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://www.freecrm.com/"); // enter URL

        driver.findElement(By.name("username")).sendKeys("naveenk");
        driver.findElement(By.name("password")).sendKeys("test@123");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.switchTo().frame("mainpanel");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

        //*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
        //*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a
        //*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a
        //*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a
   String before_xpath="*[@id='vContactsForm']/table/tbody/tr[";
   String after_xpath="]/td[2]/a";

    for(int i=4;i<8;i++){

       String name= driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
        System.out.println(name)  ;
        if(name.contains("test2 test2")){
            driver.findElement(By.xpath(before_xpath+i+"]/td[1]/input")).click();

        }
    }


        //    Method – 2:
//            • Using custom XPath
//• Using parent and preceding-sibling tags
//• No need to write for loop
//• No full iteration of table
//• Single line statement
//• More dynamic
//• Efficient and fast

//"//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='contact_id']"

        //Method-2:
        driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'ui uiii')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();



    }

    }

