import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * Created by Victor_Komlev on 5/4/2017.
 */
public class main {

    @BeforeMethod
    public  void before() {
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public  void after() {
        System.out.println("AfterMethod");
    }

    @BeforeTest
    public  void beforeTest () {
        System.out.println("BeforeTest");
    }


   @AfterTest
    public  void afterTest () {
        System.out.println("aftereTest");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }


    @Test
    public void test1() {
        System.out.println("Test1");
    }

}
