package testng;

import org.testng.annotations.*;

public class testNGBasics {


//    Setup system property for chrome
//    laucnhing chrome
//    login method

//    Enter url
//    Google title
//    logout from app
//    closing browser
//    delete all cookies
//            generateTestreport
//
//===============================================
//    Default Suite


    @BeforeSuite//1
    public void setUp()
    {
        System.out.println("Setup system property for chrome");
    }

    @BeforeTest//2
    public void launchBrowser()
    {
        System.out.println("laucnhing chrome");
    }
    @BeforeClass//3
    public void login()
    {
        System.out.println("login method");
    }

//@beforemethod
    //@Test1
    //@Aftermethod

    //@beforemethod
    //@test2
    //@aftermethod


    @BeforeMethod//4
public void enterURL()
{
    System.out.println("Enter url");
}




@Test//5
public void googleTitleTest()
{
    System.out.println("Google title");
}

@Test
public void searchTest()//we have two test cases because we have two @test annnotaiton
{
    System.out.println("search test");
}

@AfterMethod//6
    public void logOut()
{
    System.out.println("logout from app");
}
    @AfterClass//7
    public void closeBrowser()
    {
        System.out.println("closing browser");

    }


@AfterTest//8
    public void deleteAllCookies()
{
    System.out.println("delete all cookies");
}


@AfterSuite//9
    public void generateTestReport()
{
    System.out.println("generateTestreport");

}






}
