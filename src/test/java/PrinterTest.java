import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(20);
    }

    @Test
    public void hasPaper() {
        assertEquals(20, printer.getPaper());
    }

    @Test
    public void canPrint() {
        printer.print(2, 4);
        assertEquals(12, printer.getPaper());
    }

    @Test
    public void wontPrintIfNotEnoughPaper() {
        printer.print(10, 10);
        assertEquals(20, printer.getPaper());
    }
}
