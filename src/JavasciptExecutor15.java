import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class JavasciptExecutor15 {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://ssc.nic.in/");
        driver.findElement(By.name("UserName")).sendKeys("234234");
      driver.findElement(By.name("Password")).sendKeys("323");
        driver.findElement(By.id("txtCaptcha")).sendKeys("32sda3");

       WebElement element= driver.findElement(By.id("txtUsername"));
        WebElement element2= driver.findElement(By.id("btnSubmit"));

        System.out.println(element);
 // custom xpath created// driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
//how to highlight the things on a page using javascriptexceutor
//exexutor scirpt==to execute javasript code
        flash(element,driver);//hghlightthe element
        drawBorder(element,driver);
        refreshBrowserByJS(driver);


        // drawBorder(element,driver);//drawing the border
//        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        //now copy the screenchot to desired location using copy file
//        FileUtils.copyFile(src,new File("C:\\Users\\Public\\file.png"));
     //generate allert
      //  generateAlert(driver,"issue with login button");
    //click on elements using javascriptexecutor
    // clickElementByJS(driver,element2);


     //tot referesh the browser
        //this by using selenium
        //driver.navigate().refresh();

        //2.by using js executor



        getPageInnerText(driver);
scrollPageDown(driver);


    }


    public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  10; i++) {
            changeColor("rgb(0,200,0)", element,driver);//1
            changeColor(bgcolor, element,driver);//2
        }
    }
    public static void changeColor(String color, WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(20);
        }  catch (InterruptedException e) {
        }

    }



    public static void drawBorder(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }


    public static void generateAlert(WebDriver driver,String message){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
js.executeScript("alert('"+message+"')");

    }


     //click on elementt on using davascript

    public static void clickElementByJS(WebDriver driver,WebElement element){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
                 js.executeScript("arguments[0].click()",element);

    }


    public static void refreshBrowserByJS(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
       js.executeScript("history.go(0)");

    }


    public static String getTitleByJS(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String title = js.executeScript("return document.title;").toString();
        return title;
    }

    public static String getPageInnerText(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String pageText = js.executeScript("return document.documentElement.innerText;").toString();
        System.out.println(pageText);
        return pageText;
    }

    public static void scrollPageDown(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public static void scrollIntoView(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


}
