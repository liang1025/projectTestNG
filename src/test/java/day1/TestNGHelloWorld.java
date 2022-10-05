package day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGHelloWorld {
    @BeforeClass
    public void setUp(){
        System.out.println("setUp前置运行");
    }

    @Test
    public void testCase01() {
        System.out.println("testCase01测试用例");
    }

    @Test
    public void testCase02() {
        System.out.println("testCase02测试用例");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("tearDown后置处理");
    }

}
