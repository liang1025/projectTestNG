package day3;

import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGHelloWorld {


    @BeforeTest
    public void bfTest() {
        System.out.println("This is BeforeTest");
    }


    @Test
    @Parameters(value = "yihuqingjiu")
    public void helloWorldTest01(@Optional("温一壶清酒") String str){
        System.out.println("This is Test01!" + str);
    }

    @Test
    public void helloWorldTest02(){
        System.out.println("This is Test02!");
    }

    @Test
    public void helloWorldTest03(){
        System.out.println("This is Test03!");
    }





    @AfterTest
    public void afTest(){
        System.out.println("This is AfterTest!");
    }
}
