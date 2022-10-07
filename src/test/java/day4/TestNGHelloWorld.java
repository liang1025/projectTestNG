package day4;

import org.testng.annotations.*;

import java.lang.reflect.Method;


public class TestNGHelloWorld {

    @DataProvider(name = "test1")
    public Object[][] createData(Method method) {
        Object[][] objects;
        if (method.getName().equals("helloWorldTest01")) {
            objects = new Object[][] {
                    {"helloWorldTest01",1},{"helloWorldTest01",2}
            };
        }else if (method.getName().equals("helloWorldTest02")) {
            objects = new Object[][] {
                    {"helloWorldTest02",1},{"helloWorldTest02",2}
            };
        }else {
            objects = new Object[][] {
                    {"helloWorldTest03",1},{"helloWorldTest03",2}
            };
        }

        return objects;
    }

    @BeforeTest
    public void bfTest() {
        System.out.println("This is BeforeTest");
    }


    @Test(dataProvider = "test1")
    public void helloWorldTest01(String str,int num){
        System.out.println("This is Test01!" + str + "," + num);
    }

    @Test(dataProvider = "test1")
    public void helloWorldTest02(String str,int num){
        System.out.println("This is Test02!" + str + "," + num);
    }

    @Test(dataProvider = "test1")
    public void helloWorldTest03(String str,int num){
        System.out.println("This is Test03!" + str + "," + num);
    }

    @AfterTest
    public void afTest(){
        System.out.println("This is AfterTest!");
    }
}
