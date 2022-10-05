package day2;

import org.testng.annotations.*;

@Test(groups = "uat")
public class TestNGHelloWorld {
    @BeforeSuite(groups = "bfSuite")
    public void bfSuite() {
        System.out.println("This is BeforeSuite");
    }

    @BeforeClass(enabled = true)
    public void bfClass() {
        System.out.println("This is BeforeClass");
    }

    @BeforeTest(dependsOnGroups = "bfSuite")
    public void bfTest() {
        System.out.println("This is BeforeTest");
    }

    @BeforeGroups(groups = "uat")
    public void bfGroup() {
        System.out.println("This is BeforeGroups");
    }

    @BeforeMethod(alwaysRun = true,dependsOnGroups = "bfSuite")//依赖bfSuite组,alwaysRun
    public void bfMethod(){
        System.out.println("This is BeforeMethod!");
    }

    @Test
    public void helloWorldTest01(){
        System.out.println("This is Test01!");
    }

    @Test
    public void helloWorldTest02(){
        System.out.println("This is Test02!");
    }

    @AfterSuite
    public void afSuite(){
        System.out.println("This is AfterSuite!");
    }

    @AfterClass()
    public void afClass(){
        System.out.println("This is AfterClass!");
    }

    @AfterTest
    public void afTest(){
        System.out.println("This is AfterTest!");
    }

    @AfterGroups(groups = "uat")
    public void afGroups(){
        System.out.println("This is AfterGroups!");
    }

    @AfterMethod
    public void afMethod(){
        System.out.println("This is AfterMethod!");
    }

}
