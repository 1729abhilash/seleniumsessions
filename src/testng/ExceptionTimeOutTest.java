package testng;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {


    @Test(invocationTimeOut = 2000,expectedExceptions =NumberFormatException.class)//this test case execute within 2
    // seconds
    public void infiniteLoopTest(){//this is exectutin infinite time
       int i=1;
       while(i==1){
           System.out.println(i);
       }
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void test1(){
        String c="100A";
            Integer.parseInt(c);//this test will get passed
        //even though the test is throwing an exception
        //but we were expecting this exception
    }

}
