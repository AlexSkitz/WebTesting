import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleCalculatorTestTestNG {

    @Test
    public void testAdd() {
        SimpleCalculator calculator = new SimpleCalculator();
        int expected = 4;
//        int result = calculator.add(2,2);
//        Assert.assertEquals(expected,result);
    }
}