package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Calc;

public class SubtractionTest extends CalcTest {

    @Test (priority = 2, retryAnalyzer = RetryAnalyzer.class)
    public void testSub() throws Exception {
        Assert.assertEquals(-1, calc.sub(2,3));
    }

    @DataProvider(name = "Subtraction")
    public Object[][] dataProvider() {
        return new Object[][]{
                {100, 10, 90},
                {2, 0, 2},
                {1, 5, -4}
        };
    }

    @Test(dataProvider = "Subtraction")
    public void testSubMethod(int a, int b, int result) {
        Calc calculator = new Calc();
        Assert.assertEquals(calc.sub(a, b), result);
    }
}