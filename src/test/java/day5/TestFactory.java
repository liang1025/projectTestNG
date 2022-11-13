package day5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class TestFactory {

    @Factory(dataProvider = "n")
    public Object[] test(int n){
        Object[] object = new Object[n];
        for(int i=0;i<n;i++) {
            TestNGHelloWordFactory helloWordFactory = new TestNGHelloWordFactory(i+"");
            object[i] = helloWordFactory;
        }
        return object;
    }

    @DataProvider(name = "n")
    public Object[][] num(){
        return new Object[][]{new Object[]{3}};
    }
}
