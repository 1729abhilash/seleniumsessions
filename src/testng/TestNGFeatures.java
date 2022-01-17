package testng;

import org.testng.annotations.Test;

public class TestNGFeatures {

    @Test
    public void loginTest(){
        System.out.println("login test");

    }
    @Test(dependsOnMethods = "loginTest")//this test will be executed when logii test will get passed
    public void homePageTest(){//if login test doen;t passed then this test will be skipped
        System.out.println("homepagetest");

    }
    @Test
    public void searchPageTest(){

        System.out.println("Searchpagetest");
    }

}
