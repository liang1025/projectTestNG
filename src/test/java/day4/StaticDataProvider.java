package day4;

import org.testng.annotations.DataProvider;

public class StaticDataProvider {
    @DataProvider(name = "create")
    public static Object[][] createData() {
        return new Object[][] {
                new Object[] { new String("温一壶清酒 博客园") }
        };
    }
}
