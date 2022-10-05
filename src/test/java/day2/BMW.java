package day2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class BMW extends Car{
    @Test
    public void BMWTest() {
        System.out.println("BMW Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("BMW AfterClass");
    }
}
