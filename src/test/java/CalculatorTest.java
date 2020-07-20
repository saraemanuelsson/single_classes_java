import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(5, calculator.add(2, 3));
    }
//
//    @Test
//    public void canSubtract() {
//        assertEquals(1, calculator.subtract(4, 3));
//    }
//
//    @Test
//    public void canMultiply() {
//        assertEquals(15, calculator.multiply(3, 5));
//    }
//
//    @Test
//    public void canDivide() {
//        assertEquals(2.5, calculator.divide(5, 2));
//    }
}
