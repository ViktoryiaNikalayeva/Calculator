package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Calc;

public class AdditionTest extends CalcTest{

    @Test (priority = 1, retryAnalyzer = RetryAnalyzer.class)
    public void testSum() throws Exception {
        Assert.assertEquals(5, calc.sum(2,3));
        Assert.assertEquals(8, calc.sum(4,4));
    }

    @DataProvider(name = "AdditionTest")
    public Object[][] dataProvider() {
        return new Object[][] {
                { 2, 5, 7 },
                { 3, 7, 10 },
                { 4, 5, 9 }
        };
    }

    @Test(dataProvider = "AdditionTest")
    public void testSumMethod(int a, int b, int result) {
        Calc calculator = new Calc();
        Assert.assertEquals(calc.sum(a, b), result);
    }

}
