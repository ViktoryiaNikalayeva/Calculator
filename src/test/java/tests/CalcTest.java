package tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Calc;

public class CalcTest {

    Calc calc = new Calc();

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("@AfterMethod");
    }

}