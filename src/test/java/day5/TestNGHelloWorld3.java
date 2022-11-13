package day5;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNGHelloWorld3 {

    @BeforeClass
    public void bfClass() {
        long id = Thread.currentThread().getId();
        System.out.println("TestNGHelloWorld3 BeforeClass threadId: "+id);
    }

    @Test
    public void test() {
        long id = Thread.currentThread().getId();
        System.out.println("TestNGHelloWorld3 Test threadId: "+id);
    }

    @AfterClass
    public void afClass() {
        long id = Thread.currentThread().getId();
        System.out.println("TestNGHelloWorld3 AfterClass threadId: "+id);
    }
}
