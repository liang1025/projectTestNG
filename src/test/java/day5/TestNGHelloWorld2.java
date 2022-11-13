package day5;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNGHelloWorld2 {

    @BeforeClass
    public void bfClass() {
        long id = Thread.currentThread().getId();
        System.out.println("TestNGHelloWorld2 BeforeClass threadId: "+id);
    }

    @Test
    public void test() {
        long id = Thread.currentThread().getId();
        System.out.println("TestNGHelloWorld2 Test threadId: "+id);
    }

    @AfterClass
    public void afClass() {
        long id = Thread.currentThread().getId();
        System.out.println("TestNGHelloWorld2 AfterClass threadId: "+id);
    }
}
