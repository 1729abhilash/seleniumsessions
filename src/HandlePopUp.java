import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUp {
    public static void main(String[] args) throws InterruptedException {
        //handlejavascriptpopup
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        //handling popup
       Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();

        System.out.println(alert.getText());
        String text=alert.getText();
        //testing
        if(text.equals("Please enter a valid user name"))
        {
            System.out.println("correct alert message");
        }
        else
        {
            System.out.println("incorrect");
        }
        alert.accept();//click ok
        //allert.dismiss()//click on cacel button

    }
}
