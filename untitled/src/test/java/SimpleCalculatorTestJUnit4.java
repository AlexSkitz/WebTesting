import org.junit.Assert;
import org.junit.Test;

public class SimpleCalculatorTestJUnit4 {

    @Test
    public void add() {
        SimpleCalculator calculator = new SimpleCalculator();
        int expected = 4;
        int result = calculator.add(2,2);
        Assert.assertEquals(expected,result);
    }
}