package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Calc;

public class MultiplicationTest extends CalcTest {

    @Test (priority = 1, invocationCount =66 , threadPoolSize = 22)
    public void testMult() throws Exception {
        Assert.assertEquals(6, calc.mult(2,3));
    }

    @DataProvider(name = "Multiplication")
    public Object[][] dataProvider() {
        return new Object[][] {
                { 2, 5, 10 },
                { 3, 7, 21 },
                { 4, -5, -20 },
                {-3, -2, 6}
        };
    }

    @Test(dataProvider = "Multiplication")
    public void testMultMethod(int a, int b, int result) {
        Calc calculator = new Calc();
        Assert.assertEquals(calc.mult(a, b), result);
    }

}
