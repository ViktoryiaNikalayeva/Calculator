package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Calc;


@Listeners(testng.TestListener.class)
public class DivisionTest extends CalcTest {

    @Test(description = "Check that division is correct")
    public void testDiv() throws Exception {
        Assert.assertEquals(5, calc.div(10, 2));
    }

    @DataProvider(name = "Division")
    public Object[][] dataProvider() {
        return new Object[][]{
                {100, 10, 10},
                {2, 2, 1},
                {0, 1, 0}
        };
    }

    @Test(dataProvider = "Division")
    public void testDivMethod(int a, int b, int result) {
        Calc calculator = new Calc();
        Assert.assertEquals(calc.div(a, b), result);
    }
}
