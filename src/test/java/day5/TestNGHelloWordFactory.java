package day5;

import org.testng.annotations.Test;

public class TestNGHelloWordFactory {
    private  String str;
    public TestNGHelloWordFactory(String str){
        this.str = str;
    }

    @Test
    public void test(){
        System.out.println("TestNGHelloWordFactory: " +str);
    }

    @Test(dependsOnMethods = "test")
    public void test1(){
        System.out.println("TestNGHelloWordFactory1: " +str);
    }
}
