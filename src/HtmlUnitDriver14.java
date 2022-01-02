import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriver14 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
      //  WebDriver driver = new ChromeDriver();

        WebDriver driver=new HtmlUnitDriver();
   //without opening a browserrrr
//1.testing is happening is behind the scenes--no browser is lauched
        //2.very fast--execution of test cases--very fast
        //3. not suitable for Actions class=user action--mousemovement,doubleClick ,drag and drop
        // 4/ Ghost Driver-- headlessBrowser
        // htmlunit driver
        //phantoshs--javascript



        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());


    }


}
