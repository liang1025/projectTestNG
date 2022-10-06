package day3;

import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGHelloWorld {


    @BeforeTest
    public void bfTest() {
        System.out.println("This is BeforeTest");
    }


    @Test(priority = 3)
    public void helloWorldTest01(){
        System.out.println("This is Test01!");
    }

    @Test(priority = 2)
    public void helloWorldTest03(){
        System.out.println("This is Test03!");
    }

    @Test(priority = 1)
    public void helloWorldTest02(){
        System.out.println("This is Test02!");
    }



    @AfterTest
    public void afTest(){
        System.out.println("This is AfterTest!");
    }
}
