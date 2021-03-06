import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(20, 50);
    }

    @Test
    public void hasPaper() {
        assertEquals(20, printer.getPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(50, printer.getToner());
    }

    @Test
    public void canPrint() {
        printer.print(2, 4);
        assertEquals(12, printer.getPaper());
        assertEquals(42, printer.getToner());
    }

    @Test
    public void wontPrintIfNotEnoughPaper() {
        printer.print(10, 10);
        assertEquals(20, printer.getPaper());
        assertEquals(50, printer.getToner());
    }

    @Test
    public void wontPrintIfNotEnoughToner() {
        Printer lowMagenta = new Printer(50, 4);
        lowMagenta.print(4, 3);
        assertEquals(50, lowMagenta.getPaper());
        assertEquals(4, lowMagenta.getToner());
    }

}
