package day3;

import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGHelloWorld {


    @BeforeTest
    public void bfTest() {
        System.out.println("This is BeforeTest");
    }


    @Test(groups = {"sit"})
    public void helloWorldTest01(){
        System.out.println("This is Test01!");
        Assert.assertEquals(1,2);
    }

    @Test(groups = {"sit"})
    public void helloWorldTest03(){
        System.out.println("This is Test03!");
    }

    @Test(groups = {"dev"},dependsOnGroups = "sit")
    public void helloWorldTest02(){
        System.out.println("This is Test02!");
    }



    @AfterTest
    public void afTest(){
        System.out.println("This is AfterTest!");
    }
}
