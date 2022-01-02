import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile
{
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
       String path= System.getProperty("user.dir");;
        FileInputStream ip=new FileInputStream(path+"\\src\\config.properties");

        System.out.println(ip);
        prop.load(ip);
        System.out.println(prop.getProperty("name"));
   //if the property is not available then it will return null
    //Str  ing url=prop.getProperty("URL");
       // String browserName=prop.getProperty("browseer")

//
//        if(browserName.equals("chrome")){
//            System.setProperty("web.driver","path")
//            Webdriver drivew=new ChromeDriver()''
//        }
       // elseif(it firefoc the n lauch firefox)
  // driver.get(url);
  // driver.findElement(By.xpath(prop.getProperty("xpathname"))).sendkeys(prop.getProperty("name"))


    }
}
