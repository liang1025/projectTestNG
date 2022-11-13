package day5;

import org.testng.annotations.*;

import java.lang.reflect.Method;


public class TestNGHelloWorld1 {

    @BeforeClass
    public void bfClass() {
        long id = Thread.currentThread().getId();
        System.out.println(this.toString() + " " + "TestNGHelloWorld1 BeforeClass threadId: "+id);
    }

    @Test
    public void test() {
        long id = Thread.currentThread().getId();
        System.out.println(this.toString() + " " + "TestNGHelloWorld1 Test threadId: "+id);
    }

    @Test
    public void test1() {
        long id = Thread.currentThread().getId();
        System.out.println(this.toString() + " " + "TestNGHelloWorld1 Test1 threadId: "+id);
    }

    @AfterClass
    public void afClass() {
        long id = Thread.currentThread().getId();
        System.out.println(this.toString() + " " + "TestNGHelloWorld1 AfterClass threadId: "+id);
    }
}
