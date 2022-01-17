import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class CalendarSelect19 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/"); // enter URL
//the calendear was avaulable on frima o nt hat webstie

        driver.switchTo().frame("mainpanel");
   String date="18-September-2017";
   String dateArr[]=date.split("-");
    String day=dateArr[0];
    String month=dateArr[1];
    String year=dateArr[2];

        Select selectMonth=new Select(driver.findElement(By.name("adfdf")));//there was a dropdown to choose month and year
        selectMonth.selectByVisibleText(month);

        Select selectYear=new Select(driver.findElement(By.name("name id")));//there was a dropdown to choose month and year
        selectYear.selectByVisibleText(year);

        //*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
        //*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
        //*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]

        String beforeXpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
        String afterXpath = "]/td[";

        final int totalWeekDays = 7;

        //2-1 2-2 2-3 2-4 2-5 2-6 2-7
        //3-2 3-2 3-3 3-4 3-5 3-6 3-7
        boolean flag = false;
        String dayVal = null;
        for(int rowNum=2; rowNum<=7; rowNum++){

            for(int colNum = 1; colNum<=totalWeekDays; colNum++){
                try{
                    dayVal =driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
                }catch (NoSuchElementException e){
                    System.out.println("Please enter a correct date value");
                    flag = false;
                    break;
                }
                System.out.println(dayVal);
                if(dayVal.equals(day)){
                    driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }

        }



    }
    }
