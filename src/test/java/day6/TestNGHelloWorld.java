package day6;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGHelloWorld {
    @BeforeTest
    public void bfTest() {
        System.out.println("TestNGHelloWorld1 beforeTest!");
    }

    @Test(expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = ".*zero")
    public void helloWorldTest1() {
        System.out.println("TestNGHelloWorld1 Test1!");
        int c = 1 / 0;
        Assert.assertEquals("1", "1");
    }

    @Test()
    @Parameters(value = "para")
    public void helloWorldTest2(@Optional("Tom")String str) {
        Assert.assertEquals("1", "2");
        System.out.println("TestNGHelloWorld1 Test2! "+ str);

    }

    @AfterTest
    public void AfTest() {
        System.out.println("TestNGHelloWorld1 AfterTest!");
    }
}
