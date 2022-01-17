package testng;

import org.testng.annotations.Test;

public class invocationCountTest {

    @Test(invocationCount=10)//if i want to run this test how  many times no need to write test cases again and agaian
    public void sum() {
        int a=10;
        int b= 20;
        System.out.println(a+b);
    }
}
