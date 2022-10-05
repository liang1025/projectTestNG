package day2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Car {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Car BeforeClass");
    }

    @Test
    public void carTest() {
        System.out.println("Car Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Car AfterClass");
    }
}
