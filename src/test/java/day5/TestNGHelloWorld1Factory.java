package day5;

import org.testng.annotations.Factory;

public class TestNGHelloWorld1Factory {
    @Factory
    public Object[] testHelloWorld1() {
        Object[] objects = new Object[3];
        for (int i=0;i<3;i++){
            objects[i] = new TestNGHelloWorld1();
        }
        return objects;
    }
}
